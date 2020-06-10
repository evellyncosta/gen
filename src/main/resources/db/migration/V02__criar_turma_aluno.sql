CREATE TABLE saturno.turma_aluno (	
	id_turma int4 NOT NULL,
	id_aluno int4 NOT NULL,
	CONSTRAINT fk_id_aluno FOREIGN KEY (id_aluno) REFERENCES saturno.aluno(id_aluno),
	CONSTRAINT fk_id_turma FOREIGN KEY (id_turma) REFERENCES saturno.turma(id_turma)
);



