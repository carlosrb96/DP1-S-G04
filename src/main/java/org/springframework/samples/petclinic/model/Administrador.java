package org.springframework.samples.petclinic.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "administradores")
public class Administrador extends Person {

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "administrador")
	private List<Membresia> membresias;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "administrador")
	private List<Sede> sedes;
	
	
	public List<Membresia> getMembresias() {
		return membresias;
	}
	
	public void setMembresias(List<Membresia> membresias) {
		this.membresias = membresias;
	}
	
	public List<Sede> getSedes() {
		return sedes;
	}
	
	public void setSedes(List<Sede> sedes) {
		this.sedes = sedes;
	}
}
