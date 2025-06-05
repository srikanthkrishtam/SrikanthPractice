package com.srikanth.java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.srikanth.dto.Employee;

public class ConvertListOfObjNamesToStringArrayUsingStream {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.setName("srikanth");
		e2.setName("karthik");
		employees.add(e1);
		employees.add(e2);
 
		// Convert 
		Set<String> listString=employees.stream().map(Employee::getName) // map each employee to their name
				.collect(Collectors.toSet());// collect the names into a new string array
		
		
		System.out.println("ConvertListOfObjNamesToStringArrayUsingStream.main():::"+listString);
		
		
		
		String[] namesArray = employees.stream().map(Employee::getName) // map each employee to their name
				.toArray(String[]::new); // collect the names into a new string array
		System.out.println("Print Names of Array::");

		Arrays.stream(namesArray).forEach(System.out::println);
	}

}
