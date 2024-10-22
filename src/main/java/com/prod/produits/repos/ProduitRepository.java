package com.prod.produits.repos;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.prod.produits.entities.GenreFilm;
import com.prod.produits.entities.ProduitFilm;

@RepositoryRestResource(path="res")
public interface ProduitRepository extends JpaRepository<ProduitFilm,Long> {

    List<ProduitFilm> findByNomFilm(String nom);
    List<ProduitFilm> findByNomFilmContains(String nom);

    // @Query("select p from produit_film where p.nom_produit like %?1 and p.prix_produit > ?2")
    // List<ProduitFilm>findByNomPrix (String nom,Double prix);

    @Query("SELECT p FROM ProduitFilm p WHERE p.nomFilm LIKE CONCAT('%', :nom, '%') AND p.prixFilm > :prix")
    List<ProduitFilm> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);


    @Query("SELECT p FROM ProduitFilm p WHERE p.genreFilm = :genreFilm")
    List<ProduitFilm> findByGenre(@Param("genreFilm") GenreFilm genreFilm);

    List<ProduitFilm>findByGenreFilmIdG(Long id);

    List<ProduitFilm>findByOrderByNomFilmAsc();

    @Query("SELECT p FROM ProduitFilm p ORDER BY p.nomFilm ASC , p.prixFilm DESC")
    List<ProduitFilm>trierProduitFilmsNomsPrix();
    

    

}
