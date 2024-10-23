package com.prod.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.prod.produits.entities.GenreFilm;

@RepositoryRestResource(path = "gen")
@CrossOrigin("http://localhost:4200/") //pour autoriser angular
public interface GenreRepository  extends JpaRepository<GenreFilm, Long> {



    
}
