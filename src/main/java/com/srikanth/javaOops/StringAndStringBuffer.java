package com.srikanth.javaOops;

public class StringAndStringBuffer {
	public static void main(String[] args) {
		//StringConcept();
		StringBufferConcept();
	}

	public static void StringConcept() {
		String s = new String("sri");
		s.concat("kanth");
		System.out.println("********String Immutable******" + s);
		s = s.concat("kanth");
		System.out.println("**********string ******" + s);
	}

	public static void StringBufferConcept() {
		StringBuffer sb=new StringBuffer("sri");
		sb.append("kanth");
		System.out.println("*************StringBuffer Mutable ******"+sb);
	}
}
