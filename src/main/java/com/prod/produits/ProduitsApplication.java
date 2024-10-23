package com.prod.produits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.prod.produits.entities.GenreFilm;
import com.prod.produits.entities.ProduitFilm;

@SpringBootApplication
public class ProduitsApplication implements CommandLineRunner {
@Autowired
private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
	SpringApplication.run(ProduitsApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(ProduitFilm.class);
	repositoryRestConfiguration.exposeIdsFor(ProduitFilm.class,GenreFilm.class);
	}
}

