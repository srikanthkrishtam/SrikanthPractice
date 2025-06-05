package com.srikanth.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srikanth.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{

}
