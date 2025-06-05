package com.srikanth.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetEmpBySalSorting {
	public static void main(String[] args) {
		List<Employe> l = new ArrayList<>();
		l.add(new Employe("Developer", 85000, "Srikanth", new Address("Tenali", "Andhra", "India")));
		l.add(new Employe("Hr", 50000, "Raju", new Address("Bapatla", "Andhra", "India")));
		l.add(new Employe("Digital Marketing", 44000, "Sunoj", new Address("Repalle", "Andhra", "India")));

		
		List<Employe> ne = l.stream().sorted(Comparator.comparing(e -> e.getEmpName())).collect(Collectors.toList());
		System.out.println("Name sort::" + ne);

		List<Employe> n = l.stream().sorted(Comparator.comparing(e -> e.getAddress().getCity()))
				.collect(Collectors.toList());
		System.out.println("Address City sort::" + n);

		List<String> em = l.stream().map(e -> e.getAddress().getCity()).collect(Collectors.toList());
		System.out.println("EMp SalList::" + em);

	}
}
