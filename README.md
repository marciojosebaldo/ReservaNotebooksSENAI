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

INSERT INTO usuario (nome, ocupacao, matricula, email, senha, ativo) VALUES ('marcio', 1, 123, 'marcio@marcio', '123', true), ('lucas', 3, 1234, 'lucas@lucas', '1234', true);

CREATE TABLE reserva (
	id Serial primary key,
	id_usuario bigint not null, 
	foreign key (id_usuario) references usuario(id),
	quantidade bigint not null,
	data_ini date not null,
	data_fin date not null,
	hora_ini time not null,
	hora_fin time not null,
	hora_reg date not null);

CREATE TABLE reserva_notes (
	id_note bigint not null,
	foreign key (id_note) references notebook(id),
	id_reserva bigint not null,
	foreign key (id_reserva) references reserva (id),
	primary key(id_note,id_reserva)
);

INSERT INTO reserva (id_usuario, quantidade, data_ini, data_fin, hora_ini, hora_fin, hora_reg) 
VALUES (1, 10, '10/10/2023', '10/10/2023', '7:00', '12:00', '09/10/2023');
