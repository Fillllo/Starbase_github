package com.chris.starbase.sites.command.dataservice;

import com.chris.starbase.sites.command.model.SiteDTO;
import com.chris.starbase.sites.command.persistance.SitePersistance;
import com.chris.starbase.sites.command.repository.SitePersistanceRepository;
import org.springframework.stereotype.Service;

@Service
public class SiteCommandDataService {
    private final SitePersistanceRepository sitePersistanceRepository;

    public SiteCommandDataService(SitePersistanceRepository sitePersistanceRepository) {
        this.sitePersistanceRepository = sitePersistanceRepository;
    }

    public void addSite(SiteDTO siteDTO) {
        SitePersistance sitePersistance = new SitePersistance();
        sitePersistance.setName(siteDTO.getName());
        sitePersistance.setCode(siteDTO.getCode());
        sitePersistance.setLatitude(siteDTO.getLatitude());
        sitePersistance.setLongitude(siteDTO.getLongitude());
        sitePersistanceRepository.save(sitePersistance);
    }
}
