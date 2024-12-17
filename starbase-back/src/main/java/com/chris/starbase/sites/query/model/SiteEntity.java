package com.chris.starbase.sites.query.model;

import com.chris.starbase.sites.metier.NomSite;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.UUID;

@Entity
@Table(name = "sites")
@Getter
public class SiteEntity {
    @Id
    private UUID id;
    @Enumerated(EnumType.STRING)
    private NomSite name;
    private String code;
    private String latitude;
    private String longitude;
}
