package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.entity.task.Departments;
import com.cydeo.entity.task.Employees;
import com.cydeo.enums.Gender;
import com.cydeo.repository.CarRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component // because this class has dependency
public class DataGenerator implements CommandLineRunner {

    // do we have any method which is doing this saving for me?
    //yes, where? inside of repository

    // dependency injection
    private final CarRepository carRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DataGenerator(CarRepository carRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.carRepository = carRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car c1 = new Car("BMW", "M3");
        Car c2 = new Car("Honda", "Civic");
        Car c3 = new Car("Toyota", "Camry");

        //I want to save c1,c2,c3 to db

        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);

        List<Employees> employeeList = new ArrayList<>();
        List<Departments> departmentList = new ArrayList<>();

        Employees e1 = new Employees("Berrie", "Manueau", "bmanueau0@dion.ne.jp", LocalDate.of(2006,04,20), Gender.FEMALE, 2500);
        Employees e2 = new Employees("Aeriell", "McNee", "amcnee1@google.es", LocalDate.of(2009,01,26), Gender.FEMALE, 2500);
        Employees e3 = new Employees("Sydney", "Symonds", "ssymonds2@hhs.gov", LocalDate.of(2010,05,17), Gender.FEMALE, 2500);
        Employees e4 = new Employees("Avrom", "Rowantree", null, LocalDate.of(2014,03,02), Gender.MALE, 2500);
        Employees e5 = new Employees("Feliks", "Morffew", "fmorffew4@a8.net", LocalDate.of(2003,01,14), Gender.MALE, 2500);

        Departments d1 = new Departments("Sports", "Outdoors");
        Departments d2 = new Departments("Tools", "Hardware");
        Departments d3 = new Departments("Clothing", "Home");
        Departments d4 = new Departments("Phones & Tablets", "Electronics");
        Departments d5 = new Departments("Computers", "Electronics");


        employeeList.addAll(Arrays.asList(e1,e2,e3,e4,e5));
        departmentList.addAll(Arrays.asList(d1,d2,d3,d4,d5));

        employeeRepository.saveAll(employeeList);
        departmentRepository.saveAll(departmentList);





    }
}
