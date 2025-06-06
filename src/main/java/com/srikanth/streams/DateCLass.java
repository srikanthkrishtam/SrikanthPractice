package com.srikanth.streams;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateCLass {
	public static void main(String[] args) {
		LocalDate l = LocalDate.now();
		System.out.println("Local Date::"+l);

		DateTimeFormatter dm = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String s = dm.format(l);
		System.out.println(s);
		
		int year = l.getYear();
        int month = l.getMonthValue();     // 1 = January, 6 = June
        int day = l.getDayOfMonth();
        
        System.out.println(year);
        System.out.println(month);

        System.out.println(day);


	}
}
