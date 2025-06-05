package com.srikanth.dto;

public class DerivedInher extends BaseInher{


	public int getA() {
		System.out.println("00==="+super.a);
		return 20;
	}
	
	
	public static void main(String k[]) {
		DerivedInher d=new DerivedInher();
		System.out.println(d.getA());
	}
	
}
