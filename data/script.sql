create table marque (
    id serial primary key,
    nom varchar(250)
);
create table vehicule (
    id serial primary key,
    numero varchar(100),
    modele varchar(200),
    id_marque int references marque(id)
);

insert into marque (nom) VALUES
('Renault'),
('Karenjy'),
('Mercedes');

INSERT INTO vehicule VALUES
(default, '1234TBA', 'Duster', 1),
(default, '4567TBJ', 'Mazana 2', 2),
(default, '1547TBN', 'Sprinter', 3);

CREATE table kilometrage (
    id serial primary key,
    id_vehicule int references vehicule(id),
    debut_km numeric,
    fin_km numeric
);


create table utilisateur (
    id serial primary key,
    nom varchar(250),
    email varchar(250),
    passorwd varchar(250)
);

insert into utilisateur (nom, email, passwd) VALUES
('Rakoto', 'rakoto@rakoto.com', 'rakoto');

alter table kilometrage add column date_creation date;