package com.chris.starbase.sites.command.persistance;

import com.chris.starbase.sites.metier.NomSite;
import jakarta.persistence.*;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "sites")
@Setter
public class SitePersistance {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Enumerated(EnumType.STRING)
    private NomSite name;
    private String code;
    private String latitude;
    private String longitude;
}
