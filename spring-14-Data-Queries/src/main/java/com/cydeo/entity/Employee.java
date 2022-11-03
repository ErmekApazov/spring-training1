package com.cydeo.entity;

import com.cydeo.enums.Gender;
import com.cydeo.entity.Department;
import com.cydeo.entity.Region;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "employees")
public class Employee extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private LocalDate hireDate; // spring recognizes about Date template. you don't have to add Column annot.
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Integer salary;
    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;
    @ManyToOne // region to one person
    @JoinColumn(name = "region_id")
    private Region region;





}
