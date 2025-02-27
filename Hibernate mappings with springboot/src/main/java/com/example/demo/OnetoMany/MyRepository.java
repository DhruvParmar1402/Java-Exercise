package com.example.demo.OnetoMany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<QuestionEntityOneToMany,Integer> {
}
