package com.chris.starbase.sites.metier;

public enum NomSite {
    MEGABAY("MegaBay"),
    HIGHBAY("HighBay"),
    ROCKET_GARDEN("Rocket Garden"),
    MASSEY("Massey"),
    SUB_PAD("Pad sub-orbital"),
    ORB_PAD("Pad orbital");

    public final String label;

    private NomSite(String label) {
        this.label = label;
    }
}
