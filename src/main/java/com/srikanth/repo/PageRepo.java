package com.srikanth.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.srikanth.entity.Page;

@Repository
public interface PageRepo extends JpaRepository<Page, Integer> {

	@Query(value="SELECT * FROM pages p join books b on b.id=p.book_id WHERE  b.id=?1",nativeQuery = true)  
	List<Page> findByBookId(int i);

	List<Page> findById(int i);

}
