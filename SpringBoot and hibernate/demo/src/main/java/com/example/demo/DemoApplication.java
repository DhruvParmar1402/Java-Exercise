package com.example.demo;

import com.example.demo.DAO.StudentDAO;
import com.example.demo.DAO.StudentDAOImpl;
import com.example.demo.Entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (StudentDAOImpl dao){
		return runner ->{
			create(dao);
		};
	}

	private void create (StudentDAO dao)
	{
		Student st=new Student("Dhruv","Parmar","Dhruv@gmail.com");
		Student st2=new Student("Jeevan","Rajpurohit","Jeevan@gmail.com");
		Student st3=new Student("Khilan", "Mendpara","Khilan");
		Student st4=new Student("Pratham","Trivedi","Pratham@gmail.com");

		List<Student> list=new ArrayList<>();
		list.add(st);
		list.add(st2);
		list.add(st3);
		list.add(st4);

//		dao.saveall(list);
//		List<Student>listofstudent=dao.findall();
//		System.out.println(listofstudent);
//
//		st = dao.findbyid(6);
//		System.out.println(st);

		System.out.println(dao.removeall());
	}
}
