package com.srikanth.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ValidTime {

	
	
	public void currTimetoAdd10Min()
	{	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	java.util.Calendar cal = java.util.Calendar.getInstance(); // creates calendar
	java.util.Date validFrom = new java.util.Date();
	cal.setTime(validFrom);
	cal.add(Calendar.HOUR, 10);
	java.util.Date validTo = cal.getTime();
	System.out.println("ValidTime.main()" + sdf.format(validTo));
		
	}
		public static void main(String[] args) {
	
		
	
	}
}
