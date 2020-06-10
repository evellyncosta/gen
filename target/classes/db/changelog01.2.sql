CREATE TABLE usuario (
	id_usuario number(10) NOT NULL,
	nome varchar2(250) NULL,
	email varchar2(250) NULL,
	senha varchar2(500) NULL,
	dt_criacao timestamp NULL,
	fl_ativo char(1) NULL,
	CONSTRAINT usuario_email_key UNIQUE (email),
	CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE saturno.usuario_seq START WITH 1 INCREMENT BY 1;
