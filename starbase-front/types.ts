export interface Site {
    id: string;
    name: string;
    code: string;
    latitude: Number;
    longitude: Number;
    ships: Ship[];
    boosters: Booster[];
}

export interface Ship {
    id: string;
    name: string;
    code: string;
    siteId: string;
}

export interface Booster {
    id: string;
    name: string;
    code: string;
    siteId: string;
}