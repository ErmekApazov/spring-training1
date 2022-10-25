package com.cydeo.repository;

import com.cydeo.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // springboot creating implementation in runtime. Annotation is optional
public interface CarRepository extends JpaRepository<Car, Long> {


}

// CarRepository has all methods from JpaRepository
// if I need to do something else in database, in which methods are not enough
// i can create my own methods inside of CarRepository