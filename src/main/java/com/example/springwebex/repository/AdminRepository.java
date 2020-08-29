package com.example.springwebex.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.springwebex.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{
	@Query(value = "SELECT a FROM Admin a WHERE a.adminname = :adminname and a.password = :password")
	public Admin validateAdmin(@Param("adminname") String adminname, @Param("password") String password);
	
}
	
	
