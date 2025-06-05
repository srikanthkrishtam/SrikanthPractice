package com.srikanth.streams;

public class STringisPalindromeOrNot {
public static void main(String[] args) {
	
	String s="Markram"; StringBuffer sb=new StringBuffer();
	s=s.toLowerCase();
	for(int i=s.length()-1;i>=0;i--) {
		sb.append(s.charAt(i));
	}
	if(s.equalsIgnoreCase(sb.toString())) {
		System.out.println("t");
	}
	
	
	String n="abccfgg";
	StringBuffer n1=new StringBuffer();
	int cc=1;
	for(int i=0;i<n.length();i++) {
		if (i< n.length()-1 &&  n.charAt(i)== n.charAt(i+1)) {
			cc ++;
		}else {
			n1.append(n.charAt(i)).append(cc);
			cc=1;

			
		}
	}
	System.out.println(n1.toString());
}
}
