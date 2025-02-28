package com.jobs.jobposting;

import com.jobs.jobposting.Repo.Mongodbrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobpostingApplication{
	public static void main(String[] args) {
		SpringApplication.run(JobpostingApplication.class, args);
	}
}
