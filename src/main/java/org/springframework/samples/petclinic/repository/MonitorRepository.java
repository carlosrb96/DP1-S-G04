package org.springframework.samples.petclinic.repository;


import java.util.Collection;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Monitor;

public interface MonitorRepository extends Repository<Monitor,Integer> {
	
	void save(Monitor monitor) throws DataAccessException;
	
	@Query("SELECT monitor FROM Monitor monitor WHERE monitor.id=:id")
	public Optional<Monitor> findById(@Param("id") int id);
	
	@Query("SELECT m FROM Monitor m")
	public Collection<Monitor> findAll();

}
