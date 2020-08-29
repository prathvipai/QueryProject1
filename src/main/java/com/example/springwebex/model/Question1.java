package com.example.springwebex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Question")
public class Question1{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
    private long id;
	
	@Column(name="question")
    private String question;
	
	

	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Question1(String question) {
		super();

		this.question = question;
	}



	public long getId() {
		return id;
	}


	


	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + "]";
	}



	






		
	
	
	

}