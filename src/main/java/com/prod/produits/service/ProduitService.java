package com.prod.produits.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.prod.produits.entities.GenreFilm;
import com.prod.produits.entities.ProduitFilm;

public interface ProduitService {

    ProduitFilm saveProduitFilm(ProduitFilm p);
    ProduitFilm updateProduitFilm(ProduitFilm p);
    void deleleProduit(ProduitFilm p);
    void deleteProduitById(Long id);
    ProduitFilm getProduit(Long id);
    List<ProduitFilm> getAllProduits();
    List<ProduitFilm>findByNomProduit(String nom);
    List<ProduitFilm>findByNomProduitContains(String nom);
    List<ProduitFilm>findByNomPrix(String nom,Double prix);
    List<ProduitFilm>findByGenre(GenreFilm genreFilm);
    List<ProduitFilm>findByGenreFilmIdG(Long id);
    List<ProduitFilm>findByOrderByNomProduitAsc();
    List<ProduitFilm>trierProduitFilmsNomsPrix();








}
