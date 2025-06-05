package com.srikanth.common;

import java.security.SecureRandom;
import java.util.Random;

public class OTPGenerator {

	static Random rnd;

	public static void main(String[] args) {
		 System.out.println("generateOTP:::::::::::::::::::"+generateCouponCode());
	}

	public static String generateOTP() {
		String chars = "0123456789";

		final int OTP_LENGTH = 6;
		rnd = new SecureRandom();
		StringBuilder pass = new StringBuilder();
		for (int i = 0; i < OTP_LENGTH; i++)
			pass.append(chars.charAt(rnd.nextInt(chars.length())));
		return pass.toString();
	}

	public static String generateRandomPwd() {
		String chars = "abcdefgABCDXYZ";

		final int OTP_LENGTH = 6;
		rnd = new SecureRandom();
		StringBuilder pass = new StringBuilder();
		for (int i = 0; i < OTP_LENGTH; i++)
			pass.append(chars.charAt(rnd.nextInt(chars.length())));
		return pass.toString();
	}

	public static String generateCouponCode() {
		String chars = "A0B1C2D3E4F5G6H7I8J9KLMNOPQRSTUVWXYZ";
		final int OTP_LENGTH = 6;
		rnd = new SecureRandom();
		StringBuilder pass = new StringBuilder();
		for (int i = 0; i < OTP_LENGTH; i++)
			pass.append(chars.charAt(rnd.nextInt(chars.length())));

		return "VHC" + pass.toString();
	}

	public static String generateCategorypswd() {
		String chars = "0123456789";

		final int OTP_LENGTH = 3;
		rnd = new SecureRandom();
		StringBuilder pass = new StringBuilder();
		for (int i = 0; i < OTP_LENGTH; i++)
			pass.append(chars.charAt(rnd.nextInt(chars.length())));
		return "VHC" + pass.toString();
	}
}
