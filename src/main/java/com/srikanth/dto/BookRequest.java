package com.srikanth.dto;


import lombok.Data;

@Data
public class BookRequest {
	private int bookId;
	private String title;
	private int auth_id;
	private String name;
}
