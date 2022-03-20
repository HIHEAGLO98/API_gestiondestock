package com.example.gestiondestock.dto;

import com.example.gestiondestock.models.Article;
import com.example.gestiondestock.models.CommandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeClientDto {
    private Integer id;

    private ArticleDto article;

    private CommandeClientDto commandeClient;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
