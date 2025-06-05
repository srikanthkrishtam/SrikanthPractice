package com.srikanth.allPrograms;

public class FindOvelsFromString {
	public static void main(String[] args) {
		String s = "Srikanth";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if ('a' == s.charAt(i) || 'e' == s.charAt(i) || 'i' == s.charAt(i)|| 'o' == s.charAt(i)
					|| 'u' == s.charAt(i)) {
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
