package com.lilike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Application_Configer_Server_3344 {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application_Configer_Server_3344.class, args);
	}
	
}
