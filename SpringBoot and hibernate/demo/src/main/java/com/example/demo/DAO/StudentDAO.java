package com.example.demo.DAO;

import com.example.demo.Entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student st);
    Student find(int id);
    void saveall(List<Student> list);
    List<Student> findall();
    Student findbyid(int id);

    int removeall();
}

