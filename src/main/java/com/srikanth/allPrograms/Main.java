package com.srikanth.allPrograms;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class Main {
	public static void main(String[] args) {
		System.out.println("Try programiz.pro");
		int ar[] = { 1, 2, 4, 5, 6, 7, 8, 9 };

		int mis = 0;
		int c=1;
		for (int i = 0; i < ar.length; i++) {
			if (c == ar[i]) {
				c ++;
			}else{
				mis =c;
				break;
			}

		}
		System.out.println(mis);

		// new changes from server
	}
}
