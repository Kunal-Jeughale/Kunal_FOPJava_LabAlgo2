package com.gl.service;

public class Transaction {
	public void isTransAchievable(int value, int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum >= value) {
				System.out.println("Target achieved after " + (i + 1) + " transactions");
				break;
			}
		}
		if (sum < value) {
			System.out.println("Target not achieved");
		}
	}
}
