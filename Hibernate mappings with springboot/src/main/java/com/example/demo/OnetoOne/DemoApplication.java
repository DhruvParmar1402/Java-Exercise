package com.example.demo.OnetoOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private MyRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run (String...args) throws Exception{
		AnswerEntity a1=new AnswerEntity(1,"Java is programming lanuage.");
		QuestionEntity q1=new QuestionEntity(1,"What is Java?",a1);

		a1.setQuestion(q1);

//		repo.save(q1);
		List<QuestionEntity>list=repo.findAll();
		System.out.println(list);
	}
}
