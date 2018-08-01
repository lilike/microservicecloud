package com.lilike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient // 本服务启动后会自动注册到Eureka的服务中
@EnableCircuitBreaker // 启动Hystrix熔断器
@EnableZuulProxy
public class Application_Zuul_9527 {
	public static void main(String[] args) {
		SpringApplication.run(Application_Zuul_9527.class, args);
	}
	
}