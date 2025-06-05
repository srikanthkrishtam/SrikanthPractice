package com.srikanth.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.jsonwebtoken.lang.Collections;

public class RemoveDuplicatesAndSort {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10, 88, 33, 88, 10, 12, 4, 18);
		List<Integer> ll = l.stream().distinct().sorted().collect(Collectors.toList()); // unique elements
		System.out.println(ll);

		// print only non repeating
		List<Integer> non = l.stream().sorted().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet()
				.stream().filter(n -> n.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println(non);

		// find duplicates
		List<Integer> duplicates = l.stream().sorted().collect(Collectors.groupingBy(n -> n, Collectors.counting()))
				.entrySet().stream().filter(n -> n.getValue() >= 2).map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println(duplicates);

		// without streams ffindDuplicates

		findDuplicates();
//		removeDuplicateChars();

		l.stream().collect(Collectors.groupingBy(nn -> nn, Collectors.counting())).entrySet().stream()
				.filter(m -> m.getValue() > 1).collect(Collectors.toList());
	}

	public static void findDuplicates() {
		List<Integer> l = Arrays.asList(10, 88, 33, 88, 10, 12, 4, 18);

		List<Integer> n = new ArrayList<>();
		List<Integer> duple = new ArrayList<>();
		for (int i = 0; i < l.size(); i++) {
			if (n.contains(l.get(i))) {
				duple.add(l.get(i));
			} else {
				n.add(l.get(i));
			}
		}
		System.out.println(duple);
	}

	static void removeDuplicateChars() {
		String name = "my name is srikanth";
		List<Character> l = new ArrayList<>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < name.length(); i++) {
			if (!l.contains(name.charAt(i))) {
				sb.append(name.charAt(i));
				l.add(name.charAt(i));
			}
		}
		System.out.println(sb.toString());


	}
}
