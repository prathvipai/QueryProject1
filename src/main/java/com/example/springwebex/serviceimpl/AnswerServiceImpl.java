package com.example.springwebex.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springwebex.model.Answer;
import com.example.springwebex.repository.AnswerRepository;
import com.example.springwebex.service.AnswerService;


@Transactional
@Service("answerService")
public class AnswerServiceImpl implements AnswerService{

	@Autowired
    private AnswerRepository answerRepository;

	@Override
	public Iterable<Answer> findAll() {
		// TODO Auto-generated method stub
		return answerRepository.findAll();
	}

}
