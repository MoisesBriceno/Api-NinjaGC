CREATE TABLE ninjas (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    vila VARCHAR(100) NOT NULL,
    status boolean  NOT NULL,
    nivel_experiencia VARCHAR(100) NOT NULL
);