package com.srikanth.javaOops;

class OuterClass {
	int x = 10;

	class InnerClass {
		int y;
		public int myInnerMethod() {
			 y=9;
			return x+y;
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.myInnerMethod());
	}
}
