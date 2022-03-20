package com.example.gestiondestock.dto;

import com.example.gestiondestock.models.Fournisseur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class LigneCommandeFournisseurDto {
    private Integer id;

    private String code;

    private Instant dateCommande;

    private FournisseurDto fournisseur;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;

}
