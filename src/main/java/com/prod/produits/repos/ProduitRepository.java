package com.prod.produits.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.prod.produits.entities.ProduitFilm;

public interface ProduitRepository extends JpaRepository<ProduitFilm,Long> {

}
