package com.example.gestiondestock.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Entreprise")
public class Entreprise  extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @Column(name = "codeFiscal")
    private String codeFiscal;

    @Column(name = "photo")
    private String photo;

    @Column(name = "email")
    private String email;

    @Column(name = "numTel")
    private String numTel;

    @Column(name = "siteWeb")
    private String siteWeb;

    //une entrepise renferme plusieurs users
    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;



}
