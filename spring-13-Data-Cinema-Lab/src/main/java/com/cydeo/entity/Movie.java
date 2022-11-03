package com.cydeo.entity;

import com.cydeo.enums.MovieState;
import com.cydeo.enums.MovieType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Movie extends BaseEntity{

    private String name;

    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate; // check the name of table in sql table name, must match

    private Integer duration;

    @Column(columnDefinition = "text") // if you create regular, 255 varchar. but if you put "text" will be unlimited
    private String summary;

    @Enumerated(EnumType.STRING) // make it type as a string
    private MovieType type;

    @Enumerated(EnumType.STRING)
    private MovieState state;

    private BigDecimal price;

    @ManyToMany
    @JoinTable (name = "movie_genre_rel", // you 're modifying join table which is created by Spring Boot, third table
    joinColumns = @JoinColumn(name="movie_id"),
    inverseJoinColumns = @JoinColumn(name = "genre_id"))// other table's genre_id
    private List<Genre> genreList;



}
