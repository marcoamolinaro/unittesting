package com.scm.unittesting.unittesting.business;

import java.util.Arrays;

import com.scm.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessimpl {
	
	private SomeDataService someDataService;
	
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSum(int[] data) {
		return Arrays.stream(data).reduce(Integer::sum).orElse(0);
	}
	
	public int calculateSumUsingSomeDataService() {
		int sum = 0;
		int[] data = someDataService.retrieveAllData();
		
		for (int value:data) {
			sum += value;
		}
		return sum;
	}

}
