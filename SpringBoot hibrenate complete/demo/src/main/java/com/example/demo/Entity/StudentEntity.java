package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_Name;

    @Column(name = "email")
    private String email;

    public StudentEntity() {
    }

    public StudentEntity(String first_name, String last_Name, String email) {
        this.first_name = first_name;
        this.last_Name = last_Name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
