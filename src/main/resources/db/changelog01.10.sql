CREATE TABLE aluno_responsavel (
	id_aluno number(10) NOT NULL,
	id_responsavel number(10) NOT NULL,
	CONSTRAINT fk_id_aluno FOREIGN KEY (id_aluno) REFERENCES saturno.aluno(id_aluno),
	CONSTRAINT fk_id_responsavel FOREIGN KEY (id_responsavel) REFERENCES saturno.responsavel(id_responsavel)
);

