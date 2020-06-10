CREATE TABLE turma(
	id_turma number(10) not null,
	id_curso number(10) not null,
	nome VARCHAR2(50)  NULL,
	turno VARCHAR2(15) NULL,
	data_inicio timestamp,
	data_encerramento timestamp,
	CONSTRAINT turma_pkey PRIMARY KEY (id_turma),
	CONSTRAINT fk_id_curso FOREIGN KEY (id_curso) REFERENCES saturno.curso(id_curso)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE saturno.turma_seq START WITH 1 INCREMENT BY 1;