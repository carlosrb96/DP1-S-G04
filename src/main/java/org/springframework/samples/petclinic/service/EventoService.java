package org.springframework.samples.petclinic.service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Evento;
import org.springframework.samples.petclinic.repository.EventoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EventoService {

	private EventoRepository eventoRepository;
	
	@Autowired
	public EventoService(EventoRepository eventoRepository) {
		this.eventoRepository = eventoRepository;
	}
	
	@Transactional(readOnly = true)
	public Optional<Evento> findById(int id) {
		return this.eventoRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Collection<Evento> findAllBySedeId(int sedeId) {
		return this.eventoRepository.findAllBySedeId(sedeId);
	}
	
	@Transactional(readOnly = true)
	public Collection<Evento> findAllDisponibles(LocalDate now) {
		return this.eventoRepository.findAllDisponibles(now);
	}
	
	@Transactional
	public void save(Evento evento) throws DataAccessException{
		this.eventoRepository.save(evento);
	}
}
