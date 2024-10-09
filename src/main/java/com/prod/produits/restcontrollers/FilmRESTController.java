package com.prod.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prod.produits.entities.ProduitFilm;
import com.prod.produits.service.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FilmRESTController {

    @Autowired
    ProduitService produitService;

    @RequestMapping(method=RequestMethod.GET)
    public List<ProduitFilm> getAllProduits(){
        return produitService.getAllProduits();
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    public ProduitFilm getProduitById(@PathVariable("id") Long id){
        return produitService.getProduit(id);
    }




}
