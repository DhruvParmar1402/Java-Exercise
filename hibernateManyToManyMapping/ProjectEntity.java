package org.hibernateManyToManyMapping;



import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Project")
public class ProjectEntity {

    @Id
    @Column(name = "projectId")
    private int projectId;

    @Column(name = "projectName")
    private String projectName;

    @ManyToMany
    private List<EmployeeEntity> employees;

    public ProjectEntity() {
    }

    public ProjectEntity(int projectId, String projectName, List<EmployeeEntity> employees) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.employees = employees;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<EmployeeEntity> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeEntity> employees) {
        this.employees = employees;
    }
}
