package com.srikanth.streams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.persistence.criteria.CriteriaBuilder.In;

public class FindFrequencyCharFromName {
	public static void main(String[] args) {

		String n = "Rama navami";
		n = n.toLowerCase();
		System.out.println(n);
		List<Character> l = new ArrayList<>();
		for (int i = 0; i < n.length(); i++) {
			l.add(n.charAt(i));

		}
		
		
		
		Map<Character, Long> m = l.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting()));

//		System.out.println(m);

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < n.toCharArray().length; i++) {
			if (!map.containsKey(n.charAt(i))) {
				map.put(n.charAt(i), 1);
			} else {
				map.put(n.charAt(i), map.get(n.charAt(i)) + 1);
			}
		}
		System.out.println(map);

	}

}
