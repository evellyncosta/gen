CREATE TABLE saturno.professor(
	id_professor serial not null,
	nome VARCHAR(50) NOT NULL,
	data_nascimento timestamp,
	rg VARCHAR(9),
	telefone VARCHAR(14),
	logradouro VARCHAR(50),
	numero 	VARCHAR(10),
	complemento VARCHAR(20),
	bairro VARCHAR(50),
	cep VARCHAR(9),
	cidade VARCHAR(30),
	estado VARCHAR(15),
	pais VARCHAR(30),
	is_ativo bool null,
	sexo char(1),
	CONSTRAINT professor_pkey PRIMARY KEY (id_professor)
);







