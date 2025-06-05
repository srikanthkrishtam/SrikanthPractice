package com.srikanth.dto;

public class E extends D {
	 public static void main(String[] args)
	    {
	        int x = 5;
	        change(x);
	        System.out.println(x);
	    }
	    public static void change(int x)
	    {
	        x = 10;
	        System.out.println("E.change()"+x);
	    }
}
