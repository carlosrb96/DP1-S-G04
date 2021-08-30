package org.springframework.samples.petclinic.repository;

import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Miembro;

public interface MiembroRepository extends Repository<Miembro,Integer> {
	
	void save(Miembro miembro) throws DataAccessException;
	
	@Query("SELECT miembro FROM Miembro miembro WHERE miembro.id=:id")
	public Optional<Miembro> findById(@Param("id") int id);

}
