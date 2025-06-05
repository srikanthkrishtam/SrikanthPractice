package com.srikanth.dto;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.jsonwebtoken.lang.Collections;

public class HelloWorld {
	
	
	
	public static void main(String[] args) {
		String str="telangana";
		HashMap<Character, Integer> hs=new HashMap<>();
		List<String> asList = Arrays.asList(str.split(""));
		
		   Map<Object, Long> output = asList.stream().collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		
		   System.out.println("HelloWorld.main()"+output);
		Map<String, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()) );
		System.out.println(collect);
	}

	
	/*
	 * public static void main (String[] args) throws java.lang.Exception {
	 * System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "M") +
	 * " Miles\n"); System.out.println(distance(17.4169, 78.4387, 17.4254, 78.4505,
	 * "K")/1000.0 + " Kilometers\n"); System.out.println(distance(32.9697,
	 * -96.80322, 29.46786, -98.53506, "N") + " Nautical Miles\n"); }
	 * 
	 * private static double distance(double lat1, double lon1, double lat2, double
	 * lon2, String unit) { if ((lat1 == lat2) && (lon1 == lon2)) { return 0; } else
	 * { double theta = lon1 - lon2; double dist = Math.sin(Math.toRadians(lat1)) *
	 * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) *
	 * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta)); dist =
	 * Math.acos(dist); dist = Math.toDegrees(dist); dist = dist * 60 * 1.1515; if
	 * (unit.equals("K")) { dist = dist * 1.609344; } else if (unit.equals("N")) {
	 * dist = dist * 0.8684; } return (dist); } }
	 */
	
	
}
