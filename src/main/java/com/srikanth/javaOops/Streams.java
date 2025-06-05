package com.srikanth.javaOops;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class Streams {

	public static void filter() {
		List<String> strings = Arrays.asList("abc", "", "sc", "efg", "abc", "", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("Streams.filter()" + filtered);
		
		
		Map<Object, Long> filterCount = strings.stream().collect(Collectors.groupingBy(co -> !co.isEmpty(),Collectors.counting()));
System.out.println("Streams.filter()filterCount:::"+filterCount);
	}

	public static void emptyStringCountFromList() {
		List<String> strings = Arrays.asList("abc", "", "sc", "efg", "abcd", "", "jkl");

		// without streams
		int count = 0;
		for (String empty : strings) {
			if (empty.isEmpty()) {
				count++;
			}
		}
		System.out.println("Streams.emptyStringCountFromList() count:" + count);
		// using streams
		long filtered = strings.stream().filter(string -> string.isEmpty()).count();
		List<String> removeEmptyString = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println("Streams.filter()" + removeEmptyString);
	}

	public static void getListOfSquareOfDistinctDumbers() {
		Integer arr[] = new Integer[] {3, 2, 2, 3, 7, 3, 5 };
		List<Integer> numbers = Arrays.asList(arr);

		// using Stream
		List<Integer> squaresList = null;
		// squaresList=numbers.stream().map( i ->
		// i*i).distinct().collect(Collectors.toList());
		// Using withoutStream
		Set<Integer> set = new HashSet<>();

		for (Integer i : numbers) {

			set.add(i * i);
		}

		System.out.println("Streams.map()" + set);
	}

	public static void sortingList() {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		// using without streams
		Collections.sort(numbers);
		System.out.println("Streams.sortingList()" + numbers);

		// using streams
		List<Integer> sortedList = numbers.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("Streams.sortingList()" + sortedList);
	}

	public static void howToMergeListOfStringToString() {
		List<String> strings = Arrays.asList("abc", "", "sc", "efg", "abcd", "", "jkl");

		StringBuilder sb = new StringBuilder();
		// using Streams
		// strings.forEach(s-> sb.append(s).append(","));
		// using without Streams
		for (String s : strings) {
			if (!s.isEmpty()) {
				sb.append(s);
				sb.append(",");
			}
		}
		System.out.println("Streams.hoeToMergeListOfStringToString()" + sb.toString());

	}

	public static void getMaxOfList() {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 12, 154, 3, 7, 3, 500);
		int max = numbers.get(0);
		// using without Stream
		Collections.max(numbers);
		for (int i : numbers) {
			if (max < i) {
				max = i;
			}
		}
		// using Stream
		max = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Streams.getMaxOfList() max::" + max);
	}

	public static void getMinOfList() {
		List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 12, -1, 154, 3, 7, 3, 500);
		int min = numbers.get(0);
		for (int i : numbers) {
			if (min > i) {
				min = i;
			}
		}
		System.out.println("Streams.getMinOfList() min::" + min);
	}

	public static void sumOfList() {
		List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 12, -1, 154, 3, 7, 3, 500);
		List<Integer> sumOfList = new ArrayList<>();
		// Using Streams
		// sumOfList=numbers.stream().map(s->s+s).collect(Collectors.toList());
		// Using without Streams
		for (int i : numbers) {
			sumOfList.add(i + i);
		}
		System.out.println("Streams.sumOfList()numbers::" + sumOfList);
	}

	public static void reverseOrderOfList() {
		List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 12, -1, 154, 3, 7, 3, 500);
		Iterator<Integer> sumOfList = null;
		//Collections.reverse(numbers);

		// ==========way 1========
		sumOfList = numbers.parallelStream().collect(Collectors.toCollection(LinkedList::new)).descendingIterator();
		// Using Streams

		while (sumOfList.hasNext()) {
		System.out.println("Streams.sumOfList()" + sumOfList.next());
		}
		//======way 2=====
		for(int i=numbers.size()-1;i>=0;i--) {
			System.out.print(numbers.get(i)+",");
		}
		
		
	}
	
	public static void evenNumbers() {
		List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 12,  154, 3, 7, 3, 500);
		
		List<Integer> sumOfList = null;

		sumOfList = numbers.stream().filter(n->((n%2)==0)).collect(Collectors.toList());
		
		System.out.println("Streams.evenNumbers()"+sumOfList);
	}
	
	
	
	public static void signature() {
		final Charset asciiCs = Charset.forName("US-ASCII");
		Mac sha256_HMAC = null;
		try {
			sha256_HMAC = Mac.getInstance("HmacSHA256");
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
		
		final SecretKeySpec secret_key = new javax.crypto.spec.SecretKeySpec(asciiCs.encode("key").array(), "HmacSHA256");
		
			sha256_HMAC.init(secret_key);
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final byte[] mac_data = sha256_HMAC.doFinal(asciiCs.encode("The quick brown fox jumps over the lazy dog").array());
		String result = "";
		for (final byte element : mac_data)
		{
		    result += Integer.toString((element & 0xff) + 0x100, 16).substring(1);
		}
		System.out.println("Streams.signature()::"+result);
	}

	
	
	 public static String generateHMAC(String clientSecret, String data) {
	        String hash = null; //data is a string which has the json sorted through keys and concatenated values
	        try {
	            String secret = clientSecret;
	            String message = data;
	            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
	            SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(),"HmacSHA256");
	            sha256_HMAC.init(secret_key);
	            hash = Base64.encodeBase64String(sha256_HMAC.doFinal(message.getBytes()));
	          
	        }
	        catch (Exception e){ //Log it
	        }
	        return hash;
	    }
	
	
	//dyxxeLpr7qZl0RL0Q+CVLF5Ox/7HvB1kh/AJMYn9fxM=
	
	
	public static void main(String[] args) throws ParseException {
		String key="1617695238078"+"c5c636acfdd7f6e4260c1d4078391b85c1c33fc7";
		filter();
		
		LocalDate date = LocalDate.now();
        String dd=date.toString();
		System.out.println("Streams.main()"+dd);
	}

}
