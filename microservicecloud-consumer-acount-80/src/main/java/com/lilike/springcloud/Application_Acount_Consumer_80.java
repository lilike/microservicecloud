package com.lilike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.lilike.myrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
// 在启动该服务的时候去加载我们自定义的Ribbon配置类,使得配置类生效
@RibbonClient(name="microservicecloud-acount",configuration=MySelfRule.class)
public class Application_Acount_Consumer_80 {

	public static void main(String[] args) {
		SpringApplication.run(Application_Acount_Consumer_80.class, args);
	}
	
}