package org.springframework.samples.petclinic.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "membresias")
public class Membresia extends BaseEntity {
	
	@NotNull
	@Column(name = "fechaSuscripcion")
	private LocalDate fechaSuscripcion;
	
	@NotNull
	@Column(name = "suscripcion")
	private Suscripcion suscripcion;
	
	@NotNull
	@Column(name = "precio")
	private Double precio;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "administrador_id")
	private Administrador administrador;

	public LocalDate getFechaSuscripcion() {
		return fechaSuscripcion;
	}

	public void setFechaSuscripcion(LocalDate fechaSuscripcion) {
		this.fechaSuscripcion = fechaSuscripcion;
	}

	public Suscripcion getSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(Suscripcion suscripcion) {
		switch (suscripcion) {
		case ANUAL:
			this.suscripcion = suscripcion;
			this.precio = 79.99;
			break;
		case MENSUAL:
			this.suscripcion = suscripcion;
			this.precio = 29.99;
			break;
		case DIARIA:
			this.suscripcion = suscripcion;
			this.precio = 1.99;

		default:
			break;
		}
	}

	public Double getPrecio() {
		return precio;
	}


}
