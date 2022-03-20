package com.example.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.time.Instant;

@Data
@Builder
public class VentesDto {
    private Integer id;

    private String code;

    private Instant dateVente;

    private String commentaire;
}
