package com.ksril;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("1 - Fibonacci Number\n2 - Factorial Number\nEnter Option: ");
		int c = s.nextInt();
		
		switch(c) {
			case 1: 
				System.out.println("Enter Number: ");
				int n = s.nextInt();
				try {
					Fibo f = new Fibo(n);
				    f.start();
				    f.join();
				    System.out.println("Fibonacci Number: " + f.answer);
				}
				catch(Exception e) {
				    System.out.println("Fib NUMBER Error!!");
				}
				break;
			case 2: 
				System.out.println("Enter Number: ");
				int m = s.nextInt();
				try {
					Fac f = new Fac(m);
				    f.start();
				    f.join();
				    System.out.println("Factorial Number: " + f.answer);
				}
				catch(Exception e) {
				    System.out.println("Fac NUMBER Error!!");
				}
				break;
			default:System.out.println("Invalid Option!!");
		}         
	}
}
