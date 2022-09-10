package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.admin;
import com.bean.Questions;
import com.bean.Quiz;
import com.bean.Result;
import com.bean.statistics;
import com.bean.User;
import com.repository.adminrepo;
import com.repository.Questionsrepo;
import com.repository.Quizrepo;
import com.repository.Userrepo;

@Service
public class adminService {
	@Autowired
	Questionsrepo qr;
	@Autowired
	Quizrepo qur;
	@Autowired
	Userrepo ur;
	@Autowired
	statistics stat;
	@Autowired
	adminrepo adr;
	
	
	
	public String adminLogin(admin u)
	{
		admin ad= adr.findById(1).get();
		if(u.getUsername().equals(ad.getUsername())&&u.getPassword().equals(ad.getPassword()))
		{
			return "Welcome admin";
		}
		else
		{
			return "invalid Credentials";
		}
	}
	public String adminpasswordupdate(String password)
	{	admin ad=new admin();
		admin a= adr.findById(1).get();
		ad.setPassword(password);
		adr.saveAndFlush(ad);
			return "Password Updated";
	

	}
	
	public String addQuestion(Questions q)
	{
		if(q!=null)
		{
			qr.save(q);
			return "question added";
		}
		else
		{
			return "failed to add";
		}
		
	}
	
	public String addQuiz(Quiz q)
	{
		
		if(q!=null)
		{
			qur.save(q);
			return "quiz added";
		}
		else
		{
			return "failed to add";
		}
	}
	
	public List<Quiz> viewAllQuiz()
	{
		return qur.findAll();
	}
	
	public statistics quizInfo()
	{
		stat.setUsers(ur.findAll().size());
		stat.setQuestions(qr.findAll().size());
		stat.setQuiz(qur.listOfQuiz());
		
		return stat;

	}
}
