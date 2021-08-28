package org.springframework.samples.petclinic.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.Sede;

public interface SedeRepository extends Repository<Sede,Integer> {
	
	void save(Sede sede) throws DataAccessException;

}
