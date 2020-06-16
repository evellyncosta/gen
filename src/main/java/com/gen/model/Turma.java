package com.gen.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.gen.enums.Turno;

@Entity
@Table(name = "turma")
public class Turma implements Serializable{


private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_turma")
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private LocalDate horario;
	
	@Column
	private Curso curso;
	
	@Column
	private Turno turno;
	
	@Column
	private Integer ciclo;
	
	@Column(name = "data_inicio")
	private LocalDate dataInicio;
	
	@Column(name = "data_encerramento")
	private LocalDate dataEncerramento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getHorario() {
		return horario;
	}

	public void setHorario(LocalDate horario) {
		this.horario = horario;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public Integer getCiclo() {
		return ciclo;
	}

	public void setCiclo(Integer ciclo) {
		this.ciclo = ciclo;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(LocalDate dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}
	

}
