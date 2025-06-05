package com.srikanth.common;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class DateUtils {
	/**
	 * 
	 * @return
	 */
	public static String getUniqueNumber() {

		String uniqueID = java.util.UUID.randomUUID().toString();
		return uniqueID;
	}//method


	/**
	 * 
	 * @param ipDate
	 * @return
	 */
	public static String formatDate(String ipDate) {

		try {

			SimpleDateFormat ipFormat = new SimpleDateFormat("dd-MM-yyyy");
			SimpleDateFormat opFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = ipFormat.parse(ipDate);
			String opDate = opFormat.format(date);
			//return opFormat.parse(opDate);
			return opDate;

		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}//method
	

	/**
	 * 
	 * @return
	 */
	public static String getCurrentDate() {

		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}//method
	

	
	public static String dateConversion( String dateVal, DateFormat sourceFormat, DateFormat destFormat){
		String retDate=null;
		try {
			retDate=destFormat.format(sourceFormat.parse(dateVal));
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		return retDate;
	}

	public static String getLocalDateTime() {
		LocalDateTime now = LocalDateTime.now();  
		//   System.out.println("Before Formatting: " + now);  
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
		String formatDateTime = now.format(format);
		return formatDateTime;  
	}//method
	


	
	
	
	/**
	 * 
	 * @return
	 */
	public static String getCurrentDateInSqlFormat() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
		Date date = new Date();
		return dateFormat.format(date);
	}//method
	
	public static Date getCurrentDateInSqlFormatdATE() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd ");
		Date date = new Date();
		return date;
	}//method
	
	

	
	
	public static void main(String[] args) {
		System.out.println("DateUtils.main()"+getCurrentDateInSqlFormatdATE());
		
	}//main method
	
	
	
}