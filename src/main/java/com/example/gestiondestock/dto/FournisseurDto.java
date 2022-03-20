package com.example.gestiondestock.dto;

import com.example.gestiondestock.models.Adresse;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FournisseurDto {
    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String mail;

    private String telephone;

    private List<CommandeFournisseurDto> commandeFournisseurs;
}
