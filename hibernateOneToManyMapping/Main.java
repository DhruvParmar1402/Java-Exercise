package org.hibernateOneToManyMapping;
import org.hibernateOneToManyMapping.DAO.Question_dao;
import org.hibernateOneToManyMapping.DAO.Question_get;
import org.hibernateOneToManyMapping.entity.Answer;
import org.hibernateOneToManyMapping.entity.Questions;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            Questions q1=new Questions();
            Answer a1=new Answer();
            Answer a2=new Answer();

            q1.setQuestion("What is java?");

            a1.setQuestion(q1);
            a1.setAnswer("Java is programming language");

            a2.setQuestion(q1);
            a2.setAnswer("With java we can built the softwares");

            ArrayList<Answer> arr=new ArrayList<>();
            arr.add(a2);
            arr.add(a1);

            q1.setAnswers(arr);
            Question_dao.save(q1);

            Question_get.get(1);
    }
}