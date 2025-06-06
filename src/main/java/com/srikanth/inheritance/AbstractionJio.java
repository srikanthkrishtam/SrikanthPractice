package com.srikanth.inheritance;

public class AbstractionJio extends AbstractionSim {

	@Override
	public void sendMsg() {

		System.out.println("Send message from JIo");
	}

	static void staticMethod() {
		System.out.println("AbstractionSim static chaildsss");
	}

	public static void main(String[] args) {
		AbstractionSim ab = new AbstractionJio();
		ab.sendMsg();
		ab.staticMethod();
		
		String a = "Java";
		a = a + " Developer";
		
		System.out.println(a);
	}
}
