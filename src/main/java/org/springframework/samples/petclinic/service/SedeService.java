package org.springframework.samples.petclinic.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Sede;
import org.springframework.samples.petclinic.repository.SedeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SedeService {

	private SedeRepository sedeRepository;
	
	@Autowired
	public SedeService(SedeRepository sedeRepository) {
		this.sedeRepository = sedeRepository;
	}
	
	@Transactional(readOnly = true)
	public Optional<Sede> findById(int id) {
		return this.sedeRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Collection<Sede> findAllByAdministradorId(int administradorId) {
		return this.sedeRepository.findAllByAdministradorId(administradorId);
	}
	
	@Transactional
	public void save(Sede sede) throws DataAccessException{
		this.sedeRepository.save(sede);
	}
}
