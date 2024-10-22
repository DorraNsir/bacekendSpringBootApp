package com.prod.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prod.produits.entities.GenreFilm;

public interface GenreRepository  extends JpaRepository<GenreFilm, Long> {
    
}
