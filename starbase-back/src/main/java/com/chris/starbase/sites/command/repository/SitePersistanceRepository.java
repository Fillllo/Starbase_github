package com.chris.starbase.sites.command.repository;

import com.chris.starbase.sites.command.persistance.SitePersistance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface SitePersistanceRepository extends JpaRepository<SitePersistance, UUID> {
}
