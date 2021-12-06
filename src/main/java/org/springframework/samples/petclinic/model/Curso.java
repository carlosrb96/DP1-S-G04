package org.springframework.samples.petclinic.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="cursos")
public class Curso extends BaseEntity{
	
	@NotEmpty
	@Column(name = "nombre")
	private String nombre;
	
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;

	@NotNull
	@Column(name = "fecha_comienzo")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechaComienzo;
	
	@NotNull
	@Column(name = "fecha_fin")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechaFin;
	
	@OneToOne(optional = false)
	@JoinColumn(name = "horario_id", referencedColumnName = "id")
	private Horario horario;
	
	@NotNull
	@Column(name = "max_inscritos")
	private Integer maxInscritos;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "sede_id")
	private Sede sede;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "monitor_id")
	private Monitor monitor;
	
	

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

	public LocalDate getFechaComienzo() {
		return fechaComienzo;
	}

	public void setFechaComienzo(LocalDate fechaComienzo) {
		this.fechaComienzo = fechaComienzo;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}


	public Integer getMaxInscritos() {
		return maxInscritos;
	}

	public void setMaxInscritos(Integer maxInscritos) {
		this.maxInscritos = maxInscritos;
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
