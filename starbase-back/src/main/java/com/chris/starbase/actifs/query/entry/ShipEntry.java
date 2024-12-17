package com.chris.starbase.actifs.query.entry;

import lombok.Data;

import java.util.UUID;

@Data
public class ShipEntry {
    private UUID id;
    private String name;
    private UUID idSite;
}
