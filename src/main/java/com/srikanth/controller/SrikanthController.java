package com.srikanth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.srikanth.common.AutoWired;
import com.srikanth.dto.BookRequest;
import com.srikanth.dto.ResponseDto;
import com.srikanth.entity.Book;
import com.srikanth.entity.Login;
import com.srikanth.service.SrikanthService;

@Controller
public class SrikanthController extends AutoWired {

	
	
	@Autowired
	SrikanthService service;
	@GetMapping("/login")
	public String login(@ModelAttribute("BookRequest") BookRequest book) {
		return "userlogin";
	}
	@RequestMapping("/loginValidate")
	public String loginValidate(@ModelAttribute("login") Login login, Model model) {
		boolean isUserExist = false;
		ResponseDto resp = new ResponseDto();

		try {
			isUserExist = service.isUserExist(login);
			System.out.println("SrikanthController.loginValidate()qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq" + login);
			List<?> list=this.getSrikanthService().getListOfBooks();
			if(list.size()>0) {
				resp.setStatus("success");
				//resp.setMessage("successfully fetched");
				resp.setBookList(list);
				model.addAttribute("booksList", resp);
			}else {
				resp.setStatus("failure");
				resp.setMessage("No Data Found");
			}
			
			
			if (!isUserExist) {
				resp.setStatus("Failure");
				resp.setMessage("Invalid Credentials..");
				model.addAttribute("LoginResponse", resp);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isUserExist == true ? "book" : "redirect:login";
	}

	//saveorupdateBookById
	
	@PostMapping("/saveorupdateBookById")
	public String saveorupdateBookById(@ModelAttribute("BookRequest") BookRequest book,Model model) {
		System.out.println("SrikanthController.saveorupdateBookById()bookbook::::"+book);
		ResponseDto resp = new ResponseDto();
		List<?> list=this.getSrikanthService().getListOfBooks();
		if(list.size()>0) {
			resp.setStatus("success");
			//resp.setMessage("successfully fetched");
			resp.setBookList(list);
			model.addAttribute("booksList", resp);
		}else {
			resp.setStatus("failure");
			resp.setMessage("No Data Found");
		}
System.out.println("SrikanthController.saveorupdateBookById()");
		return "book";
	}
	
	
	
}
