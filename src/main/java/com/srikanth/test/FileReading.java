package com.srikanth.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String args[]) {
		try {
			File file = new File("D:\\Srikanth@1997\\RBLMonthly31032022.txt"); // creates a new file instance
			FileReader fr = new FileReader(file); // reads the file
			BufferedReader br = new BufferedReader(fr); // creates a buffering character input stream
			StringBuffer sb = new StringBuffer(); // constructs a string buffer with no characters
			String line;

			String  values[];
			int rowCount=0;
			while (null != (line = br.readLine())) {
	    		
	    		if(rowCount++>0){
	    			
	    			if(line.length()>0){
	    				values=null;
						line = line+"|";
						values =line.split("\\|");
	    				/*line = (line+"|").replaceAll("(\\|)", " ,");
					    values = line.split(",");*/
					    for(int i=0;i< values.length;i++){
						String val=values[i].trim();
						if("".equals(val)){
						  values[i]=null;
						}
						else{
						    values[i]=val;
						}
					    }
	    				
	    			}
	    		}
	    	}
			
			
			
			
			fr.close(); // closes the stream and release the resources
			System.out.println("Contents of File: ");
			System.out.println(sb.toString()); // returns a string that textually represents the object
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
