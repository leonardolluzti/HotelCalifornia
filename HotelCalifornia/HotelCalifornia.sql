CREATE DATABASE hotel;
USE hotel;
create table hotel(
	matricula INT NOT NULL,
    nome VARCHAR(255) NOT NULL,
    valordiaria FLOAT NULL,
    cidade VARCHAR(255) NULL,
    estrelas FLOAT NULL,
    PRIMARY KEY (matricula)
);

ALTER TABLE hotel
CHANGE COLUMN matricula matricula INT(11) NOT NULL AUTO_INCREMENT,
ADD UNIQUE INDEX id_UNIQUE (matricula ASC);
