package com.srikanth.allPrograms;

import java.util.Arrays;
import java.util.List;

public class SmallestElementFromArray {

	public static void secondLargestElementFromArray(int a1[]) {

		
		List<Integer> l=Arrays.asList(1,4,2,7,4);
		
		int secondLargest = Arrays.stream(a1).boxed() // convert int[] to Integer stream
				.sorted((a, b) -> b - a) // sort in descending order
				.distinct() // remove duplicates
				.skip(0) // skip the first element (largest)
				.findAny() // get the second element
				.orElse(-1); // default value if not found
		System.out.println("*************secondLargest***********" + secondLargest);
		
	}
	public static void secondSmallestElementFromArray(int[] a) {
		 int secondSmallest = Arrays.stream(a).boxed().sorted().distinct().skip(0).findAny().orElse(-1);
		 System.out.println("*********secondSmallest*********"+secondSmallest);
		 int j=Arrays.stream(a).boxed().distinct().sorted().skip(1).findFirst().orElse(-1);
		 System.out.println("*********secondSmallest*********"+j);

	}
	
	public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		
//		secondLargestElementFromArray(a);
		secondSmallestElementFromArray(a);
		
	}


	
}
