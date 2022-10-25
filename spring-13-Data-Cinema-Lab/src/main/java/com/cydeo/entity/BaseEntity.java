package com.cydeo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass // make it as a parent class
public class BaseEntity {

    @Id // all table will have primary key in all child classes
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
