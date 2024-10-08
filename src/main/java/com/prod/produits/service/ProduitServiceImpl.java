package com.prod.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.prod.produits.entities.ProduitFilm;
import com.prod.produits.repos.ProduitRepository;

public class ProduitServiceImpl implements ProduitService 
{
    @Autowired
    ProduitRepository produitRepository;

    @Override
    public ProduitFilm saveProduitFilm(ProduitFilm p) {
        return produitRepository.save(p);
    }

    @Override
    public ProduitFilm uProduitFilm(ProduitFilm p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'uProduitFilm'");
    }

    @Override
    public void deleleProduit(ProduitFilm p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleleProduit'");
    }

    @Override
    public void deleteProduitById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProduitById'");
    }

    @Override
    public ProduitFilm getProduit(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProduit'");
    }

    @Override
    public List<ProduitFilm> getAllProduits() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllProduits'");
    }

}
