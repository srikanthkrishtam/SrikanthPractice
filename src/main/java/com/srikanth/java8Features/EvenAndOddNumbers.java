package com.srikanth.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenAndOddNumbers {

	public static void evenOddNumbersJava7() {

		List<Integer> l = Arrays.asList(1, 2, 4, 8, 5, 99, 3, 2);

		for (int i : l) {
			if (i % 2 == 0) {
				System.out.println("Even Num:::"+i);
			} else {
				System.out.println("Odd Num:::"+i);

			}
		}
	}

	public static void evenOddNumbersJava8() {

		List<Integer> l = Arrays.asList(1, 2, 5, 99, 3, 2);
		List<Integer> evenNumbers = l.stream().filter(o -> o % 2 == 0).collect(Collectors.toList());
		System.out.println("EvenAndOddNumbers.evenOddNumbersJava8() EvenNumbers::::" + evenNumbers);

		List<Integer> oddNumbers = l.stream().filter(o -> o % 2 != 0).collect(Collectors.toList());
		System.out.println("EvenAndOddNumbers.evenOddNumbersJava8() oddNumbers::::" + oddNumbers);

	}

	public static void main(String[] args) {
		evenOddNumbersJava7();
//		evenOddNumbersJava8();
	}
}
