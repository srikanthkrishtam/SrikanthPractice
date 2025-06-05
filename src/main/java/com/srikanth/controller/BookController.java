package com.srikanth.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srikanth.entity.Book;
import com.srikanth.entity.Page;
import com.srikanth.repo.AuthorRepo;
import com.srikanth.repo.BookRepo;
import com.srikanth.repo.PageRepo;

@RestController
public class BookController {

	//@Autowired
	//JdbcTemplate j;
	
	@Autowired
	BookRepo bookRepo;
	@Autowired
	PageRepo pageRepo;
	@Autowired
	AuthorRepo authRepo;

	@PostMapping("/savePage")
	public Page savePages(@RequestBody Page book) {

		return pageRepo.save(book);
	}
	
	@PostMapping("/saveBook")
	public Book saveBook(@RequestBody Book book) {
		return bookRepo.save(book);
	}
	
	
	@GetMapping("/getBook")
	public List<Book> getBook(){
		try {
			return bookRepo.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	@GetMapping("/getPage")
	public List<Page> getPage(){
		return pageRepo.findAll();
		
	}
	
	
	
	@GetMapping("/getAuthor")
	public List<Page> getPageByIsActive(){
		return authRepo.findAll();
		
	}
	
	
	
	@Scheduled
	  // @Scheduled(fixedDelayString = "4000")              
	public void scheduledMethod() {
	     System.out.println(" Scheduler with Fixed delay :" + new Date());
	}

	public static void main(String[] args) {
		
		Page p=new Page();
		p.setId(101);
		p.setContent("vcccccc");
		System.out.println("BookController.main():::"+p.getId() +p.getContent());
	}
	
	
	

}
