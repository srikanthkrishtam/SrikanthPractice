package com.srikanth.java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueElementsFromList {

	private static void distinctElementsFromListUsingStreams(List<Integer> asList) {

		List<?> distinctList = asList.stream().distinct().collect(Collectors.toList());
		System.out.println("UniqueElementsFromList.distinctElementsFromListUsingStreams()" + distinctList);
	}
	
	
	private static void distinctElementsFromListUsingWithoutStreams(List<Integer> asList) {
             int c=0;
		// Way 1
		Set<Integer> distinctNumbersSet = new HashSet<>(asList);
		// way 2
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 2, 5, 6, 3,1, 7,3,	 8, 9, 5);

	        // Create a list to store duplicate elements
	        List<Integer> duplicateNumbers = new ArrayList<>();

	        // Iterate through the list with two nested for-loops
	        for (int i = 0; i < numbers.size(); i++) {
	            for (int j = i + 1; j < numbers.size(); j++) {
	                // Compare each pair of elements
	                if (numbers.get(i).equals(numbers.get(j)) && !duplicateNumbers.contains(numbers.get(i))) {
	                    // If they are equal and not already in the duplicates list, add to duplicates
	                    duplicateNumbers.add(numbers.get(i));
	                }
	            }
	        }

	        // Print the list with duplicates
	        System.out.println("Original List: " + numbers);
	        System.out.println("Duplicate Elements: " + duplicateNumbers);
	    
		
		
//		System.out.println("UniqueElementsFromList.distinctElementsFromListUsingStreams()" + distinctNumbersSet);
	}
	 

	@SuppressWarnings("unused")
	private static void findNoOfDupsFromListUsingStreams(List<Integer> asList) {

		Map<Integer, Long> distinctLis = asList.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println("distinctLis:::" + distinctLis);
		
		asList.stream().collect(Collectors.groupingBy(i -> i , Collectors.counting()));
	}

	private static void findNoOfEmptyElementsUsingStreams(List<String> asList) {

		int count = 0;
		for (int j = 0; j < asList.size(); j++) {
			if (asList.get(j).isEmpty()) {
				count++;
			}
		}
		System.out.println("Without Streams EmptyCount is::" + count);
		// =======================================================================

		long emptuCont = asList.stream().filter(co -> co.isEmpty()).count();

		Map<Object, Long> list = asList.stream().collect(Collectors.groupingBy(co -> co, Collectors.counting()));
		System.out.println("EmptyCount is::" + list);
	}
	public static void main(String[] args) {
//		distinctElementsFromListUsingStreams(Arrays.asList(2, 342, 12, 34, 2));
		distinctElementsFromListUsingWithoutStreams(Arrays.asList(2, 342, 12, 34, 2));
//		findNoOfDupsFromListUsingStreams(Arrays.asList(2, 3, 1, 4, 2));
//		findNoOfEmptyElementsUsingStreams(Arrays.asList("first", "", "Second", "", "third"));
		
	}

}
