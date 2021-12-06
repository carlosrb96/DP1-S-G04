package org.springframework.samples.petclinic.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Administrador;
import org.springframework.samples.petclinic.repository.AdministradorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdministradorService {

	private AdministradorRepository administradorRepository;
	
	@Autowired
	public AdministradorService(AdministradorRepository administradorRepository) {
		this.administradorRepository = administradorRepository;
	}
	
	@Transactional(readOnly = true)
	public Optional<Administrador> findById(int id) {
		return this.administradorRepository.findById(id);
	}
}
