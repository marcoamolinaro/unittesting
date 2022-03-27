package com.scm.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.scm.unittesting.unittesting.data.SomeDataService;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockTest {

	@InjectMocks
	SomeBusinessimpl business;
	
	@Mock
	SomeDataService dataServiceMock;
	
	@Test
	void calculateSumUsingSomeDataService_basic() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		assertEquals(6, business.calculateSumUsingSomeDataService());
	}

	@Test
	void calculateSumUsingSomeDataService_empty() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(0, business.calculateSumUsingSomeDataService());
	}

	@Test
	void calculateSumUsingSomeDataService_oneValue() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
		assertEquals(5, business.calculateSumUsingSomeDataService());
	}

}
