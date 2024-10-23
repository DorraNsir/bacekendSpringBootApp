package com.prod.produits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prod.produits.entities.GenreFilm;
import com.prod.produits.repos.GenreRepository;

@Service
public class GenreServiceImp implements GenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public GenreFilm savaGenreFilm(GenreFilm g) {
        return genreRepository.save(g);
    }

    @Override
    public GenreFilm upGenreFilm(Long id, GenreFilm g) {
        if(genreRepository.existsById(id)){
            g.setIdG(id);
            return genreRepository.save(g);
        }
        return null;
    }


    @Override
    public void deleteGenreFilm(Long id) {
        genreRepository.deleteById(id);
    }

    @Override
    public void deleteGenreFilmByIdG(Long id) {

        genreRepository.deleteById(id);
    }

    
}
