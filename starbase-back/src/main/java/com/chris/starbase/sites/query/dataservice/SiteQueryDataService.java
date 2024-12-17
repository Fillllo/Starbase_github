package com.chris.starbase.sites.query.dataservice;

import com.chris.starbase.actifs.query.dataservice.ActifsQueryDataService;
import com.chris.starbase.sites.query.entry.SiteEntry;
import com.chris.starbase.sites.query.mapper.SiteMapper;
import com.chris.starbase.sites.query.model.SiteEntity;
import com.chris.starbase.sites.query.repository.SiteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SiteQueryDataService {
    private final SiteRepository siteRepository;
    private final SiteMapper siteMapper;

    private final ActifsQueryDataService actifsQueryDataService;

    public SiteQueryDataService(SiteRepository siteRepository, SiteMapper siteMapper, ActifsQueryDataService actifsQueryDataService) {
        this.siteRepository = siteRepository;
        this.siteMapper = siteMapper;
        this.actifsQueryDataService = actifsQueryDataService;
    }

    public SiteEntry getSite(UUID id) throws Exception {
        Optional<SiteEntity> siteEntity = siteRepository.findById(id);
        if(siteEntity.isPresent()) {
            SiteEntry siteEntry = new SiteEntry();
            siteEntry.setId(siteEntity.get().getId());
            siteEntry.setName(siteEntity.get().getName());
            siteEntry.setCode(siteEntity.get().getCode());
            siteEntry.setLatitude(siteEntity.get().getLatitude());
            siteEntry.setLongitude(siteEntity.get().getLongitude());
            return siteEntry;
        }

        throw new Exception("Aucun site n'a été trouvé");
    }

    public List<SiteEntry> getAllSites() throws Exception {
        try {
            return siteRepository.findAll()
                    .stream()
                    .map(site -> siteMapper.convertToEntry(site, actifsQueryDataService.getActifs(site.getId())))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new Exception("Aucun site n'existe");
        }
    }


}
