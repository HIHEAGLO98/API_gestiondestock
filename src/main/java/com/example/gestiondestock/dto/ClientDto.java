package com.example.gestiondestock.dto;

import com.example.gestiondestock.models.Adresse;
import com.example.gestiondestock.models.CommandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
public class ClientDto {
    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String mail;

    private String telephone;

    private List<CommandeClientDto> commandeClientDtos;
}
