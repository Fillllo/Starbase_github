package com.chris.starbase.actifs.query.repository;

import com.chris.starbase.actifs.query.model.BoosterEntity;
import com.chris.starbase.actifs.query.model.ShipEntity;
import com.chris.starbase.shared.repository.ReadOnlyRepository;

import java.util.ArrayList;
import java.util.UUID;

public interface ShipRepository extends ReadOnlyRepository<ShipEntity, UUID> {
    ArrayList<ShipEntity> findShipEntitiesByIdSite(UUID id);
}
