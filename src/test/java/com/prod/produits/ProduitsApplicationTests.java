package com.prod.produits;


import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prod.produits.entities.GenreFilm;
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
	@Test
	public void testFindProduit(){
		ProduitFilm p=produitRepository.findById(1L).get();
		System.out.println(p);
		System.out.println("*********************************************");
	}

	@Test 
	public void testUpdateProduit(){
		ProduitFilm p=produitRepository.findById(1L).get();
		p.setPrixProduit(2000.0);
		produitRepository.save(p);
	}

	@Test
	public void testDeleteProduit(){
		produitRepository.deleteById(1L);
	}

	@Test
	public void testFindAllProduit(){
		List<ProduitFilm>prods=produitRepository.findAll();
		for(ProduitFilm p:prods){
			System.out.println(p);
		}
	}
	@Test
	public void testFindProduitByNom(){
		List<ProduitFilm> prods=produitRepository.findByNomProduit("Pc Dell");
		for(ProduitFilm p:prods){
			System.out.println(p);
		}
	}
	@Test
	public void testFindProduitbyNomContains(){
		List<ProduitFilm>prods=produitRepository.findByNomProduitContains("p");
		for(ProduitFilm p:prods){
			System.out.println(p);
		}
	}

	@Test
	public void testfindByNomPrix(){
		List<ProduitFilm>prods=produitRepository.findByNomPrix("Pc Dell",2200.5);
		for(ProduitFilm p:prods){
			System.out.println(p);
		}
	}

	@Test
	public void testfindByGenre(){
		GenreFilm genreFilm=new GenreFilm();
		genreFilm.setIdG(1L);
		List<ProduitFilm> prods=produitRepository.findByGenre(genreFilm);
		for(ProduitFilm p:prods){
			System.out.println(p);
		}

	}


}
