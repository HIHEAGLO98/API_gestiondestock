package com.example.gestiondestock.dto;

import com.example.gestiondestock.models.Category;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ArticleDto {
    private Integer id;

    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaire;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private  String photo;

    private CategoryDto categoryDto;
}
