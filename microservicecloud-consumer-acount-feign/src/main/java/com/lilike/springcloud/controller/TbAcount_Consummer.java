package com.lilike.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lilike.springcloud.entity.TbAcount;
import com.lilike.springcloud.service.AcountClientService;


/**
 * 消费者
 * 里面不应该有Service层
 * 使用了Feign之后,我们依然是面向接口编程
 * @author lyric
 *
 */
@RestController
public class TbAcount_Consummer {

	@Autowired
	private AcountClientService service;
	
	@RequestMapping(value="/comsumer/acount/add")
	public void add(TbAcount acount) {
		service.insertAcount(acount);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/comsumer/acount/list")
	public List<TbAcount> list() {
		return service.findAll();
	}
	
}
