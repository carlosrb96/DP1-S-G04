package org.springframework.samples.petclinic.model;

import java.util.Collection;

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

@Entity
@Table(name = "actividades")
public class Actividad extends BaseEntity {

	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;
	
	@NotNull
	@Column(name = "categoria")
	private Categoria categoria;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "sede_id")
	public Sede sede;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="monitor_id")
	private Monitor monitor;
	
	@JoinTable(
	        name = "rel_actividades_horarios",
	        joinColumns = @JoinColumn(name = "actividad_id", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="horario_id", nullable = false)
	    )
	@ManyToMany(cascade = CascadeType.ALL)
	private Collection<Horario> horarios;
	
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	public Collection<Horario> getHorarios() {
		return horarios;
	}
	
	public void setHorarios(Collection<Horario> horarios) {
		this.horarios = horarios;
	}
}
