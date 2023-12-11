CREATE TABLE rollenzuordnung (
    id SERIAL PRIMARY KEY,
    vorname VARCHAR(50),
    nachname VARCHAR(50),
    benutzerkennung VARCHAR(20),
    rolle VARCHAR(50),
    saeule VARCHAR(50),
    gueltig_bis DATE
);
