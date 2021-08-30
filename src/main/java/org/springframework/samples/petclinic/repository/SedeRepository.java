package org.springframework.samples.petclinic.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Sede;

public interface SedeRepository extends Repository<Sede,Integer> {
	
	void save(Sede sede) throws DataAccessException;
	
	@Query("SELECT sede FROM Sede sede WHERE sede.id=:id")
	public Optional<Sede> findById(@Param("id") int id);
	
	@Query("SELECT sede FROM Sede sede WHERE sede.administrador.id=:administradorId")
	public Collection<Sede> findAllByAdministradorId(@Param("administradorId") int administradorId);	

}
