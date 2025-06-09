package com.srikanth.streams;

public class PalindromeCountAndNonPal {
	public static void main(String[] args) {
		// 1.Palindrome words in the sentence
		// 2.count palindrome words in the sentence
		// 3.Other words in the sentence

		String pal = "my mom teaches me malayalam ";
		String a[] = pal.split(" ");

		int palCount = 0;
		int notPlaCount = 0;

		String str1 = "";
		String str2 = "";

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			str1 = a[i];
			for (int ii = str1.length() - 1; ii >= 0; ii--) {
				sb.append(str1.charAt(ii));

			}
			System.out.println("TO:" + sb.toString());
			if (str1.equals(sb)) {
				System.out.println("Given String is Palindrome::" + str1);
				palCount++;

			} else {
				System.out.println("Given String is Not Palindrome::" + str1);
				notPlaCount++;
			}
			str1 = "";
			sb.setLength(0);
			System.out.println("SB:::" + sb.toString());

		}
		System.out.println("Palibdrome Count::" + palCount);
		System.out.println("Not Palibdrome Count::" + notPlaCount);

	}
}
