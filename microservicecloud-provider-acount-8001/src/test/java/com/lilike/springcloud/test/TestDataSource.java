package com.lilike.springcloud.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lilike.springcloud.Application_Provider_Acount_8001;
import com.lilike.springcloud.service.TbAcountService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application_Provider_Acount_8001.class)
public class TestDataSource {

	@Autowired
	private TbAcountService service;
	
	@Test
	public void test001() throws Exception {
		System.out.println(service.findAll());
	
	}
	
	
	
}
