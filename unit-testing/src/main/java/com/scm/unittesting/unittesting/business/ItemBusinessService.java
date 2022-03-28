package com.scm.unittesting.unittesting.business;

import org.springframework.stereotype.Component;

import com.scm.unittesting.unittesting.model.Item;

@Component
public class ItemBusinessService {

	public Item retrieveHardcodedItem() {
		return new Item(1, "Ball", 10, 100);
	}

}
