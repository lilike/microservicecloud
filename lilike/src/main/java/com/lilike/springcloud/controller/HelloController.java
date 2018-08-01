package com.lilike.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/wx")
	public String sayHello(String signature,String timestamp,String nonce,String echostr) {
		
		System.err.println(signature);
		System.err.println(timestamp);
		System.err.println(nonce);
		System.err.println(echostr);
		
		
		return echostr;
	}
	
	
}
