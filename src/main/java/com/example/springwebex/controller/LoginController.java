package com.example.springwebex.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springwebex.model.Admin;
import com.example.springwebex.model.Question1;
import com.example.springwebex.repository.QuestionRepository;
import com.example.springwebex.service.AnswerService;
import com.example.springwebex.service.LoginService;
import com.example.springwebex.service.QuestionService;

@Controller
public class LoginController {
	

	@Autowired
	LoginService loginService;
	
	@Autowired
	QuestionService questionService;

	@Autowired
	AnswerService answerService;

	

	@RequestMapping(value="/", method = RequestMethod.GET)
    public String showVeiwUserDetails(ModelMap model){
		return "first"; 
    }
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
    public String login11(ModelMap model) {
        return "login";
    }
	@RequestMapping(value="/success", method = RequestMethod.GET)
    public String login1(ModelMap model) {
        return "success";
    }
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "welcome";
    }
	
	@RequestMapping(value="/admin", method = RequestMethod.GET)
    public String admin(ModelMap model) {
        return "admin";
    }
	
	@RequestMapping(value="/question", method = RequestMethod.GET)
    public String question(ModelMap model) {
        return "question";
    }

	@RequestMapping(value="/post", method = RequestMethod.GET)
    public String post(ModelMap model) {
        return "post";
    }
	
   
  /* @RequestMapping(value = "/postsave", method = RequestMethod.POST)
    public String saveQuestion(ModelMap model, @ModelAttribute("question") String question) {
	List<Question> Question = QuestionService.findByQuestion(question);
	questionService.save(question);
	model.put("Question", Question);

	//model.addAttribute("saveMessage", "Saved Successfully");
        return "post";
    }*/


/*	@RequestMapping(value = "/postsave", method = RequestMethod.POST)
	public String index(ModelMap modelMap){
		questionService.save(question(n);
		
	return "post"; 
	}	*/
/*	@PostMapping("/postsave")
	private String saveQuestion(@RequestBody Question question)
	{
		questionService.save(question);
		return "post";
	}*/

	@GetMapping("/answer")
	public String index1(ModelMap modelMap){
		modelMap.put("answer",answerService.findAll());
	return "answer"; 
	}	
	
	

	
	/*
	
    	@PostMapping("/postsave")
    public String findById(ModelMap model, @RequestParam String question) {
		System.out.println("Entering - FileController.findById(String, HttpServletRequest) - question::"+question);
        List<Question> Question =  (List<com.example.springwebex.model.Question>)questionService.save(question);
        System.out.println(" - : "+Question);
        questionService.save(question);
        model.put("Question", Question);
        return "post";
	}*/
	@PostMapping(value="/postsave")
    public String saverequest(@ModelAttribute Question1 question1,BindingResult bindingResult,HttpServletRequest request) {
		Question1 newQuestion = questionService.save(question1);
    return "redirect:/post";
    }
}
