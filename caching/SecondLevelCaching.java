package org.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SecondLevelCaching {
    public static void main(String[] args) {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s1=sf.openSession();
        Session s2=sf.openSession();

        UserEntity u1=s1.get(UserEntity.class,1);
        s1.close();

        UserEntity u2=s2.get(UserEntity.class,1);
        s2.close();

        System.out.println(u1);
        System.out.println(u2);
        sf.close();
    }
}
