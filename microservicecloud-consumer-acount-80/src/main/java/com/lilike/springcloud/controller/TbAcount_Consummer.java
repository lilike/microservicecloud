package com.lilike.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lilike.springcloud.entity.TbAcount;
import com.netflix.discovery.converters.Auto;

/**
 * 消费者
 * 里面不应该有Service层
 * 模拟Controller层通过RestTemplate进行Rest的调用
 * @author lyric
 *
 */
@RestController
public class TbAcount_Consummer {

	
//	private static final String REST_URL_PREFIX="http://localhost:8001";
	private static final String REST_URL_PREFIX="http://microservicecloud-acount";
	
	
	/** 提供了多种边界访问远程Htpp服务的方法
	 *  是一种简便的访问restful服务模板类
	 *  是Spring提供的用于访问Rest服务的客户端模板工具集
	 *  */
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * url requestMap ResponseBean.class 这三个参数代表
	 * 请求地址,请求参数,Http响应转换成对象类型
	 * @return 
	 */
	@RequestMapping(value="/comsumer/acount/add")
	public void add(TbAcount acount) {
		restTemplate.postForObject(REST_URL_PREFIX + "/acount/add", acount, Void.class);
	}
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/comsumer/acount/list")
	public List<TbAcount> list() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/acount/findAll", List.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/comsumer/acount/discovery")
	public Object acountDiscovery() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/acount/discovery", Object.class);
	}
	
	
	
	
}
