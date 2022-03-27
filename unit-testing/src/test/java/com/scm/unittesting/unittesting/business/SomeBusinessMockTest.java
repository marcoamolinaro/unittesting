package com.scm.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import com.scm.unittesting.unittesting.data.SomeDataService;

class SomeBusinessMockTest {

	SomeBusinessimpl business = new SomeBusinessimpl();
	SomeDataService dataServiceMock = mock(SomeDataService.class);
	
	@BeforeEach
	public void before() {
		business.setSomeDataService(dataServiceMock);
	}

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
