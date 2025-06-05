package com.srikanth.java8Features;

public class RemoveDupProperName {
	 public static void main(String[] args) {
	        String input = "srikkkkaaanth";
	        String properName = extractProperName(input);

	        if (properName != null) {
	            System.out.println("Proper Name: " + properName);
	        } else {
	            System.out.println("Unable to extract proper name.");
	        }
	    }

	    private static String extractProperName(String input) {
	        String targetName = "srikanth";

	        // Convert input to lowercase for case-insensitive comparison
	        input = input.toLowerCase();

	        // Check if the target name is present in the input string
	        if (input.contains(targetName)) {
	            return targetName;
	        } else {
	            return null;
	        }
	    }
}
