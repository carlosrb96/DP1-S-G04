package org.springframework.samples.petclinic.model;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class Horario {

	@NotNull
	private List<Dia> dias;
	
	@NotNull
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime horaInicio;
	
	@NotNull
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime horaFin;
	
	public Horario(List<Dia> dias, LocalTime horaInicio, LocalTime horaFin) {
		super();
		this.dias = dias;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public List<Dia> getDias() {
		return dias;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setDias(List<Dia> dias) {
		this.dias = dias;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}
	
	
}
