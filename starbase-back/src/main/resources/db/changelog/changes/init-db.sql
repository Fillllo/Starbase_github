-- changeset init-db:1 runInTransaction:false
CREATE table sites(
  id uuid DEFAULT gen_random_uuid(),
  name varchar(255),
  code varchar(255),
  latitude VARCHAR(255),
  longitude VARCHAR(255),

  PRIMARY KEY(id)
);

CREATE table boosters(
  id uuid DEFAULT gen_random_uuid(),
  name varchar(255),
  id_site uuid,

  PRIMARY KEY(id)
);

CREATE table ships(
     id uuid DEFAULT gen_random_uuid(),
     name varchar(255),
     id_site uuid,

     PRIMARY KEY(id)
);