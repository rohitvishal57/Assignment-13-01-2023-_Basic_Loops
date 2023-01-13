package com.monocept.test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter a number n upto which you want to print Fibonacci Numbers : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 0 , n2 = 1;
		System.out.println("First " +n +" Fibonacci numbers are : ");
		System.out.print(n1 +" "+n2);
		for(int i = 2 ; i < n ; ++i) {
			int n3 = n1 + n2;
			System.out.print(" "+n3);    
			n1=n2;    
			n2=n3;  
		}

	}

}
