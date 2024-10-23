package com.prod.produits.service;
import java.util.List;
import com.prod.produits.entities.GenreFilm;
import com.prod.produits.entities.ProduitFilm;

public interface ProduitService {
    
    ProduitFilm saveProduitFilm(ProduitFilm g);
    ProduitFilm updateProduitFilm(ProduitFilm p);
    void deleleProduit(ProduitFilm p);
    void deleteProduitById(Long id);
    ProduitFilm getProduit(Long id);
    List<ProduitFilm> getAllProduits();
    List<ProduitFilm>findByNomFilm(String nom);
    List<ProduitFilm>findByNomFilmContains(String nom);
    List<ProduitFilm>findByNomPrix(String nom,Double prix);
    List<ProduitFilm>findByGenre(GenreFilm genreFilm);
    List<ProduitFilm>findByGenreFilmIdG(Long id);
    List<ProduitFilm>findByOrderByNomFilmAsc();
    List<ProduitFilm>trierProduitFilmsNomsPrix();








}
