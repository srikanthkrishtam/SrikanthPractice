package com.srikanth.inheritance;

public class Aa extends A {
	void nonGet() {
		System.out.println("Non static Chaild");
	}
	public static void get() {
		System.out.println("static chaild" );
	}
	public static void main(String[] args) {
		A a=new Aa();
		a.nonGet();
		a.get();
	}
}
