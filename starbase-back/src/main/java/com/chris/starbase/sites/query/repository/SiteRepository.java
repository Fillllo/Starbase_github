package com.chris.starbase.sites.query.repository;

import com.chris.starbase.shared.repository.ReadOnlyRepository;
import com.chris.starbase.sites.query.model.SiteEntity;

import java.util.UUID;

public interface SiteRepository extends ReadOnlyRepository<SiteEntity, UUID> {
}
