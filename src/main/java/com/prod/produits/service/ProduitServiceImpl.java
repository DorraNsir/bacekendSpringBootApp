package com.prod.produits.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

}
