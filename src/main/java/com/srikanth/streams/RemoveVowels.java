package com.srikanth.streams;

import java.util.ArrayList;
import java.util.List;

public class RemoveVowels {

	public void test() {
		System.out.println();
	}
	
	public static String removeVowels(String input) {
		
		return input.replaceAll("[aeiouAEIOU]", "");
	}

	public static void main(String[] args) {
		String result = removeVowels("Hello World");
		System.out.println(result); // Outputs: Hll Wrld
		
		
		String ss="repeate remove";
		StringBuffer sb=new StringBuffer();
		List<Character> l=new ArrayList<>();
		for(int i=0;i<ss.length();i++) {
			if(!l.contains(ss.charAt(i))) {
				l.add(ss.charAt(i));
				sb.append(ss.charAt(i));
			}
		}
		System.out.println(l);
		
	}
}