package com.srikanth.abstaraction;

abstract class Animal {
	Animal() {
		System.out.println("Animal constructor called");
	}

	static void get() {
		System.out.println("Hi");
	}

	final void gee() {
		System.out.println("Final");
	}
}

class Dog extends Animal {
	Dog() {
		System.out.println("Dog constructor called");
	}

}

public class Main {
	public static void main(String[] args) {
		
		String s="srikanth";
		s= s.concat("krishtam");
		System.out.println(s);
		
		
		Animal dog = new Dog();
		dog.get();
		dog.gee();
		// Output:
		// Animal constructor called
		// Dog constructor called
	}
}
