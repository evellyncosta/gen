CREATE TABLE perfil(
	id_perfil number(10) not null,
	perfil varchar2(20) NOT NULL,
	CONSTRAINT perfil_pkey PRIMARY KEY (id_perfil)
);

-- Generate ID using sequence and trigger
CREATE SEQUENCE saturno.perfil_seq START WITH 1 INCREMENT BY 1;