package com.lilike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 本服务启动后会自动注册到Eureka的服务中
@EnableCircuitBreaker // 启动Hystrix熔断器
public class Application_Provider_Hystrix_Acount_8001 {

	public static void main(String[] args) {
		SpringApplication.run(Application_Provider_Hystrix_Acount_8001.class, args);
	}
	
}