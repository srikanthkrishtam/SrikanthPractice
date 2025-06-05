package com.srikanth.allPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FrequencyArrayCount {
	private static void duplicateArray(int[] duplicate) {

		List l = new ArrayList<>();
		for (int i = 0; i < duplicate.length; i++) {
			for (int j = i + 1; j < duplicate.length; j++) {
				if (duplicate[i] == duplicate[j]) {
					l.add(duplicate[i]);
					break;
				}
			}
		}

		System.out.println("***************duplicateArray**************" + l);

	}

	private static void UniqueArray(int[] duplicate) {

		HashSet hs = new HashSet();
		for (int i : duplicate) {
			hs.add(i);
		}
		System.out.println("UniqueArray:::::::" + hs);
		// *************************************************************
		List<Integer> a = Arrays.stream(duplicate).boxed().distinct().collect(Collectors.toList());
		System.out.println("UniqueArray:::::::" + a);

	}

	public static void main(String[] args) {
//		duplicateArray(new int[] { 1, 3, 5,1,3, 7, 9 });
		UniqueArray(new int[] { 1, 3, 5, 1, 3, 7, 9 });
	}

}
