package com.example.springwebex.service;

import java.util.List;

import com.example.springwebex.model.Admin;


public interface LoginService {

	public boolean validateAdmin1(String adminname, String password);

	public Admin save(Admin admin);
	

	public List<Admin> getAllAdminDetails();
	
	public boolean validateAdmin(String adminname, String password);
}
