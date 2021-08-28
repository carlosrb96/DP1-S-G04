package org.springframework.samples.petclinic.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "miembros")
public class Miembro extends Person{
	
	@NotEmpty
	@Column(name = "dni")
	private String dni;
	
	@NotEmpty
	@Column(name = "direccion")
	private String direccion;
	
	@ManyToMany(mappedBy = "asistentes")
	private List<Evento> eventos;
	
	@ManyToMany(mappedBy = "inscritos")
	private List<Curso> cursos;
	
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public List<Evento> getEventos() {
		return eventos;
	}
	
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}
	
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

}
