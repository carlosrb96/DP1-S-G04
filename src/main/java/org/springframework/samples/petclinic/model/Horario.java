package org.springframework.samples.petclinic.model;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "horarios")
public class Horario extends BaseEntity{

	
	@NotNull	
	@Column(name = "dia")
	private Dia dia;
	
	@Column(name = "hora_inicio")
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime horaInicio;
	
	@Column(name = "hora_fin")
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime horaFin;
	

	public Dia getDia() {
		return dia;
	}
	
	public void setDia(Dia dia) {
		this.dia = dia;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}
	
	
}
