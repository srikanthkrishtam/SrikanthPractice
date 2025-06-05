package com.srikanth.dto;

import java.util.List;

import lombok.Data;

@Data
public class ResponseDto {

	private String title;
	private String name;
	private int id;
	
	private String status;
	private String message;
	
	private List<?> bookList;
	
	
	
	
	
	
}
