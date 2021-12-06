package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "miembros")
public class Miembro extends Person{
	
	@NotEmpty
	@Column(name = "dni")
	private String dni;
	
	@NotEmpty
	@Column(name = "direccion")
	private String direccion;
	
	
	
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	


}
