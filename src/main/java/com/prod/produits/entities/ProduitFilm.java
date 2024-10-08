package com.prod.produits.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProduitFilm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String nomProduit;
    private Double prixProduit;
    private Date dateCreatoin;

    public Long getIdProduit() {
        return idProduit;
    }
    public String getNomProduit() {
        return nomProduit;
    }
    public Double getPrixProduit() {
        return prixProduit;
    }
    public Date getDateCreatoin() {
        return dateCreatoin;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }
    public void setPrixProduit(Double prixProduit) {
        this.prixProduit = prixProduit;
    }
    public void setDateCreatoin(Date dateCreatoin) {
        this.dateCreatoin = dateCreatoin;
    }
    public ProduitFilm() {
        super();
    }
    public ProduitFilm(String nomProduit, Double prixProduit, Date dateCreatoin) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
        this.dateCreatoin = dateCreatoin;
    }
    @Override
    public String toString() {
        return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prixProduit=" + prixProduit
                + ", dateCreatoin=" + dateCreatoin + "]";
    }

    
    


    

    



}
