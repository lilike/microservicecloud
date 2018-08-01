package com.lilike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages={"com.lilike.springcloud"})
@ComponentScan("com.lilike.springcloud")
public class Application_Acount_Consumer_Feign_80 {

	public static void main(String[] args) {
		SpringApplication.run(Application_Acount_Consumer_Feign_80.class, args);
	}
	
}