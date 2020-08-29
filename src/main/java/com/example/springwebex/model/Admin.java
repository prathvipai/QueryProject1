package com.example.springwebex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	
	@Column(name="adminname")
    private String adminname;
	
	@Column(name="password")
    private String password;
	
	@Column(name="email")
    private String email;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String adminname, String password, String email) {
		super();
		this.adminname = adminname;
		this.password = password;
		this.email = email;
	}
	
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Admin [adminname=" + adminname + ", password=" + password + ", email=" + email + "]";
	}
}