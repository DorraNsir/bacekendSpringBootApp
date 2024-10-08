package com.prod.produits.service;

import java.util.List;

import com.prod.produits.entities.ProduitFilm;

public interface ProduitService {
    ProduitFilm saveProduitFilm(ProduitFilm p);
    ProduitFilm uProduitFilm(ProduitFilm p);
    void deleleProduit(ProduitFilm p);
    void deleteProduitById(Long id);
    ProduitFilm getProduit(Long id);
    List<ProduitFilm> getAllProduits();


}
