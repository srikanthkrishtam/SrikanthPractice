package com.srikanth.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
// srikanth

		List<Integer> l = Arrays.asList(10, 88, 33, 88, 10, 12, 4, 18);
		System.out.println("Orginal::" + l);
		String n = "abccfgg";
		StringBuffer sb = new StringBuffer();
		int c = 1;
		for (int i = 0; i < n.length(); i++) {
			if (i< n.length()-1 &&  n.charAt(i)== n.charAt(i+1)) {
				c++;
			} else {
				sb.append(n.charAt(i)).append(c);
			}
		}
		System.out.println(sb.toString());
	}
}
