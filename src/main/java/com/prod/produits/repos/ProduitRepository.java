package com.prod.produits.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.prod.produits.entities.GenreFilm;
import com.prod.produits.entities.ProduitFilm;

public interface ProduitRepository extends JpaRepository<ProduitFilm,Long> {

    List<ProduitFilm> findByNomProduit(String nom);
    List<ProduitFilm> findByNomProduitContains(String nom);

    // @Query("select p from produit_film where p.nom_produit like %?1 and p.prix_produit > ?2")
    // List<ProduitFilm>findByNomPrix (String nom,Double prix);

    @Query("SELECT p FROM ProduitFilm p WHERE p.nomProduit LIKE CONCAT('%', :nom, '%') AND p.prixProduit > :prix")
    List<ProduitFilm> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);


    @Query("SELECT p FROM ProduitFilm p WHERE p.genreFilm = :genreFilm")
    List<ProduitFilm> findByGenre(@Param("genreFilm") GenreFilm genreFilm);
    

    

}
