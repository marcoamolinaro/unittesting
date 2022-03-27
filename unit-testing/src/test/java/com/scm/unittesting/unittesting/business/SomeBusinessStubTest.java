package com.scm.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.scm.unittesting.unittesting.data.SomeDataService;

class SomeDataServiceStub implements SomeDataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {1,2,3};
	}
	
}

class SomeDataServiceEmptyStub implements SomeDataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {};
	}
	
}

class SomeDataServiceOneElementStub implements SomeDataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {};
	}
	
}

class SomeBusinessStubTest {

	@Test
	void calculateSumUsingSomeDataService_basic() {
		
		SomeBusinessimpl business = new SomeBusinessimpl();
		business.setSomeDataService(new SomeDataServiceStub());
		int actualResult = business.calculateSumUsingSomeDataService();
		int excpectResult = 6;
		assertEquals(excpectResult, actualResult);
	}

	@Test
	void calculateSumUsingSomeDataService_empty() {
		
		SomeBusinessimpl business = new SomeBusinessimpl();
		business.setSomeDataService(new SomeDataServiceEmptyStub());
		int actualResult = business.calculateSumUsingSomeDataService();
		int excpectResult = 0;
		assertEquals(excpectResult, actualResult);
	}

	@Test
	void calculateSumUsingSomeDataService_oneValue() {
		
		SomeBusinessimpl business = new SomeBusinessimpl();
		business.setSomeDataService(new SomeDataServiceOneElementStub());
		int actualResult = business.calculateSumUsingSomeDataService();
		int excpectResult = 5;
		assertEquals(excpectResult, actualResult);
	}

}
