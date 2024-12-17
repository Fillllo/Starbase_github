package com.chris.starbase.actifs.query.mapper;

import com.chris.starbase.actifs.query.entry.ActifEntry;
import com.chris.starbase.actifs.query.entry.BoosterEntry;
import com.chris.starbase.actifs.query.entry.ShipEntry;
import com.chris.starbase.actifs.query.model.BoosterEntity;
import com.chris.starbase.actifs.query.model.ShipEntity;
import com.chris.starbase.sites.query.entry.SiteEntry;
import com.chris.starbase.sites.query.model.SiteEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ActifsMapper {
    @Autowired
    private ModelMapper modelMapper;
    public ActifEntry convertToActifEntry(ArrayList<BoosterEntity> boosters, ArrayList<ShipEntity> ships) {


        ActifEntry actifEntry = new ActifEntry();
        actifEntry.setBoosters(convertToBoosterEntry(boosters));
        actifEntry.setShips(convertToShipEntry(ships));

        return actifEntry;
    };
    public ArrayList<ShipEntry> convertToShipEntry(ArrayList<ShipEntity> ships) {

        ArrayList<ShipEntry> shipEntries = new ArrayList<>();

        for (ShipEntity shipEntity : ships) {
            ShipEntry shipEntry = new ShipEntry();
            shipEntry.setId(shipEntity.getId());
            shipEntry.setName(shipEntity.getName());
            shipEntry.setIdSite(shipEntity.getIdSite());
            shipEntries.add(shipEntry);
        }

        return shipEntries;
    };
    public ArrayList<BoosterEntry> convertToBoosterEntry(ArrayList<BoosterEntity> boosters) {


        ArrayList<BoosterEntry> boosterEntries = new ArrayList<>();

        for (BoosterEntity boosterEntity : boosters) {
            BoosterEntry boosterEntry = new BoosterEntry();
            boosterEntry.setId(boosterEntity.getId());
            boosterEntry.setName(boosterEntity.getName());
            boosterEntry.setIdSite(boosterEntity.getIdSite());
            boosterEntries.add(boosterEntry);
        }

        return boosterEntries;
    }

}
