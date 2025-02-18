package org.hibernateManyToManyMapping;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {

    @Id
    @Column(name = "employeeId")
    private int employeeId;

    @Column(name="employeeName")
    private String name;

    @ManyToMany
    private List<ProjectEntity> projects;

    public EmployeeEntity() {
    }

    public EmployeeEntity(int employeeId, String name, List<ProjectEntity> projects) {
        this.employeeId = employeeId;
        this.name = name;
        this.projects = projects;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProjectEntity> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectEntity> projects) {
        this.projects = projects;
    }
}
