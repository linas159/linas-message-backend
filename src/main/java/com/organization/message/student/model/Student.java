package com.organization.message.student.model;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    private Integer salary;

    public Student(){};

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
