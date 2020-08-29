package com.example.springwebex.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springwebex.model.Question1;
import com.example.springwebex.repository.QuestionRepository;
import com.example.springwebex.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	
	@Autowired
    QuestionRepository questionRepository;

	public Question1 save(Question1 question1) {
		
        return questionRepository.save(question1);
        
    }
	public int deleteQuestionDetailsById(Long id) {
        return questionRepository.deleteQuestionDetailsById(id);
    }
	@Override
	public int deletequestionDetailsById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}


}

	

	
	

	

	

	


