package org.hibernateOneToManyMapping.DAO;

import org.hibernateOneToManyMapping.entity.Questions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Question_dao {
    public static void save(Questions obj)
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        try(SessionFactory sf=cfg.buildSessionFactory())
        {
            Session s=sf.openSession();
            Transaction t=s.beginTransaction();

            s.save(obj);

            t.commit();
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
