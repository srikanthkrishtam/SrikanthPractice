package com.srikanth.java8Features;

import java.util.Iterator;

public class PrimeNumber {

	public static void primeNumber() {
		int num = 5;
		boolean isPrime = true;
		int count = 0;
		for (int i = 2; i < num ; i++) {
			count++;
			System.out.println("PrimeNumber.primeNumber()");
			if (num % i == 0) {
				isPrime = false;
				break;
			}

		}
		if (isPrime) {
			System.out.println(num + " is a prime number.");

		} else {
			System.out.println(num + " is not a prime number.");
		}
	}

	public static void primeNumberFrom1To100() {
		int i, j;
		boolean isPrime;

		// loop through numbers 1 to 100
		for (i = 1; i <= 10; i++) {

			// assume number is prime until proven otherwise
			isPrime = true;

			// loop through potential divisors from 2 to i-1
			for (j = 2; j < i; j++) {
				// if i is divisible by j, then i is not prime
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			// print the prime numbers
			if (isPrime) {
				System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) {
		 primeNumber();
//		primeNumberFrom1To100();
		
	
		
	}
}
