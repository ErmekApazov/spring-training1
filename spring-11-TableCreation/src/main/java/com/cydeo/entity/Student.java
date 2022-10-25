package com.cydeo.entity;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity // how to make class table
@Table(name = "students") // how to change table name
public class Student {

    @Id // how to define primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // postgres will make primary key/unique for you
    private Long id;

    @Column(name = "studentFirstName") // how to change column name into different format
    private String firstName;
    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Column(columnDefinition = "DATE") // how birthDate as a DATE
    private LocalDate birthDate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime birthDateTime;

    @Enumerated(EnumType.STRING) // to make gender string as male/female;
//    @Enumerated(EnumType.ORDINAL)
    private Gender gender;

    @Transient //i don't want to create city in the table/database, just keep as a variable or delete
    private String city;


}
