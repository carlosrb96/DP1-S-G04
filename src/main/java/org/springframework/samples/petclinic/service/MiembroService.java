package org.springframework.samples.petclinic.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Miembro;
import org.springframework.samples.petclinic.repository.MiembroRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MiembroService {
	
	private MiembroRepository miembroRepository;
	
	private UserService userService;
	
	private AuthoritiesService authoritiesService;
	
	@Autowired
	public MiembroService(MiembroRepository miembroRepository, UserService userService, AuthoritiesService authoritiesService) {
		this.miembroRepository = miembroRepository;
		this.userService = userService;
		this.authoritiesService = authoritiesService;
	}
	
	@Transactional(readOnly = true)
	public Optional<Miembro> findById(int id) {
		return this.miembroRepository.findById(id);
	}
	
	@Transactional
	public void save(Miembro miembro) throws DataAccessException{
		this.miembroRepository.save(miembro);
		this.userService.saveUser(miembro.getUser());
		this.authoritiesService.saveAuthorities(miembro.getUser().getUsername(),"miembro");
	}

}
