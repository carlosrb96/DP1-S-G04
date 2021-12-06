package org.springframework.samples.petclinic.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.Horario;

public interface HorarioRepository extends Repository<Horario,Integer>{
	
	@Query("SELECT h FROM Horario h")
	public Collection<Horario> findAll();

}
