CREATE TABLE usuario_perfil (
	id_perfil number(10) NOT NULL,
	id_usuario number(10) NOT NULL,
	CONSTRAINT fk_id_perfil FOREIGN KEY (id_perfil) REFERENCES saturno.perfil(id_perfil),
	CONSTRAINT fk_id_usuario FOREIGN KEY (id_usuario) REFERENCES saturno.usuario(id_usuario)
);