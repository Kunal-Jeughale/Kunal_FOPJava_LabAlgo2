package com.gl.main;

import java.util.Scanner;
import com.gl.service.Transaction;

public class Main {

	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size = sc.nextInt();
		System.out.println("enter the values of array");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the total no of targets that needs to be achieved");
		int noOfTarget = sc.nextInt();
		for (int i = 0; i < noOfTarget; i++) {
			System.out.println("enter the value of target");
			int value = sc.nextInt();
			transaction.isTransAchievable(value,arr);
		}
		
		
	}
}
