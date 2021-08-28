package org.springframework.samples.petclinic.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.Miembro;

public interface MiembroRepository extends Repository<Miembro,Integer> {
	
	void save(Miembro miembro) throws DataAccessException;

}
