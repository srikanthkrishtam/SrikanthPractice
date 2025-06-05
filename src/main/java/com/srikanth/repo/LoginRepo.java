package com.srikanth.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.srikanth.entity.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login, Integer> {

	@Query(value = "select count(*) from login l where l.userName=?1 and l.password=?2 ", nativeQuery = true)
	int isUserExist(String userName, String password);

}
