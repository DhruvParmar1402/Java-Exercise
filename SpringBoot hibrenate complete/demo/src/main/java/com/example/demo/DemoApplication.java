package com.example.demo;

import com.example.demo.DAO.StudentDao;
import com.example.demo.DAO.StudentImpl;
import com.example.demo.Entity.StudentEntity;
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
	public CommandLineRunner commandLineRunner (StudentImpl dao){
		return runner ->{
			create(dao);
		};
	}

	public static void create(StudentDao dao)
	{
//		List<StudentEntity> list=new ArrayList<>();
//		list.add(new StudentEntity("Khilan","Mendpra","khilan@gmail.com"));
//		list.add(new StudentEntity("Harsh","Mistry","harsh@gmail.com"));
//		list.add(new StudentEntity("Vivek","Parmar","vivek@gmail.com"));
//		list.add(new StudentEntity("Tushar","vavdiya","tushar@gmail.com"));
//
//		dao.save(new Student("Hardik","Muliyashiya,"hardik@gmail.com""));
//		dao.saveAll(list);

//		dao.getStudentUsingFind(10);
//		dao.getAllStudents();
//		dao.getStudentsUsingName("Vivek");
//		dao.getStudentsUsingNativeQuery("Select * from student");
//		dao.updateUsingId(11);
//		dao.updateUsingNativeQuery(11);
		dao.deleteUsingId(14);
	}
}
