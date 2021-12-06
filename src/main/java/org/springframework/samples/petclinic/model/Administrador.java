package org.springframework.samples.petclinic.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "administradores")
public class Administrador extends Person {

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "administrador")
	private Collection<Sede> sedes;
	
	
	public Collection<Sede> getSedes() {
		return sedes;
	}
	
	public void setSedes(Collection<Sede> sedes) {
		this.sedes = sedes;
	}
}
