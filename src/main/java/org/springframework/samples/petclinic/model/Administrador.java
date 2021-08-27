package org.springframework.samples.petclinic.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "administradores")
public class Administrador extends Person {

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "administrador")
	private List<Membresia> membresias;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "administrador")
	private List<Sede> sedes;
}
