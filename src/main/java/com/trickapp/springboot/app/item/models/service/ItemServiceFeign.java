package com.trickapp.springboot.app.item.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trickapp.springboot.app.item.clients.RestClientProduct;
import com.trickapp.springboot.app.item.models.Item;

@Service("serviceFeign")
public class ItemServiceFeign implements ItemService {
	
	@Autowired
	private RestClientProduct feignClient;
	
	@Override
	public List<Item> findAll() {
		return feignClient.getAll().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer quantity) {
		return new Item(feignClient.getById(id), quantity);
	}

}
