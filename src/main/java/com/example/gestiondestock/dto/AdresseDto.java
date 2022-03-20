package com.example.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class AdresseDto {
    private Integer id;

    private String adresse1;


    private String adresse2;


    private String ville;


    private String codePostale;


    private String pays;
}
