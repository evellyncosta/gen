CREATE TABLE responsavel(
	id_responsavel number(10) not null,
	nome VARCHAR2(50) NOT NULL,
	data_nascimento timestamp,
	rg VARCHAR2(9),
	telefone VARCHAR2(14),
	logradouro VARCHAR2(50),
	numero 	VARCHAR2(10),
	complemento VARCHAR2(20),
	bairro VARCHAR2(50),
	cep VARCHAR2(9),
	cidade VARCHAR2(30),
	estado VARCHAR2(15),
	pais VARCHAR2(30),
	is_ativo char(1) null,
	sexo char(1),
	CONSTRAINT responsavel_pkey PRIMARY KEY (id_responsavel)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE responsavel_seq START WITH 1 INCREMENT BY 1;