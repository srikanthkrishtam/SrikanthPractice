package com.srikanth.javaOops;

interface NewInterface {

	public default void defaultMethod() {
		System.out.println("NewInterface.defaultMethod()");
	}

	void overrideMethod(String str);
	static void print() {
		System.out.println("NewInterface.print() 1");
	}
}

interface NewInterface2 {

	static void print() {
		System.out.println("NewInterface.print() 2");
	}
	public default void defaultMethod() {
		System.out.println("NewInterface.defaultMethod2()");
	}

}


//Implementation Class
public class StaticDefault implements NewInterface,NewInterface2{

	@Override
	public void overrideMethod(String str) {
		System.out.println("StaticDefault.overrideMethod()"+str);
	}
	


	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		NewInterface2.super.defaultMethod();
	}



	public static void main(String[] args) {
		NewInterface2 s = new StaticDefault();
		//s.overrideMethod("Raghu");
		s.defaultMethod();
		NewInterface2.print();

	}



	

}
