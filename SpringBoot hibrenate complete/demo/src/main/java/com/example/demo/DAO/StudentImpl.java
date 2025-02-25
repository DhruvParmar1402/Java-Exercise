package com.example.demo.DAO;

import com.example.demo.Entity.StudentEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentImpl implements StudentDao{
    private EntityManager entityManager;

    @Autowired
    public StudentImpl(EntityManager thatEntityManager)
    {
        entityManager=thatEntityManager;
    }


    @Transactional
    public void save (StudentEntity students)
    {
        entityManager.persist(students);
    }

    @Transactional
    public void saveAll(List<StudentEntity> list)
    {
        for(int i=0;i<list.size();i++)
        {
            entityManager.persist(list.get(i));
        }
    }

    public void getStudentUsingFind(int id)
    {
        StudentEntity student=entityManager.find(StudentEntity.class,id);
        System.out.println(student);
    }

    public void getAllStudents()
    {
         Query query=entityManager.createQuery("from StudentEntity");
         List<StudentEntity> list=query.getResultList();
         for(int i=0;i<list.size();i++)
         {
             System.out.println(list.get(i));
         }
    }
    public void getStudentsUsingName(String name)
    {
        Query query=entityManager.createQuery("from StudentEntity where first_name=:name");
        query.setParameter("name",name);
        List<StudentEntity> list=query.getResultList();
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }

    public void getStudentsUsingNativeQuery(String query){
        Query sqlquery=entityManager.createNativeQuery(query,StudentEntity.class);
        List<StudentEntity> list=sqlquery.getResultList();
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
    @Transactional
    public void updateUsingId(int id)
    {
        StudentEntity student=entityManager.find(StudentEntity.class,id);
        student.setLast_Name("Mendpara");
        entityManager.merge(student);
    }

    @Transactional
    public void updateUsingNativeQuery(int id)
    {
        Query query=entityManager.createNativeQuery("update student set first_name=:name where id=:id");
        query.setParameter("name","Khilan D");
        query.setParameter("id",id);
        query.executeUpdate();
    }

    @Transactional
    public void deleteUsingId(int id)
    {
        StudentEntity student= entityManager.find(StudentEntity.class,id);
        entityManager.remove(student);
    }
}
