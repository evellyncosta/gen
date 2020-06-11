package com.gen.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.gen.enums.Sexo;

public class Responsavel {
	
	private Long id;
	
	private String nome;
	

	private LocalDate dataNascimento;	
	
	private String rg;
	
	private String cpf;
	
	private String telefone;
	
	@Embedded
	private Endereco endereco;

	
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
}
