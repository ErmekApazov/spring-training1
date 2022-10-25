package com.cydeo.entity.task;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Departments extends BaseEntity {

    private String department;
    private String division;

}
