package com.srikanth.java8Features;

import java.util.Arrays;
import java.util.List;

public class MaxElementOFromListUsinfStream {

	private static void printMaxValue(List<Integer> asList) { // use chat

//		max method on the stream, which returns an Optional object containing the maximum element in the stream we use get method to print value.
		int max=asList.stream().max(Integer::compareTo).get();  
		System.out.println("MaxElementOFromListUsinfStream.printMaxValue()::::::"+max);
	}
	
	private static void printMaxValueWithoutStream(List<Integer> asList) {

		int max = asList.get(0);
		for (Integer integer : asList) {
			if (max<integer ) {
				max = integer;
			}
		}
		System.out.println("MaxElementOFromListUsinfStream.printMaxValueWithoutStream():::max:::"+max);

	}
	
	private static void printMinValue(List<Integer> asList) {

		int max=asList.stream().min(Integer::compareTo).get();  
		System.out.println("MaxElementOFromListUsinfStream.printMaxValue()::::::"+max);
	}
	public static void main(String[] args) {
		//printMaxValue(Arrays.asList(1,2,3,5));
		printMaxValueWithoutStream(Arrays.asList(1,0,2,3,12,5));
		
//		printMinValue(Arrays.asList(1,2,3,5));
		
	}

	



	

	
}
