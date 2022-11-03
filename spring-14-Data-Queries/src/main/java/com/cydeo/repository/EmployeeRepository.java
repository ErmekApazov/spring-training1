package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

        //Display all employees with email address ""
    List<Employee> findByEmail (String email);

        //Display all employees with firstname "" and lastname "", also show all employees with an email address ""
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

        //Display all employees that first name is not ""
//    List<Employee> findByFirstNameNotContaining(String firstName); // ?
    List<Employee> findByFirstNameIsNot(String firstName);

        //Display all employees where last name starts with ""
    List<Employee> findByLastNameStartingWith(String lastName);

        //Display all employees with salaries higher than ""
    List<Employee> findBySalaryIsGreaterThan(Integer pattern);

        //Display all employees with salaries higher than ""
    List<Employee> findBySalaryIsLessThan(Integer pattern);

        //Display all employees that has been hired between "" and ""
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

        //Display all employees where salaries greater and equal to "" in order
    List<Employee> findBySalaryGreaterThanEqualOrderBySalary(Integer salary);

        //Display top unique 3 employees that is making less than ""
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

        //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();



    @Query("SELECT employee FROM Employee employee WHERE employee.email='fmorffew4@a8.net' ")
    Employee retrieveEmployeeDetail(); // it is not drive query. drive query starts with find...and annotate with @Query

    @Query(" SELECT e.salary FROM Employee e WHERE e.email='fmorffew4@a8.net'")
    Integer retrieveEmployeeSalary();

    //Not Equal
    @Query("SELECT e FROM Employee e WHERE e.salary <> ?1")
    List<Employee> retrieveEmployeeSalaryNotEqual(int Salary);

    //Like / Contains /startwiths / endswith
    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1")
    List<Employee> retrieveEmployeeFirstNameLike(String pattern);

    //Less Than
    @Query("SELECT e FROM Employee e WHERE e.salary < ?1 ")
    List<Employee> retrieveEmployeeSalaryLessThan(int salary);

    //Greater than
    @Query("SELECT e.firstName FROM Employee e WHERE e.salary > ?1")
    List<Employee> retrieveEmployeeSalaryGreaterThan(int salary);

    //BETWEEN
    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee> retrieveEmployeeSalaryBetween(int salary1, int salary2);

    //BEFORE
    @Query("SELECT e FROM Employee e WHERE e.hireDate >?1")
    List<Employee> retrieveEmployeeHiredDateBefore(LocalDate date);

    //NULL
    @Query("SELECT e FROM Employee e WHERE e.email IS NULL")
    List<Employee> retrieveEmployeeEmailIsNUll();

    //SORTING in  ascending order
    @Query("SELECT e FROM Employee e ORDER BY e.salary")
    List<Employee> retrieveEmployeeSalaryOrderAsc();

    // SORTING IN DESC ORDER
    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC")
    List<Employee> retrieveEmployeeSalaryOrderDesc();

    //NATIVE QUERY
    @Query(value= "SELECT * FROM employee WHERE salary = ?1", nativeQuery = true)
    List<Employee> retrieveEmployeeDetailBySalary(int salary);

    //**************************

    //Named Parameter
    @Query("SELECT e FROM Employee e WHERE e.salary = :salary")
    List<Employee> retrieveEmployeeSalary(@Param("salary") int salary);



}
