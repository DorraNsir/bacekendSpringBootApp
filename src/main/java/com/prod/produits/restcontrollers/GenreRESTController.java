package com.prod.produits.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prod.produits.entities.GenreFilm;
import com.prod.produits.repos.GenreRepository;
import com.prod.produits.service.GenreService;
import com.prod.produits.service.ProduitService;

@RestController
@RequestMapping("/api/gen")
@CrossOrigin("*")
public class GenreRESTController {

    @Autowired
    GenreRepository genreRepository;

    @Autowired
    ProduitService produitService;

    @Qualifier("genreServiceImp")
    @Autowired
    GenreService genreService;
    


    @RequestMapping(method=RequestMethod.GET)
    public List<GenreFilm> getAllCategories()
    {
    return genreRepository.findAll();
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public GenreFilm getCategorieById(@PathVariable("id") Long id) {
    return genreRepository.findById(id).get();
    }

    @RequestMapping(method = RequestMethod.POST)
    public GenreFilm createGenre(@RequestBody GenreFilm g) {
    return genreService.savaGenreFilm(g);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.PUT)
    public GenreFilm updateGenre(@PathVariable("id") Long id,@RequestBody GenreFilm genreFilm) {
    return genreService.upGenreFilm(id,genreFilm);
    }








    
}
