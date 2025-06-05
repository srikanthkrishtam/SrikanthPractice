package com.srikanth.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyStringFromList {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("Grapes", "Apple", "Banana", "Apple");
		Map<String, Long> m = l.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(m.entrySet().stream().filter(ll -> ll.getValue() > 1).map(n -> n.getKey())
				.collect(Collectors.toList()));

		System.out.println(m);

		
	}
}
