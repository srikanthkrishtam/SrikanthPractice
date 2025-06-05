package com.srikanth.test;

public class DerivedInher extends BaseInher{


	public int getA() {
		System.out.println("00==="+super.getA());
		return 20;
	}
	
	
	public static void main(String k[]) {
		BaseInher d=new DerivedInher();
		System.out.println(d.getA());
	}
	
}
