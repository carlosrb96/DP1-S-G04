package org.springframework.samples.petclinic.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.Membresia;

public interface MembresiaRepository extends Repository<Membresia,Integer> {
	
	void save(Membresia membresia) throws DataAccessException;

}
