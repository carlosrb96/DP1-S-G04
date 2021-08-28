package org.springframework.samples.petclinic.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "monitores")
public class Monitor extends Person{

	@NotEmpty
	@Column(name = "dni")
	private String dni;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "monitor")
	private List<Actividad> actividades;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "monitor")
	private List<Curso> cursos;
	
	
	
	
	public String getDni() {
		return dni;
	}
	
}
