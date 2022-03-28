package com.scm.unittesting.unittesting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scm.unittesting.unittesting.business.ItemBusinessService;
import com.scm.unittesting.unittesting.model.Item;

@RestController
public class ItemController {
	
	@Autowired
	private ItemBusinessService businessService;
	
	@GetMapping("/dummy-item")
	public Item dummyItem() {
		return new Item(1, "Ball", 10, 100);
	}
	
	@GetMapping("/item-from-business-service")
	public Item ItemFromBusinessService() {
		return businessService.retrieveHardcodedItem();
	}
	
	@GetMapping("/all_items_from_database")
	public List<Item> retrieveAllItems() {
		return businessService.retrieveAllItems();
	}

}
