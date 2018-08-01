package com.lilike.springcloud.cfgbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;

/** boot --- > spring application.xml ---- @Configuration配置  == application.xml */
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced // SpringCloud Ribbon 是基于Netflix Ribbon实现的一套客户端负载均衡工具
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
//	@Bean
//	public IRule myRule () {
//		
//		return new RetryRule();
//	}
	
}

/**
 * @Bean
 * public UserServiceImpl getUserServiceImpl() {
 * 		return new UserServiceImpl();
 * }
 * 
 * application.xml == ConfigBean(@Confuguration)
 * <bean id = "userService" class="com.lilike.springcloud.service.impl.UserServiceImpl">
 */


