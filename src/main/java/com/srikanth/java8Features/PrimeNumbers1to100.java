package com.srikanth.java8Features;

public class PrimeNumbers1to100 {

	 public static void main(String[] args) {
	        System.out.println("Prime numbers from 1 to 100:");
	        for (int number = 2; number <= 10; number++) {
	            if (isPrime(number)) {
	                System.out.print(number + " ");
	            }
	        }
	    }

	    private static boolean isPrime(int number) {
	        if (number <= 1) {
	        	System.out.println("PatientConsultation.isPrimesssss()");
	            return false;
	        }
	        for (int i = 2; i <= number / 2; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
}
