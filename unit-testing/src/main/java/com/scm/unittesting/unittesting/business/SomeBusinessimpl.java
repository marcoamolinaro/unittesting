package com.scm.unittesting.unittesting.business;

import com.scm.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessimpl {
	
	private SomeDataService someDataService;
	
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSum(int[] data) {
		int sum = 0;
		for (int value:data) {
			sum += value;
		}
		return sum;
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
