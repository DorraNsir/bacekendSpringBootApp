package com.prod.produits.service;

import com.prod.produits.entities.GenreFilm;

public interface GenreService {
    GenreFilm savaGenreFilm(GenreFilm g);
    GenreFilm upGenreFilm(Long id,GenreFilm g);
    void deleteGenreFilm(Long id);
    void deleteGenreFilmByIdG(Long id);


    
} 