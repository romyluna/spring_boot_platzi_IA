package com.platzi.play.web.controller;

import com.platzi.play.persistence.crud.CrudMovieEntity;
import com.platzi.play.persistence.entity.MovieEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    private final CrudMovieEntity crudMovieEntity;

    public MovieController(CrudMovieEntity crudMovieEntity) {
        this.crudMovieEntity = crudMovieEntity;
    }

   /*http://localhost:8090/platzi-play/api/movies*/

    @GetMapping("/movies")
    public List<MovieEntity> getAll(){
        return (List<MovieEntity>) this.crudMovieEntity.findAll(); /*casteo para que devuelva una lista*/
    }



}
