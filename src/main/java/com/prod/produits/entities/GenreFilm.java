package com.prod.produits.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class GenreFilm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idG;
    private String nomG;
    private String descriptionG;

    @OneToMany (mappedBy = "genreFilm")
    private List<ProduitFilm>produits;

    public Long getIdG() {
        return idG;
    }
    public String getNomG() {
        return nomG;
    }
    public String getDescriptionG() {
        return descriptionG;
    }
    public void setIdG(Long idG) {
        this.idG = idG;
    }
    public void setNomG(String nomG) {
        this.nomG = nomG;
    }
    public void setDescriptionG(String descriptionG) {
        this.descriptionG = descriptionG;
    }
    public GenreFilm() {
        super();
    }
    public GenreFilm(String nomG, String descriptionG) {
        this.nomG = nomG;
        this.descriptionG = descriptionG;
    }
    

    

}
