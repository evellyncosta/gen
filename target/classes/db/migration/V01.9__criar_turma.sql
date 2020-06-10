CREATE TABLE saturno.turma(
	id_turma serial not null,
	id_curso int4 not null,
	nome VARCHAR(50)  NULL,
	turno VARCHAR(15) NULL,
	data_inicio timestamp,
	data_encerramento timestamp,
	CONSTRAINT turma_pkey PRIMARY KEY (id_turma),
	CONSTRAINT fk_id_curso FOREIGN KEY (id_curso) REFERENCES saturno.curso(id_curso)
);






