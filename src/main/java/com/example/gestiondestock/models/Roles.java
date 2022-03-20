package com.example.gestiondestock.models;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Roles")
public class Roles extends AbstractEntity {

    @Column(name = "roleName")
    private String roleName;

    //plusieurs roles pour un utilisateur
    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    private Utilisateur utilisateur;
}
