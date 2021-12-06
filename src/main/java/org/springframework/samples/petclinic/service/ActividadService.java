package org.springframework.samples.petclinic.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Actividad;
import org.springframework.samples.petclinic.repository.ActividadRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ActividadService {
	
	private ActividadRepository actividadRepository;
	
	@Autowired
	public ActividadService(ActividadRepository actividadRepository) {
		this.actividadRepository = actividadRepository;
	}
	
	public Collection<Actividad> findAll(){
		Collection<Actividad> result;
		result = actividadRepository.findAll();
		return result;
	}
	
	@Transactional(readOnly = true)
	public Optional<Actividad> findById(int id) {
		return this.actividadRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Collection<Actividad> findAllBySedeId(int sedeId) {
		return this.actividadRepository.findAllBySedeId(sedeId);
	}
	
	@Transactional(readOnly = true)
	public Collection<Actividad> findAllByMonitorId(int monitorId) {
		return this.actividadRepository.findAllByMonitorId(monitorId);
	}
	
	
	@Transactional
	public void save(Actividad actividad) throws DataAccessException{
		this.actividadRepository.save(actividad);
	}

}
