package org.springframework.samples.petclinic.model;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "sedes")
public class Sede extends BaseEntity{
	
	@NotEmpty
	@Column(name = "nombre")
	private String nombre;
	
	@NotEmpty
	@Column(name = "direccion")
	private String direccion;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "administrador_id")
	private Administrador administrador;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sede")
	private Collection<Actividad> actividades;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sede")
	private Collection<Curso> cursos;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sede")
	private Collection<Evento> eventos;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

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

	public Collection<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(Collection<Evento> eventos) {
		this.eventos = eventos;
	}

}
