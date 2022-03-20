package com.example.gestiondestock.models;

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
@Table(name = "CommandeClient")
public class CommandeClient  extends AbstractEntity{

    @Column(name = "code")
    private String code;

    @Column(name = "dateCommande")
    private Instant dateCommande;

    //Un client peut avoir plusieurs commandes
    @ManyToOne
    @JoinColumn(name = "commandeClient")
    private Client client;

    // un seul client pour plusieurs commande
    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;
}
