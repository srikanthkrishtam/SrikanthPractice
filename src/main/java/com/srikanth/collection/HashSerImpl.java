package com.srikanth.collection;

import java.util.HashSet;

public class HashSerImpl {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		set.add(null);
		System.out.println(set);
	}
}
