package com.gen.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;



import com.gen.model.Aluno;
import com.gen.repository.Alunos;
import com.gen.util.FacesMessages;


@Named
@ViewScoped
public class AlunosBean implements Serializable{
	  private static final long serialVersionUID = 1L;
	    private List<Aluno> listaAluno;
	    
	    @Inject
	    private Alunos alunos;    
	    
	    @Inject
	    private FacesMessages messages;
	    
	    private String termoPesquisa;
	    
	    public void pesquisar() {
	    	listaAluno = alunos.pesquisar(termoPesquisa);
	    	
	    	 if (listaAluno.isEmpty()) {
	             messages.info("Nenhum aluno encontrado.");
	         }
	    }
	    
	    public void todosAlunos() {
	    	listaAluno = alunos.todos();
	    }	        
	

		public List<Aluno> getListaAluno() {
			return listaAluno;
		}

	
		public String getTermoPesquisa() {
			return termoPesquisa;
		}


		public void setTermoPesquisa(String termoPesquisa) {
			this.termoPesquisa = termoPesquisa;
		}
	    

}
