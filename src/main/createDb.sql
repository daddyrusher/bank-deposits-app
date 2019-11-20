CREATE DATABASE bank_deposits;
CREATE TABLE clients
(
    id        SERIAL PRIMARY KEY,
    name      VARCHAR NOT NULL,
    shortName VARCHAR NOT NULL,
    address   VARCHAR NOT NULL,
    rulesForm VARCHAR NOT NULL
);

CREATE TABLE banks
(
    id         SERIAL PRIMARY KEY,
    name       VARCHAR NOT NULL,
    bik_number VARCHAR NOT NULL
);

CREATE TABLE deposits
(
    id        SERIAL PRIMARY KEY,
    client_id INTEGER          NOT NULL,
    bank_id   INTEGER          NOT NULL,
    date      DATE             NOT NULL,
    percent   DOUBLE PRECISION NOT NULL,
    period    INT              NOT NULL,
    FOREIGN KEY (client_id) REFERENCES clients (id) ON DELETE CASCADE,
    FOREIGN KEY (bank_id) REFERENCES banks (id) ON DELETE CASCADE
);
