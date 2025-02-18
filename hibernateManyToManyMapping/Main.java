package org.hibernateManyToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();

        ProjectEntity p1=new ProjectEntity();
        ProjectEntity p2=new ProjectEntity();
        p1.setProjectId(1);
        p1.setProjectName("Expense tracker");

        p2.setProjectId(2);
        p2.setProjectName("Learning management system");

        EmployeeEntity e1=new EmployeeEntity();
        EmployeeEntity e2=new EmployeeEntity();
        e1.setEmployeeId(1001);
        e1.setName("Jeevan Rajpurohit");

        e2.setEmployeeId(1002);
        e2.setName("Dhruv Parmar");

        ArrayList<ProjectEntity> projectArr=new ArrayList<>();
        ArrayList<EmployeeEntity> employeeArr=new ArrayList<>();

        projectArr.add(p1);
        projectArr.add(p2);

        employeeArr.add(e1);
        employeeArr.add(e2);

        e1.setProjects(projectArr);
        e2.setProjects(projectArr);

        p1.setEmployees(employeeArr);
        p2.setEmployees(employeeArr);

        s.save(e1);
        s.save(e2);

        s.save(p1);
        s.save(p2);

        t.commit();
        s.close();
        sf.close();
    }
}
