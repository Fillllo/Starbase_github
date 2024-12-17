package com.chris.starbase.sites.query.mapper;

import com.chris.starbase.actifs.query.entry.ActifEntry;
import com.chris.starbase.sites.query.entry.SiteEntry;
import com.chris.starbase.sites.query.model.SiteEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SiteMapper {

    @Autowired
    private ModelMapper modelMapper;
    public SiteEntry convertToEntry(SiteEntity site, ActifEntry actifEntry) {
        SiteEntry siteEntry = modelMapper.map(site, SiteEntry.class);
        siteEntry.setId(site.getId());
        siteEntry.setName(site.getName());
        siteEntry.setCode(site.getCode());
        siteEntry.setLatitude(site.getLatitude());
        siteEntry.setLongitude(site.getLongitude());
        siteEntry.setBoosters(actifEntry.getBoosters());
        siteEntry.setShips(actifEntry.getShips());
        return siteEntry;
    }
}
