package com.srikanth.allPrograms;

public class CopyOneArrayToAnotherArray {
	
	public static void copyOneArrayToAnotherArray(int array[]) {
		
		int newArray[]=new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			newArray[i]=array[i];
		}
		
		for(Integer a:newArray) {
			System.out.print(""+a);
		}
	}
	
	
	public static void main(String[] args) {
		
		copyOneArrayToAnotherArray(new int[] {1,3,5,7,9});
	}

}
