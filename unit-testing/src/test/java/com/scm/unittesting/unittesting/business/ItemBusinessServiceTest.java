package com.scm.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.scm.unittesting.unittesting.model.Item;
import com.scm.unittesting.unittesting.repositories.ItemRepository;

@ExtendWith(MockitoExtension.class)
public class ItemBusinessServiceTest {

	@InjectMocks
	private ItemBusinessService business;
	
	@Mock
	private ItemRepository repository;
	
	@Test
	public void calculateSumUsingSomeDataService_basic() {
		
		when(repository.findAll()).thenReturn(
				Arrays.asList(new Item (2, "Item2", 10, 10),
				new Item (3, "Item3", 20, 20))
				);
		
		List<Item> items = business.retrieveAllItems();
		
		assertEquals(100, items.get(0).getValue());
		assertEquals(400, items.get(1).getValue());
	}

//	@Test
//	public void calculateSumUsingSomeDataService_empty() {
//		
//		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
//		assertEquals(0, business.calculateSumUsingSomeDataService());
//	}
//
//	@Test
//	public void calculateSumUsingSomeDataService_oneValue() {
//		
//		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
//		assertEquals(5, business.calculateSumUsingSomeDataService());
//	}

}
