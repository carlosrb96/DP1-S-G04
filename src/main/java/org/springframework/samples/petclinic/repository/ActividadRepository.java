package org.springframework.samples.petclinic.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Actividad;

public interface ActividadRepository extends Repository<Actividad,Integer> {
	
	void save(Actividad actividad) throws DataAccessException;
	
	@Query("SELECT actividad FROM Actividad actividad WHERE actividad.id=:id")
	public Optional<Actividad> findById(@Param("id") int id);
	
	@Query("SELECT actividad FROM Actividad actividad WHERE actividad.sede.id=:sedeId")
	public Collection<Actividad> findAllBySedeId(@Param("sedeId")int sedeId);
	
	@Query("SELECT actividad FROM Actividad actividad WHERE actividad.monitor.id=:monitorId")
	public Collection<Actividad> findAllByMonitorId(@Param("monitorId") int monitorId);

}
