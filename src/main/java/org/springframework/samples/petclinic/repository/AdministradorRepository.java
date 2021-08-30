package org.springframework.samples.petclinic.repository;

import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Administrador;

public interface AdministradorRepository extends Repository<Administrador, Integer> {
	
	void save(Administrador administrador) throws DataAccessException;
	
	@Query("SELECT administrador FROM Administrador administrador WHERE administrador.id=:id")
	public Optional<Administrador> findById(@Param("id") int id);

}
