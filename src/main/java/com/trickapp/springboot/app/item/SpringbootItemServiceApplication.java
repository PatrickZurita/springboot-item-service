package com.trickapp.springboot.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@RibbonClient(name = "products-service")
@EnableFeignClients
@SpringBootApplication
@ComponentScan(basePackages = "com.trickapp.springboot.app.item.clients")
@ComponentScan(basePackages = "com.trickapp.springboot.app.item.models")
@ComponentScan(basePackages = "com.trickapp.springboot.app.item.models.service")
public class SpringbootItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootItemServiceApplication.class, args);
	}

}
