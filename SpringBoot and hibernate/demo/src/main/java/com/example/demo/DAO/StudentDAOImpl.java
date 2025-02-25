package com.example.demo.DAO;

import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import com.example.demo.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl (EntityManager thatEntityManagaer)
    {
        entityManager=thatEntityManagaer;
    }

    @Override
    @Transactional
    public void save(Student st) {
        entityManager.persist(st);
    }

    public Student find(int id)
    {
        return entityManager.find(Student.class,id);
    }

    @Transactional
    public void saveall(List<Student> list)
    {
        for(int i=0;i<list.size();i++)
        {
            entityManager.persist(list.get(i));
        }
    }

    public List<Student> findall(){
        TypedQuery<Student> query=entityManager.createQuery("from Student",Student.class);
        return query.getResultList();
    }
    public Student findbyid(int id)
    {
        TypedQuery<Student> query=entityManager.createQuery("from Student where id=:id",Student.class);
        query.setParameter("id",id);
        Student list=query.getSingleResult();
//        list.set
        return list;
    }
    @Transactional
    public int removeall(){
        return entityManager.createQuery("delete from Student").executeUpdate();
    }
}
