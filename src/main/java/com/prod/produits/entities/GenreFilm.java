package com.prod.produits.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class GenreFilm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idG;
    private String nomG;
    private String descriptionG;

    @OneToMany (mappedBy = "genreFilm")
    private List<ProduitFilm>produits;

}
