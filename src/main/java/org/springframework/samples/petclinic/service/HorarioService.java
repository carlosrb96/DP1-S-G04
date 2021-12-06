package org.springframework.samples.petclinic.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Horario;
import org.springframework.samples.petclinic.repository.HorarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HorarioService {
	
	private HorarioRepository horarioRepository;
	
	@Autowired
	public HorarioService(HorarioRepository horarioRepository) {
		this.horarioRepository = horarioRepository;
	}
	
	@Transactional(readOnly = true)
	public Collection<Horario> findAll() {
		Collection<Horario> result;
		result = this.horarioRepository.findAll();
		return result;
	}

}
