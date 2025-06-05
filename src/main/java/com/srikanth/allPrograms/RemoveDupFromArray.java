package com.srikanth.allPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupFromArray {

	public static void removeDupFromArray(int[] a) {

		Set hashSet = new HashSet<>();
		for (Integer i : a) {
			hashSet.add(i);
		}
		System.out.println(hashSet);
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 16, 13, 2 };

		removeDupFromArray(a);
	}
}
