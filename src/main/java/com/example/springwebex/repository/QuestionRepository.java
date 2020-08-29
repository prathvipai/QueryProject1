package com.example.springwebex.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.example.springwebex.model.Question1;

@Repository
public interface QuestionRepository extends JpaRepository<Question1, Long> {


//	List<Question> findById(String question);
	
	 
	public int deleteQuestionDetailsById(Long id);

}