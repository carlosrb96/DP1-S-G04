package org.springframework.samples.petclinic.repository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Curso;

public interface CursoRepository extends Repository<Curso,Integer> {
	
	void save(Curso curso) throws DataAccessException;
	
	@Query("SELECT curso FROM Curso curso WHERE curso.sede.id=:id")
	public Optional<Curso> findById(@Param("id") int id);
	
	@Query("SELECT curso FROM Curso curso WHERE curso.sede.id=:sedeId")
	public Collection<Curso> findAllBySedeId(@Param("sedeId") int sedeId);
	
	@Query("SELECT curso FROM Curso curso WHERE curso.monitor.id=:monitorId")
	public Collection<Curso> findAllByMonitorId(@Param("monitorId") int monitorId);
	
	@Query("SELECT curso FROM Curso curso WHERE curso.fechaComienzo >: now")
	public Collection<Curso> findAllDisponibles(@Param("now")LocalDate now);

}
