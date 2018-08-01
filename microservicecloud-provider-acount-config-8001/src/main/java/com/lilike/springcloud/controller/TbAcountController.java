package com.lilike.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lilike.springcloud.entity.TbAcount;
import com.lilike.springcloud.service.TbAcountService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 前后端分离
 * 微服务的提供者
 * @author lyric
 *
 */
@RestController
public class TbAcountController {

	@Autowired
	private TbAcountService service;
	
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value="/acount/add", method = RequestMethod.POST)
	public void insertAcount(@RequestBody TbAcount bean) {
		service.insertAcount(bean);
	}
	
	@RequestMapping(value="/acount/findAll")
	@HystrixCommand
	public List<TbAcount> findAll() {
		return service.findAll();
	}
	
	@RequestMapping(value = "/acount/discovery", method = RequestMethod.GET)
	public Object discovery() {
		List<String> list = client.getServices();
		System.out.println("**********" + list);

		List<ServiceInstance> srvList = client.getInstances("microservicecloud-acount");
		for (ServiceInstance element : srvList) {
			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
					+ element.getUri());
		}
		return this.client;
	}
	
}
