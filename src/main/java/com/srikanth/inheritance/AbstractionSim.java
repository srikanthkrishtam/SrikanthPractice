package com.srikanth.inheritance;

public abstract class AbstractionSim {

	public abstract void sendMsg();
	
	public AbstractionSim() {
		System.out.println("AbstractionSim Constructor");
	}
	
	static void staticMethod() {
		System.out.println("AbstractionSim static");
	}
}
