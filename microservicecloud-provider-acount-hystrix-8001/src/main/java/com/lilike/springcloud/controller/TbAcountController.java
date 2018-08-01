package com.lilike.springcloud.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lilike.springcloud.entity.TbAcount;
import com.lilike.springcloud.service.TbAcountService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sun.tools.extcheck.Main;

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
	
	private static final Random random = new Random();
	
	
	@RequestMapping(value="/acount/findAll")
	// 如果在调用这个方法出现异常之后,会快速调用processHystrix_GET,返回需要的值
	@HystrixCommand(fallbackMethod="processHystrix_GET") 
	public List<TbAcount> findAll() {
		 List<TbAcount> list = service.findAll();
	
		 // 随机出现错误
		 if (random.nextInt(2) == 1) {
			 throw new RuntimeException("出现随机错误了");
		 }
		 
		 return list;
	}

	public List<TbAcount> processHystrix_GET(){
		List<TbAcount> list = new ArrayList<TbAcount>();
		TbAcount tb = new TbAcount();
		tb.setMoney(404);
		tb.setUsername("哈哈哈,我是BUG,GOOD MORNING!");
		list.add(tb);
		return list;
	}
	
	
}
