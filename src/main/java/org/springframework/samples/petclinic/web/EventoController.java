package org.springframework.samples.petclinic.web;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Evento;
import org.springframework.samples.petclinic.service.EventoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/eventos")
public class EventoController {

	public static final String EVENTOS_LISTING = "eventos/list";
	
	private EventoService eventoService;
	
	@Autowired
	public EventoController(EventoService eventoService) {
		this.eventoService = eventoService;
	}
	
	@GetMapping(value = "/list")
	public String listEventosDisponibles(Map<String, Object> model) {
		Collection<Evento> eventos;
		eventos = eventoService.findAllDisponibles(LocalDate.now());
		model.put("eventos", eventos);
		return EVENTOS_LISTING;
	}
}
