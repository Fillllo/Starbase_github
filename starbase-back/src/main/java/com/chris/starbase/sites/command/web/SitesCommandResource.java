package com.chris.starbase.sites.command.web;

import com.chris.starbase.sites.command.dataservice.SiteCommandDataService;
import com.chris.starbase.sites.command.model.SiteDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sites")
public class SitesCommandResource {
    private final SiteCommandDataService siteCommandDataService;

    public SitesCommandResource(SiteCommandDataService siteCommandDataService) {
        this.siteCommandDataService = siteCommandDataService;
    }

    @PostMapping("/add")
    void addSite(@RequestBody SiteDTO siteDTO) {
        siteCommandDataService.addSite(siteDTO);
    }
}
