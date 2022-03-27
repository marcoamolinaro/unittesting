package com.scm.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessTest {

	@Test
	void calculateSum_basic() {
		
		SomeBusinessimpl business = new SomeBusinessimpl();
		int actualResult = business.calculateSum(new int[] {1,2,3});
		int excpectResult = 6;
		assertEquals(excpectResult, actualResult);
	}

	@Test
	void calculateSum_empty() {
		
		SomeBusinessimpl business = new SomeBusinessimpl();
		int actualResult = business.calculateSum(new int[] {});
		int excpectResult = 0;
		assertEquals(excpectResult, actualResult);
	}

	@Test
	void calculateSum_oneValue() {
		
		SomeBusinessimpl business = new SomeBusinessimpl();
		int actualResult = business.calculateSum(new int[] { 5 });
		int excpectResult = 5;
		assertEquals(excpectResult, actualResult);
	}

}
