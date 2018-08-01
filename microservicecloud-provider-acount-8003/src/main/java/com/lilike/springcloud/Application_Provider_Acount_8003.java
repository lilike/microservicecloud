package com.lilike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 本服务启动后会自动注册到Eureka的服务中
public class Application_Provider_Acount_8003 {

	public static void main(String[] args) {
		SpringApplication.run(Application_Provider_Acount_8003.class, args);
	}
	
}