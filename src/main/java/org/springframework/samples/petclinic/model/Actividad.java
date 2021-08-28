package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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
	
	@Embedded
	private Horario horario;
	
	@NotNull
	@Column(name = "categoria")
	private Categoria categoria;

	@NotEmpty
	public String getDescripcion() {
		return descripcion;
	}
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "sede_id")
	public Sede sede;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="monitor_id")
	private Monitor monitor;
	
	

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Horario getHorario() {
		return horario;
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
}
