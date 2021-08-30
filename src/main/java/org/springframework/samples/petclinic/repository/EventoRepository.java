package org.springframework.samples.petclinic.repository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Evento;

public interface EventoRepository extends Repository<Evento,Integer> {
	
	void save(Evento evento) throws DataAccessException;
	
	@Query("SELECT evento FROM Eventoevento WHERE evento.id=:id")
	public Optional<Evento> findById(@Param("id") int id);
	
	@Query("SELECT evento FROM Evento evento WHERE evento.sede.id =: sedeId")
	public Collection<Evento> findAllBySedeId(@Param("sedeId") int sedeId);
	
	@Query("SELECT evento FROM Evento evento WHERE evento.fecha >: now")
	public Collection<Evento> findAllDisponibles(@Param("now")LocalDate now);

}
