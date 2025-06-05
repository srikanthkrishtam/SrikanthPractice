package com.srikanth.allPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPrograms {
	private static void countNoOfCharactersFromString(String string) {
		int c = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				c++;
			}
		}
		System.out.println("***** Count of Chars *****" + c);
	}

	// *****************************************************************

	private static void removeWhiteSpaces(String string) {

		string = string.replaceAll(" ", "");
		System.out.println("************removeWhiteSpaces **********" + string);
	}

	// ********************************************************************

	private static void ChangeLowerCaseCharToUpperAndUpperToLower(String string) {
		StringBuffer newStr = new StringBuffer(string);
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLowerCase(string.charAt(i))) {
				newStr.setCharAt(i, Character.toUpperCase(string.charAt(i)));
			} else {
				newStr.setCharAt(i, Character.toLowerCase(string.charAt(i)));

			}
		}
		System.out.println("************ChangeLowerCaseCharToUpperAndUpperToLower **********" + newStr);
	}

	// **********************************************************
	private static void duplicateWordsInString(String string) {
		List dup = new ArrayList<>();
		String s[] = string.split(" ");
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					dup.add(s[i]);
					break;
				}
			}
		}
		System.out.println("***************** Duplicate Words are ************" + dup);

	}

	private static void stringReverse(String string) {

		System.out.println();
		for (int i = string.length(); i > 0; i--) {
			System.out.print(string.charAt(i - 1)); // printing the character at index i-1

		}

	}

	private static void programTosortWords(String string) {
		char[] arr = string.toCharArray();
		Arrays.sort(arr);

		for (char c : arr) {
			System.out.println(c);
		}
	}

	private static void uniqueCharCountFromString(String string) {
		String s[]=string.split("");
		long l=Arrays.asList(s).stream().distinct().count();
		System.out.println(l);
	}

	public static void main(String[] args) {
		// countNoOfCharactersFromString("The Great Leader");
//		removeWhiteSpaces("The Great Leader");
//		ChangeLowerCaseCharToUpperAndUpperToLower("The Great Leader");
//		duplicateWordsInString("The Great Leader is The is");
//		stringReverse("The Great Leader");
//		programTosortWords("the leader");
		uniqueCharCountFromString("srisrika");
	}

}
