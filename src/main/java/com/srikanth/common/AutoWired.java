package com.srikanth.common;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.srikanth.repo.BookRepo;
import com.srikanth.repo.LoginRepo;
import com.srikanth.service.SrikanthService;


public class AutoWired {
	/*
	 * @Autowired private EmployeRepository employeRepository;
	 * 
	 * @Autowired
	 * 
	 * private AddressRepository addressRepository;
	 * 
	 * @Autowired private RoleRepository roleRepository;
	 * 
	 * @Autowired private MailService mailService;
	 * 
	 * @Autowired EmployeService employeService;
	 */
	@Autowired
	private EntityManager entityManager;
	@Autowired
	SrikanthService srikanthService;
	
	
	//Repository
	@Autowired
	LoginRepo loginRepo;
	@Autowired
	BookRepo bookRepo;
	
	
	
	
	public BookRepo getBookRepo() {
		return bookRepo;
	}

	public void setBookRepo(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}

	public LoginRepo getLoginRepo() {
		return loginRepo;
	}

	public void setLoginRepo(LoginRepo loginRepo) {
		this.loginRepo = loginRepo;
	}

	public SrikanthService getSrikanthService() {
		return srikanthService;
	}

	public void setSrikanthService(SrikanthService srikanthService) {
		this.srikanthService = srikanthService;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
