package com.example.gestiondestock.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "MvtStk")
public class MvtStk extends AbstractEntity{

    @Column(name = "dateMvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;
    @Column(name = "typeMvtStk")
    private TypeMvtStk typeMvtStk;
}
