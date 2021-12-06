package org.springframework.samples.petclinic.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Monitor;
import org.springframework.samples.petclinic.repository.MonitorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MonitorService {

	private MonitorRepository monitorRepository;
	
	private UserService userService;
	
	private AuthoritiesService authoritiesService;
	
	@Autowired
	public MonitorService(MonitorRepository monitorRepository, UserService userService, AuthoritiesService authoritiesService) {
		this.monitorRepository = monitorRepository;
		this.userService = userService;
		this.authoritiesService = authoritiesService;
	}
	
	@Transactional(readOnly = true)
	public Optional<Monitor> findById(int id) {
		return this.monitorRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Collection<Monitor> findAll() {
		return this.monitorRepository.findAll();
	}
	
	@Transactional
	public void save(Monitor monitor) throws DataAccessException{
		this.monitorRepository.save(monitor);
		this.userService.saveUser(monitor.getUser());
		this.authoritiesService.saveAuthorities(monitor.getUser().getUsername(), "monitor");
	}
}
