package com.lilike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient // 本服务启动后会自动注册到Eureka的服务中
@EnableDiscoveryClient // 服务发现
@EnableHystrix
public class Application_Provider_Acount_Config_8001 {

	public static void main(String[] args) {
		SpringApplication.run(Application_Provider_Acount_Config_8001.class, args);
	}
	
}