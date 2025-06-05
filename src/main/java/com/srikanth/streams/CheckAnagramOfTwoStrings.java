package com.srikanth.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class CheckAnagramOfTwoStrings {
	public static void main(String[] args) {
		String s1 = "tar";
		String s2 = "rat";

		List<Character> ll1 = s1.toLowerCase().chars().sorted().mapToObj(c -> (char) c).collect(Collectors.toList());
		List<Character> ll2 = s2.toLowerCase().chars().sorted().mapToObj(c -> (char) c).collect(Collectors.toList());
		System.out.println(ll1.equals(ll2));

// 2nd way		
		List<Integer> sorted1 = s1.toLowerCase().chars().sorted().boxed().collect(Collectors.toList());

		List<Integer> sorted2 = s2.toLowerCase().chars().sorted().boxed().collect(Collectors.toList());

		System.out.println(sorted1.equals(sorted2));

		// Converts the String to an IntStream of Unicode values (integers).

//Each character is represented by its Unicode (ASCII) value.
		// "tar".chars() → IntStream of [116, 97, 114]
// boxed Converts the IntStream to a Stream<Integer>.  to get List<Integer

		// Normal

		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] == c2[i]) {
				System.out.println("Anagram");
			}
		}
		
		
		
		s1.chars().sorted().mapToObj(c -> (char)c).collect(Collectors.toList());
	}
}
