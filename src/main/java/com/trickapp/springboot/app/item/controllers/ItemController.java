package com.trickapp.springboot.app.item.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.trickapp.springboot.app.item.models.Item;
import com.trickapp.springboot.app.item.models.service.ItemService;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;

	@GetMapping("/getAll")
	public List<Item> getAll() {
		return itemService.findAll();
	}

	@GetMapping("/getById/{id}/quantity/{quantity}")
	public Item getById(@PathVariable Long id, @PathVariable Integer quantity) {
		return itemService.findById(id, quantity);
	}

}
