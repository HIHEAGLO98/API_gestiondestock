package com.example.gestiondestock.models;

import com.fasterxml.jackson.annotation.JacksonInject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Utilisateur")
public class Utilisateur extends AbstractEntity{
    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "email")
    private String email;

    @Column(name = "dateNaissance")
    private Instant dateNaissance;

    @Column(name = "password")
    private String password;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    //Une entreprise pour plusieurs users
    @ManyToOne
    @JoinColumn(name ="identreprise" )
    private Entreprise entreprise;

    //un utilisateur pour plusieurs roles
    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;

}
