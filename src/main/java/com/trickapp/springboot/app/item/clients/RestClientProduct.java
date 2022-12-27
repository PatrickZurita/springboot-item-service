package com.trickapp.springboot.app.item.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.trickapp.springboot.app.item.models.Product;

@FeignClient(name = "products-service")
public interface RestClientProduct {
	
	@GetMapping("/getAll")
	public List<Product> getAll();
	
	@GetMapping("/getById/{id}")
	public Product getById(@PathVariable Long id);
}
