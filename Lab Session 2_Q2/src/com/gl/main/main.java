package com.gl.main;

import java.util.Scanner;

import com.gl.service.Transaction;

public class main {

	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int sizeOfCurrency = sc.nextInt();
		System.out.println("enter the currency denominations value");
		int[] arr = new int[sizeOfCurrency];
		for (int i = 0; i < sizeOfCurrency; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		transaction.bubbleSort(arr);
		transaction.noOfNotes(arr,amount);
		sc.close();
		
		
	}
}
