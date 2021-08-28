package org.springframework.samples.petclinic.model;

import java.time.LocalDate;
import java.util.List;

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
	
	@Embedded
	private LocalDate horario;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "administrador_id")
	private Administrador administrador;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sede")
	private List<Actividad> actividades;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sede")
	private List<Curso> cursos;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sede")
	private List<Evento> eventos;
	
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
	
	public LocalDate getHorario() {
		return horario;
	}
	
	public void setHorario(LocalDate horario) {
		this.horario = horario;
	}

}
