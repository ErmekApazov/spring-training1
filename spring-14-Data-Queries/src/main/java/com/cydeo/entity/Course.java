package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor // this is constructor to create object
@Data
@Table(name="COURSES")
public class Course{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // in database we don't have id key, we are creating ourselves.

    @Column(name = "NAME")
    private String name;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "RATING")
    private Integer rating;

    @Column(name = "DESCRIPTION")
    private String description;

}

/*
* SELECT e EMPLOYEE e WHERE...
* if you create in repository it will complain if you don't have noargconstructor in course class
* Employee e = new Employee(); jpql works on it. therefore @noArgsConstructor
*
* */