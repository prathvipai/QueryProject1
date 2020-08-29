package com.example.springwebex.service;

import java.util.List;
import java.util.Optional;


import com.example.springwebex.model.Question1;
public interface QuestionService {


	public Question1 save(Question1 question1);
	public int deletequestionDetailsById(Long id);
	
}


