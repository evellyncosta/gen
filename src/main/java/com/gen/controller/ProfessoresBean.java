package com.gen.controller;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gen.model.Professor;
import com.gen.service.ProfessorService;


@Named
@ViewScoped
public class ProfessoresBean implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Professor> professores;
     
	     
	    @Inject
	    private ProfessorService professorService;
	     
	     public ProfessoresBean() {
	    	professores = new ArrayList<Professor>();
	    	 
	    	System.out.println("inicio");
	    	LocalDate today = LocalDate.now();
	        Professor professor = new Professor();
	        professor.setId(1L);
	        professor.setNome("teste");
	        professor.setDataNascimento(today);
	        professor.setTelefone("999999999");
	      
	        
	        this.professores.add(professor);

	        
	        
		}
	 
	 
	    public List<Professor> getProfessores() {
	        return professores;
	    }
	 
	    public void setService(ProfessorService service) {
	        this.professorService = service;
	    }
	 
	  
}
