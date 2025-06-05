package com.srikanth.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class CountMailFromListOfObjUsingStreams {
	  private String firstName;
	    private String lastName;
	    private List<String> emails;
		public CountMailFromListOfObjUsingStreams(String firstName, String lastName, List<String> emails) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.emails = emails;
		}
	    
	    

    @Override
		public String toString() {
			return "CountMailFromListOfObjUsingStreams [firstName=" + firstName + ", lastName=" + lastName + ", emails="
					+ emails + "]";
		}



	public static void main(String[] args) {

    	CountMailFromListOfObjUsingStreams p1 = new CountMailFromListOfObjUsingStreams("Rama","T", Arrays.asList("rama@EPAM.COM"));
    	CountMailFromListOfObjUsingStreams p2 = new CountMailFromListOfObjUsingStreams("sita","S", Arrays.asList("sita@GMAIL.COM","krishna@yahoo.com","Teja@epam.com"));
    	CountMailFromListOfObjUsingStreams p3 = new CountMailFromListOfObjUsingStreams("Brahma","P", Arrays.asList("Brahma@YAHOO.COM","test@epam.com"));

        Map<String,Integer> result = passengerEmailDomainCount(Arrays.asList(p1,p2,p3));
       

        System.out.println(result); // {epam.com=3, gmail.com=1, yahoo.com=2}
    }

    private static Map<String,Integer> passengerEmailDomainCount(List<CountMailFromListOfObjUsingStreams> passengers) {
    	
    	 Map<CountMailFromListOfObjUsingStreams, Long> result = passengers.stream()
                 .collect(Collectors.groupingBy(Function.identity(),
                         Collectors.counting()));
         System.out.println(result);
    	
    	
		return null;
       
        
    }

}
