package com.srikanth.collection;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.set(0, "Jack");

		System.out.println(list);
		list.remove(1);
		System.out.println(list);

	}
}
