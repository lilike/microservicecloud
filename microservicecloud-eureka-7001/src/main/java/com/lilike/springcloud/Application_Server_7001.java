package com.lilike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * Eureka的服务端启动类,接收其他微服务注册进来
 * @author lyric
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class Application_Server_7001 {

	public static void main(String[] args) {
		SpringApplication.run(Application_Server_7001.class, args);
	}
	
}