package com.example.demo.OnetoOne;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<QuestionEntity,Integer> {
}
