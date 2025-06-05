package com.srikanth.java8Features;

interface NewInterface {

	static void hello() {
		System.out.println("Hello, New Static Method Here");
	}

	public default void defaultMethod() {
		System.out.println("NewInterface.defaultMethod()");
	}

	void overrideMethod(String str);
}

//Implementation Class
public class StaticDefault implements NewInterface {

	public void overrideMethod(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		StaticDefault s = new StaticDefault();
		s.overrideMethod("Raghu");
		NewInterface.hello();
		s.defaultMethod();

	}

}
