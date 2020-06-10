CREATE TABLE curso(
	id_curso number(10) not null,
	nome VARCHAR2(50) NOT NULL,
	is_ativo char(1) null,
	CONSTRAINT curso_pkey PRIMARY KEY (id_curso)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE saturno.curso_seq START WITH 1 INCREMENT BY 1;