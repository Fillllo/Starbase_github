package com.chris.starbase.actifs.query.dataservice;

import com.chris.starbase.actifs.query.entry.ActifEntry;
import com.chris.starbase.actifs.query.mapper.ActifsMapper;
import com.chris.starbase.actifs.query.repository.BoosterRepository;
import com.chris.starbase.actifs.query.repository.ShipRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ActifsQueryDataService {
    private final ActifsMapper actifsMapper;
    private final BoosterRepository boosterRepository;
    private final ShipRepository shipRepository;

    public ActifsQueryDataService(ActifsMapper actifsMapper, BoosterRepository boosterRepository, ShipRepository shipRepository) {
        this.actifsMapper = actifsMapper;
        this.boosterRepository = boosterRepository;
        this.shipRepository = shipRepository;
    }

    public ActifEntry getActifs(UUID idSite) {
        return actifsMapper.convertToActifEntry(
                boosterRepository.findBoosterEntitiesByIdSite(idSite),
                shipRepository.findShipEntitiesByIdSite(idSite)
        );
    }
}
