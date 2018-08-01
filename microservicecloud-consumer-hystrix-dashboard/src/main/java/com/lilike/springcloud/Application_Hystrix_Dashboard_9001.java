package com.lilike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class Application_Hystrix_Dashboard_9001 {

	public static void main(String[] args) {
		SpringApplication.run(Application_Hystrix_Dashboard_9001.class, args);
	}
	
}