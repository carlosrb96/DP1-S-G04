package org.springframework.samples.petclinic.service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Curso;
import org.springframework.samples.petclinic.repository.CursoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CursoService {

	private CursoRepository cursoRepository;
	
	@Autowired
	public CursoService(CursoRepository cursoRepository) {
		this.cursoRepository = cursoRepository;
	}
	
	@Transactional(readOnly = true)
	public Optional<Curso> findById(int id) {
		return this.cursoRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Collection<Curso> findAllBySedeId(int sedeId) {
		return this.cursoRepository.findAllBySedeId(sedeId);
	}
	
	@Transactional(readOnly = true)
	public Collection<Curso> findAllByMonitorId(int monitorId) {
		return this.cursoRepository.findAllByMonitorId(monitorId);
	}
	
	@Transactional(readOnly = true)
	public Collection<Curso> findAllDisponibles(LocalDate now) {
		return this.cursoRepository.findAllDisponibles(now);
	}
	
	@Transactional
	public void save(Curso curso) throws DataAccessException{
		this.cursoRepository.save(curso);
	}
	
}
