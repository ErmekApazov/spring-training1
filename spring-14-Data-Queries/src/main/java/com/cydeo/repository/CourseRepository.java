package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course, Long> {

        //Find all courses by category by Drive Query:
        //select * from courses where category = ...
        // this repository works only with Course table.
        // employee table will not work
    List<Course> findByCategory(String category);

        //Find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName (String category);

        //Checks if a course with the supplied name exists. Return true if exists, false otherwise
    boolean existsByName(String name);

        //Returns the count of courses for the given category
    int countByCategory(String category);

        //find all the courses that start with the given course name string
    List<Course> findByNameStartsWith(String name);

        //Find all courses by category and return a stream
    Stream<Course> streamAllByCategory(String category);

    @Query("SELECT c FROM Course c WHERE c.category = : category AND c.rating > : rating")
    List<Course> retrieveAllByCategoryAndRatingGreaterThan(@Param("catergory") String category, @Param("rating") int rating);



}
