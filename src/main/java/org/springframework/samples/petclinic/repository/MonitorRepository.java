package org.springframework.samples.petclinic.repository;


import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.Monitor;

public interface MonitorRepository extends Repository<Monitor,Integer> {
	
	void save(Monitor monitor) throws DataAccessException;

}
