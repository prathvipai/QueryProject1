package com.example.springwebex.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Answer")
public class Answer {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
    private Long id;
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name="qid")
    private Long qid;
	
	@Column(name="answer")
    private String answer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getQid() {
		return qid;
	}

	public void setQid(Long qid) {
		this.qid = qid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", qid=" + qid + ", answer=" + answer + "]";
	}
	
	

}

