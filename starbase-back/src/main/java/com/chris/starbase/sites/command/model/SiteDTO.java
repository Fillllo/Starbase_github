package com.chris.starbase.sites.command.model;

import com.chris.starbase.sites.metier.NomSite;
import lombok.Data;

@Data
public class SiteDTO {
    private NomSite name;
    private String code;
    private String latitude;
    private String longitude;
}
