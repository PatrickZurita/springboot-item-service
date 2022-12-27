package com.trickapp.springboot.app.item;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	@Bean("restClient")
	@LoadBalanced
	public RestTemplate registerRestTemplate() { // HTTP client to access other microservices
		return new RestTemplate();
	}
}
