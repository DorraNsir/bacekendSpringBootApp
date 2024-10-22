package com.prod.produits.entities;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomProd", types = { ProduitFilm.class })
public interface FilmProjection {
    public String getNomProduit();

}
