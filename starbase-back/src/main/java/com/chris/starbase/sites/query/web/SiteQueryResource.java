package com.chris.starbase.sites.query.web;

import com.chris.starbase.sites.query.dataservice.SiteQueryDataService;
import com.chris.starbase.sites.query.entry.SiteEntry;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/sites")
@CrossOrigin
public class SiteQueryResource {
    private final SiteQueryDataService siteQueryDataService;

    public SiteQueryResource(SiteQueryDataService siteQueryDataService) {
        this.siteQueryDataService = siteQueryDataService;
    }

    @GetMapping("/get/{id}")
    SiteEntry getSite(@PathVariable UUID id) throws Exception {
        return siteQueryDataService.getSite(id);
    }

    @GetMapping("/get/all")
    List<SiteEntry> getSite() throws Exception {
        return siteQueryDataService.getAllSites();
    }
}
