package com.example.demo.DAO;

import com.example.demo.Entity.StudentEntity;
import jakarta.persistence.EntityManager;

import java.util.List;

public interface StudentDao {
    public void save(StudentEntity student);
    public void saveAll(List<StudentEntity> list);
    public void getStudentUsingFind(int id);
    public void getAllStudents();
    public void getStudentsUsingName(String name);
    public void getStudentsUsingNativeQuery(String query);
    public void updateUsingId(int id);
    public void updateUsingNativeQuery(int id);
    public void deleteUsingId(int id);
}
