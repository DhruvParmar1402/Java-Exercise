//Just a note for a future me it will work if the session are same and the data retrieved is also same.

package org.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstLevelCaching {
    public static void main(String[] args) {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();

        UserEntity u1=(UserEntity) s.get(UserEntity.class,1);
        System.out.println(u1);

        u1=s.get(UserEntity.class,1);
        System.out.println(u1);

        tx.commit();
        s.close();
        sf.close();
    }
}
