package org.hibernateOneToManyMapping.DAO;

import org.hibernateOneToManyMapping.entity.Answer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Answer_dao {

    public static void save(Answer ans)
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        try(SessionFactory sf=cfg.buildSessionFactory())
        {
            Session s=sf.openSession();
            Transaction t=s.beginTransaction();

            s.save(ans);

            t.commit();
            s.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
