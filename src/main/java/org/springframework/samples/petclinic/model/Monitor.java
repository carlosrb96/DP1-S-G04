package org.springframework.samples.petclinic.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "monitores")
public class Monitor extends Person{

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "monitor")
	private Collection<Actividad> actividades;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "monitor")
	private Collection<Curso> cursos;
	

	public Collection<Actividad> getActividades() {
		return actividades;
	}


	public void setActividades(Collection<Actividad> actividades) {
		this.actividades = actividades;
	}


	public Collection<Curso> getCursos() {
		return cursos;
	}


	public void setCursos(Collection<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
	
}
