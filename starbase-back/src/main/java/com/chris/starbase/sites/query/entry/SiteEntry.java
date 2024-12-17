package com.chris.starbase.sites.query.entry;

import com.chris.starbase.actifs.query.entry.BoosterEntry;
import com.chris.starbase.actifs.query.entry.ShipEntry;
import com.chris.starbase.actifs.query.model.ShipEntity;
import com.chris.starbase.sites.metier.NomSite;
import com.chris.starbase.sites.query.model.SiteEntity;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.UUID;

@Data
@Getter
public class SiteEntry {
    private UUID id;
    private NomSite name;
    private String code;
    private String latitude;
    private String longitude;
    private ArrayList<BoosterEntry> boosters;
    private ArrayList<ShipEntry> ships;
}
