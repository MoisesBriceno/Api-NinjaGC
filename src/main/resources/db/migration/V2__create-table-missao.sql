CREATE TABLE missoes (
    id SERIAL PRIMARY KEY,
    ninja_id INTEGER,
    classificacao CHAR(1) NOT NULL,
    tipo_missao VARCHAR(100) NOT NULL,
    status boolean NOT NULL,
    FOREIGN KEY (ninja_id) REFERENCES ninjas(id)
);