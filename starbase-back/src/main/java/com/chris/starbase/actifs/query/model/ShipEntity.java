package com.chris.starbase.actifs.query.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "ships")
@Data
public class ShipEntity {
    @Id
    private UUID id;
    private String name;
    private UUID idSite;
}
