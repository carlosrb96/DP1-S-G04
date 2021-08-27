package org.springframework.samples.petclinic.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
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
@Table(name="cursos")
public class Curso extends BaseEntity{
	
	@NotEmpty
	@Column(name = "nombre")
	private String nombre;
	
	@NotEmpty
	@Column(name = "descripcion")
	private String descripcion;

	@NotNull
	@Column(name = "fechaComienzo")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechaComienzo;
	
	@NotNull
	@Column(name = "fechaFin")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechaFin;
	
	@Embedded
	private Horario horario;
	
	@NotNull
	@Column(name = "numeroInscritos")
	private Integer numeroInscritos;
	
	@NotNull
	@Column(name = "numeroMaximoInscritos")
	private Integer numeroMaximoInscritos;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "sede_id")
	private Sede sede;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "monitor_id")
	private Monitor monitor;
	
	@JoinTable(
	        name = "rel_cursos_miembros",
	        joinColumns = @JoinColumn(name = "curso_id", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="miembro_id", nullable = false)
	    )
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Miembro> inscritos;

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

	public Integer getNumeroInscritos() {
		return numeroInscritos;
	}

	public void setNumeroInscritos(Integer numeroInscritos) {
		this.numeroInscritos = numeroInscritos;
	}

	public Integer getNumeroMaximoInscritos() {
		return numeroMaximoInscritos;
	}

	public void setNumeroMaximoInscritos(Integer numeroMaximoInscritos) {
		this.numeroMaximoInscritos = numeroMaximoInscritos;
	}
}
