package com.prod.produits;


import java.sql.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prod.produits.entities.ProduitFilm;
import com.prod.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {
	@Autowired
	private ProduitRepository produitRepository;

	@Test
	public void testCreateProduit(){
		ProduitFilm prod =new ProduitFilm("Pc Dell",2200.500,new Date(0));
		produitRepository.save(prod);
	}


}
