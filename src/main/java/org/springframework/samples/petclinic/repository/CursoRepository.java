package org.springframework.samples.petclinic.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.Curso;

public interface CursoRepository extends Repository<Curso,Integer> {
	
	void save(Curso curso) throws DataAccessException;

}
