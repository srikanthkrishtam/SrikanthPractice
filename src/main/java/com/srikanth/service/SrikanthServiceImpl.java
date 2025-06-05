package com.srikanth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.srikanth.common.AutoWired;
import com.srikanth.entity.Book;
import com.srikanth.entity.Login;

@Service
public class SrikanthServiceImpl extends AutoWired implements SrikanthService {

	@Override
	public boolean isUserExist(Login login) {

		int count = 0;
		try {
			count = this.getLoginRepo().isUserExist(login.getUserName(), login.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return count == 0 ? false : true;
	}

	@Override
	public List<Book> getListOfBooks() {

		List<Book> bookList = null;
		try {
			bookList = this.getBookRepo().findAll();
		} catch (Exception e) {

			e.printStackTrace();
		}

		return bookList;
	}

}
