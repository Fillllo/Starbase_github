package com.chris.starbase.actifs.query.entry;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ActifEntry {
    private ArrayList<ShipEntry> ships;
    private ArrayList<BoosterEntry> boosters;
}
