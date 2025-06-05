package com.srikanth.java8Features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCountingUsingStream {

	static void duplicateCountUsingStream() {
		String str = "telangana";
		HashMap<Character, Integer> hs = new HashMap<>();
		List<String> asList = Arrays.asList(str.split(""));

		Map<Object, Long> output = asList.stream().collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

		System.out.println("HelloWorld.main()" + output);
		Map<String, Long> collect = asList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect.get("a"));
	}

	static void duplicateCountUsingWithOutStream() {

		String name = "srikanthkrishtam";
		char c[] = name.toCharArray();
		HashMap<Character, Integer> hs = new HashMap<>();
		for (Character string : c) {
			if (hs.containsKey(string)) {
				hs.put(string, hs.get(string) + 1);
			} else {
				hs.put(string, 1);

			}
		}
		System.out.println("hs::::::" + hs);

	}

	public static void main(String[] args) {
		duplicateCountUsingStream();
	}
}
