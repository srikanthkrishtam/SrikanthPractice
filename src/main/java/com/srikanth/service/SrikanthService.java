package com.srikanth.service;

import java.util.List;

import com.srikanth.entity.Book;
import com.srikanth.entity.Login;

public interface SrikanthService {

	boolean isUserExist(Login login);

	List<Book> getListOfBooks();

}
