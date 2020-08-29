package com.example.springwebex.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springwebex.model.Answer;
@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {

}
