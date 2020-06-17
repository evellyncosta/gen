package com.gen.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.gen.model.Aluno;

public class Alunos implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public Alunos() {

	}

	public Alunos(EntityManager manager) {
		this.manager = manager;
	}

	public Aluno porId(Long id) {
		return manager.find(Aluno.class, id);
	}

	public List<Aluno> pesquisar(String nome) {
		String jpql = "from Aluno where nome like :nome";
		
		TypedQuery<Aluno> query = manager
				.createQuery(jpql, Aluno.class);
		
		query.setParameter("nome", nome + "%");
		
		return query.getResultList();
	}
	
	public List<Aluno> todos() {
         return manager.createQuery("from Aluno", Aluno.class).getResultList();
    }

	public Aluno guardar(Aluno Aluno) {
		return manager.merge(Aluno);
	}

	public void remover(Aluno Aluno) {
		Aluno = porId(Aluno.getId());
		manager.remove(Aluno);
	}

}
