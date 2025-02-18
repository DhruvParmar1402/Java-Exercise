package org.hibernateOneToManyMapping.DAO;

import org.hibernateOneToManyMapping.entity.Questions;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Question_get {
    public static void get(int id) {
        Configuration cfg = new Configuration();
        cfg.configure();

        try (SessionFactory sf = cfg.buildSessionFactory();
             Session session = sf.openSession()) {

            Transaction tx = session.beginTransaction();
            Questions question = session.get(Questions.class, id);

            if (question != null) {
                Hibernate.initialize(question.getAnswers());
                System.out.println(question);
            } else {
                System.out.println("No question found with ID: " + id);
            }

            tx.commit();
        } catch (Exception e) {
            System.out.println("Error occurred while fetching");
        }
    }
}
