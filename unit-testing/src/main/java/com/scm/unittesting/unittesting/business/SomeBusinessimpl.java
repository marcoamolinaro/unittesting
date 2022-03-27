package com.scm.unittesting.unittesting.business;

public class SomeBusinessimpl {
	public int calculateSum(int[] data) {
		int sum = 0;
		for (int value:data) {
			sum += value;
		}
		return sum;
	}
}
