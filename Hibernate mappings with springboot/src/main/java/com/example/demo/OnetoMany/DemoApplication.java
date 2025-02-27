package com.example.demo.OnetoMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
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
		AnswerEntityManyToOne a1=new AnswerEntityManyToOne(1,"Java is programming lanuage.");
		AnswerEntityManyToOne a2=new AnswerEntityManyToOne(2,"We can build software using the java.");
		ArrayList<AnswerEntityManyToOne>arr=new ArrayList<>();
		arr.add(a1);
		arr.add(a2);
		QuestionEntityOneToMany q1=new QuestionEntityOneToMany(1,"What is Java?",arr);

//		a1.setQuestion(q1);

		repo.save(q1);
		List<QuestionEntityOneToMany>list=repo.findAll();
		System.out.println(list);
	}
}
