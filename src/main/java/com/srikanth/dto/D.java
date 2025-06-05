package com.srikanth.dto;

import java.lang.reflect.Constructor;

public class D extends C implements Cloneable{
	public void get() {
//		super.a=109;
		System.out.println("D.get()");
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		 D d=new  D();
		 D d3=null;
		 try {
			D d2= D.class.newInstance();
			 d3=(D) d2.clone();
			 d3.a=9;
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 d.a=10;
		 System.out.println("D.main()"+ d3.a);
	}

}
