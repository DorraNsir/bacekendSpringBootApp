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
    private Long idFilm;
    private String nomFilm;
    private Double prixFilm;
    private Date dateCreation;

    @ManyToOne
    private GenreFilm genreFilm;

    public ProduitFilm(String nomFilm, Double prixFilm, Date dateCreation) {
        this.nomFilm = nomFilm;
        this.prixFilm = prixFilm;
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Produit [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", prixFilm=" + prixFilm
                + ", dateCreation=" + dateCreation + "]";
    }

    
    


    

    



}
