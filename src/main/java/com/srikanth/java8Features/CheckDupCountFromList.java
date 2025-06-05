package com.srikanth.java8Features;



import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckDupCountFromList {
	 public static void main(String[] args) {
	        List<Integer> myList = Arrays.asList(1,1, 2, 3, 2, 4, 5, 3, 6, 7, 4, 8, 9, 9);

	        Map<Integer, Integer> elementCountMap = new HashMap<>();

	        // Count the occurrences of each element in the list
	        for (Integer element : myList) {
	            if (elementCountMap.containsKey(element)) {
	                elementCountMap.put(element, elementCountMap.get(element) + 1);
	            } else {
	                elementCountMap.put(element, 1);
	            }
	        }

	        // Iterate through the map to find and print duplicate elements and their counts
	        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println("Element " + entry.getKey() + " appears " + entry.getValue() + " times.");
	            }
	        }
	    }
}
