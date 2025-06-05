package com.srikanth.test;

import net.bytebuddy.implementation.bind.annotation.Super;

public class MethodOverridingChaild extends MethodOverridingParent {
  
	   void run() {
		super.run();
		System.out.println("MethodOverridingChaild.run()");
	}
}
