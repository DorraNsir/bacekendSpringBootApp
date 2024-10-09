package com.prod.produits.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProduitFilm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String nomProduit;
    private Double prixProduit;
    private Date dateCreatoin;

    @ManyToOne
    private GenreFilm genreFilm;

    @Override
    public String toString() {
        return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prixProduit=" + prixProduit
                + ", dateCreatoin=" + dateCreatoin + "]";
    }

    
    


    

    



}
