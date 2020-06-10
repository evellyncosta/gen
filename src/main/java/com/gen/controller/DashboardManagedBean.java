package com.gen.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DashboardManagedBean {
	private DashboardModel model;

	public DashboardManagedBean(){
		
		// Initialize the dashboard model
		this.model = new DefaultDashboardModel();
		// Initialize the dashboard column #1
		DashboardColumn column1 = new DefaultDashboardColumn();
		// Initialize the dashboard column #2
		DashboardColumn column2 = new DefaultDashboardColumn();
		// Initialize the dashboard column #3
		DashboardColumn column3 = new DefaultDashboardColumn();

		// Add widget into column1
		column1.addWidget("alunosMatriculados");
		// Add widget into column2
		column2.addWidget("alunosInadimplentes");
		// Add widget into column3
		column3.addWidget("alunosFaltosos");		
		
		
		// Add columns into your model
		this.model.addColumn(column1);
		this.model.addColumn(column2);
		this.model.addColumn(column3);
		
	}

	public DashboardModel getModel() {
		return model;
	}

	public void setModel(DashboardModel model) {
		this.model = model;
	}
}