package org.springframework.samples.petclinic.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "eventos")
public class Evento extends BaseEntity{
	
	@NotEmpty
	@Column(name = "nombre")
	private String nombre;
	
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	
	@NotNull
	@Column(name = "fecha")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate fecha;
	
	@NotNull
	@Column(name = "hora")
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime hora;
	
	@Column(name = "lugar")
	private String lugar;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "sede_id")
	private Sede sede;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "monitor_id")
	private Monitor monitor;
	
	@JoinTable(
	        name = "rel_eventos_miembros",
	        joinColumns = @JoinColumn(name = "evento_id", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="miembro_id", nullable = false)
	    )
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Miembro> asistentes;
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


}
