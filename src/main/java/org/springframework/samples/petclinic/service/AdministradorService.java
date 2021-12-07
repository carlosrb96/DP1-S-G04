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
	
	private UserService userService;
	
	@Autowired
	public AdministradorService(AdministradorRepository administradorRepository, UserService userService) {
		this.administradorRepository = administradorRepository;
		this.userService = userService;
	}
	
	@Transactional(readOnly = true)
	public Optional<Administrador> findById(int id) {
		return this.administradorRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Administrador findDirectorByPrincipal() {
		Administrador result;
		org.springframework.security.core.userdetails.User user;
		user = userService.findPrincipal();
		result = findAdministradorByUserName(user.getUsername());

		return result;

	}
	
	@Transactional(readOnly = true)
	private Administrador findAdministradorByUserName(String adminUserName) {
		Administrador result;
		result = administradorRepository.findByUserName(adminUserName);
		return result;
	}
}
