CREATE TABLE saturno.turma_professor (
	id_turma int4 NOT NULL,
	id_professor int4 NOT NULL,	
	CONSTRAINT fk_id_professor FOREIGN KEY (id_professor) REFERENCES saturno.professor(id_professor),
	CONSTRAINT fk_id_turma FOREIGN KEY (id_turma) REFERENCES saturno.turma(id_turma)
);



