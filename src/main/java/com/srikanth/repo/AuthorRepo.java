package com.srikanth.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srikanth.entity.Page;
@Repository
public interface AuthorRepo extends JpaRepository<Page, Integer> {

}
