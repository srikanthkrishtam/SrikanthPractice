package com.srikanth.javaOops;

public class ThrowExample {

	public static void validate(int i) throws CustomException {
		if (i == 0) {
			throw new CustomException("Please send more than 1 or above");
		}
	}

	public static void main(String[] args) {
		try {
			validate(0);
		} catch (CustomException e) {
			System.out.println("*************" + e.getMessage());
			e.printStackTrace();
		}
	}

}
