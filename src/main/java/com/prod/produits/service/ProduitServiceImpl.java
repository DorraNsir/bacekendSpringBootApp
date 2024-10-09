package com.prod.produits.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prod.produits.entities.GenreFilm;
import com.prod.produits.entities.ProduitFilm;
import com.prod.produits.repos.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService 
{
    @Autowired
    ProduitRepository produitRepository;

    @Override
    public ProduitFilm saveProduitFilm(ProduitFilm p) {
        return produitRepository.save(p);
    }

    @Override
    public ProduitFilm updateProduitFilm(ProduitFilm p) {
		return produitRepository.save(p);
    }

    @Override
    public void deleleProduit(ProduitFilm p) {
        produitRepository.delete(p);
    }

    @Override
    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);
    }

    @Override
    public ProduitFilm getProduit(Long id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public List<ProduitFilm> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public List<ProduitFilm> findByNomProduit(String nom) {
        return produitRepository.findByNomProduit(nom);
    }

    @Override
    public List<ProduitFilm> findByNomProduitContains(String nom) {
        return produitRepository.findByNomProduitContains(nom);
    }

    @Override
    public List<ProduitFilm> findByNomPrix(String nom, Double prix) {
        return findByNomPrix(nom, prix);
    }

    @Override
    public List<ProduitFilm> findByGenre(GenreFilm genreFilm) {
        return produitRepository.findByGenre(genreFilm);
    }

    @Override
    public List<ProduitFilm> findByGenreFilmIdG(Long id) {
        return produitRepository.findByGenreFilmIdG(id);
    }

    @Override
    public List<ProduitFilm> findByOrderByNomProduitAsc() {
        return produitRepository.findByOrderByNomProduitAsc();
    }

    @Override
    public List<ProduitFilm> trierProduitFilmsNomsPrix() {
        return produitRepository.trierProduitFilmsNomsPrix();
    }

}
