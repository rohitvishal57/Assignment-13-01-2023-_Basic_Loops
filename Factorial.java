package com.monocept.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int result = factorial(num);
		System.out.println("Factorial is : " + result);

	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub
		int fact = 1;
		for (int i = 1; i <= num; ++i) {
			fact = fact * i;
		}

		return fact;
	}

}
