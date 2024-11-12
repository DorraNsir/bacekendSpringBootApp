package com.prod.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<ProduitFilm> getAllProduits() {
        return produitService.getAllProduits();
    }

    @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
    public ProduitFilm getProduitById(@PathVariable("id") Long id) {
        return produitService.getProduit(id);
    }

    @RequestMapping(path = "/addprod", method = RequestMethod.POST)
    public ProduitFilm creaProduitFilm(@RequestBody ProduitFilm produitFilm) {
        return produitService.saveProduitFilm(produitFilm);
    }

    @RequestMapping(path = "/updateprod", method = RequestMethod.PUT)
    public ProduitFilm updaProduitFilm(@RequestBody ProduitFilm produitFilm) {
        return produitService.updateProduitFilm(produitFilm);
    }

    @RequestMapping(value = "/delprod/{id}", method = RequestMethod.DELETE)
    public void deleProduitFilm(@PathVariable("id") Long id) {
        produitService.deleteProduitById(id);
    }

    @RequestMapping(value = "/genre/{idG}", method = RequestMethod.GET)
    public List<ProduitFilm> findByGenreFilmIdG(@PathVariable("idG") Long idG) {
        return produitService.findByGenreFilmIdG(idG);
    }

    @RequestMapping(value = "/filmByName/{nom}", method = RequestMethod.GET)
    public List<ProduitFilm> findByNomFilmContains(@PathVariable("nom") String nom) {
        return produitService.findByNomFilmContains(nom);
    }
}
    