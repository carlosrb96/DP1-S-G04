package org.springframework.samples.petclinic.repository;

import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Membresia;

public interface MembresiaRepository extends Repository<Membresia,Integer> {
	
	void save(Membresia membresia) throws DataAccessException;
	
	@Query("SELECT membresia FROM Membresia membresia WHERE membresia.id=:id")
	public Optional<Membresia> findById(@Param("id") int id);
	
	@Query("SELECT membresia FROM Membresia membresia WHERE membresia.miembro.id:= id")
	public Optional<Membresia> findByMiembroId(@Param("miembroId") int miembroId);
}
