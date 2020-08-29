package com.example.springwebex.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.springwebex.model.Admin;

import com.example.springwebex.repository.AdminRepository;

import com.example.springwebex.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	AdminRepository adminRepository;

	public boolean validateAdmin(String adminname, String password) {
		System.out.println("Entering - LoginServiceImpl.validateAdmin(String, String) - adminname : "+adminname+" | password : "+password);
		boolean validateAdmin = false;
		Admin admin = adminRepository.validateAdmin(adminname, password);
		if(admin != null){
			validateAdmin = true;
		}
		return validateAdmin;
	}

	public Admin save(Admin admin) {
		return adminRepository.save(admin);
	}

	public List<Admin> getAllAdminDetails() {
		return adminRepository.findAll();
	}




	@Override
	public boolean validateAdmin1(String adminname, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
