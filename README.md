# ReservaNotebooksSENAI
Aplicativo destinado para os profissionais reservarem os notebooks do SENAI Pato Branco-PR

Nome do banco de dados: ReservaNotebooksSENAI

CREATE TABLE notebook (
	id serial primary key, 
	numero int not null,
	patrimonio bigint not null unique,
	ativo bool default true);

CREATE TABLE ocupacao (
	id serial primary key,
	nome varchar(255)
);

INSERT INTO ocupacao (nome) VALUES ('Gestor(a)'), ('Bibliotecário(a)'), ('Professor(a)');

CREATE TABLE usuario ( 
	id serial primary key,
	nome VARCHAR(255) not null,
	ocupacao bigint not null,
	matricula bigint not null unique,
	email VARCHAR(255) not null,
	senha VARCHAR(255) not null,
	ativo bool,
	foreign key (ocupacao) references ocupacao(id));

INSERT INTO usuario (nome, ocupacao, matricula, email, senha, ativo) VALUES ('marcio', 1, 123, 'marcio@marcio', '123', true);
