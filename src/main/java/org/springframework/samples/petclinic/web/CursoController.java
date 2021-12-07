package org.springframework.samples.petclinic.web;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Curso;
import org.springframework.samples.petclinic.service.CursoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cursos")
public class CursoController {
	
	public static final String CURSOS_LISTING = "cursos/list";
	
	private CursoService cursoService;
	
	@Autowired
	public CursoController(CursoService cursoService) {
		this.cursoService = cursoService;
	}
	
	@GetMapping(value = "/list")
	public String listCursosDisponibles(Map<String,Object> model) {
		Collection<Curso> cursos;
		cursos = cursoService.findAllDisponibles(LocalDate.now());
		model.put("cursos", cursos);
		return CURSOS_LISTING;
	}

}
