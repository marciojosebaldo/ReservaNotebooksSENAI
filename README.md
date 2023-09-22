# ReservaNotebooksSENAI
Aplicativo destinado para os profissionais reservarem os notebooks do SENAI Pato Branco-PR

Nome do banco de dados: ReservaNotebooksSENAI

CREATE TABLE notebook (
	id serial primary key, 
	numero int not null,
	patrimonio bigint not null unique,
	ativo bool default true)

