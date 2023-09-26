# ReservaNotebooksSENAI
Aplicativo destinado para os profissionais reservarem os notebooks do SENAI Pato Branco-PR

Nome do banco de dados: ReservaNotebooksSENAI

CREATE TABLE notebook (
	id serial primary key, 
	numero int not null,
	patrimonio bigint not null unique,
	ativo bool default true)

CREATE TABLE usuario (
	id serial primary key,
	nome VARCHAR(255) not null,
	ocupacao VARCHAR(255),
	matricula bigint not null unique, 
	email VARCHAR(255),
	senha VARCHAR(255))

