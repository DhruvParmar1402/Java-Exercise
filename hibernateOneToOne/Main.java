package org.hibernateOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();

        Transaction t = s.beginTransaction();

        QuestionEntity q1 = new QuestionEntity();
        q1.setQuestion_id(1);
        q1.setQuestion("What is Java?");

        AnswerEntity a1 = new AnswerEntity();
        a1.setAnswerId(101);
        a1.setAnswer("It's a programming language.");

        q1.setAns(a1);
        a1.setQuestion(q1);

        s.save(q1);
        t.commit();

        s.close();
        sf.close();
    }
}
