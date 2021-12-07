package org.springframework.samples.petclinic.web;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Evento;
import org.springframework.samples.petclinic.model.Sede;
import org.springframework.samples.petclinic.service.AdministradorService;
import org.springframework.samples.petclinic.service.EventoService;
import org.springframework.samples.petclinic.service.SedeService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/eventos")
public class EventoController {

	public static final String EVENTOS_LISTING = "eventos/list";
	public static final String EVENTOS_CREATE_OR_UPDATE_FORM = "eventos/createOrUpdateForm";
	
	private EventoService eventoService;
	
	private SedeService sedeService;
	
	private AdministradorService adminService;
	
	@Autowired
	public EventoController(EventoService eventoService,SedeService sedeService, AdministradorService adminService) {
		this.eventoService = eventoService;
		this.sedeService = sedeService;
		this.adminService = adminService;
	}
	
	@InitBinder
	public void setAllowedFields(WebDataBinder dataBinder) {
		dataBinder.setDisallowedFields("id");
	}
	
	@GetMapping(value = "/list")
	public String listEventosDisponibles(Map<String, Object> model) {
		Collection<Evento> eventos;
		eventos = eventoService.findAllDisponibles(LocalDate.now());
		model.put("eventos", eventos);
		return EVENTOS_LISTING;
	}
	
	@GetMapping("/new")
	public String initCreationForm(Map<String,Object> model) {
		Evento evento = new Evento();
		Collection<Sede> sedes;
		sedes = sedeService.findAllByAdministradorId(adminService.findDirectorByPrincipal().getId());
		model.put("evento", evento);
		model.put("sedes", sedes);
		return EVENTOS_CREATE_OR_UPDATE_FORM;
	}
	
	@PostMapping(value = "/new")
	public String processCreationForm(@Valid Evento evento, BindingResult result) {
		if (result.hasErrors()) {
			return EVENTOS_CREATE_OR_UPDATE_FORM;
		} else {
			if(evento.getFecha().isBefore(LocalDate.now())) {
				result.rejectValue("fecha", "Futuro", "La Fecha debe ser posterior a la fecha actual");
				return EVENTOS_CREATE_OR_UPDATE_FORM;
			}
			
			this.eventoService.save(evento);

			return "redirect:/eventos/show/" + evento.getId();
		}
	}
	
	@GetMapping(value = "/show/{evento_id}")
	public ModelAndView showEvento(@PathVariable("evento_id") int eventoId) {
		ModelAndView mav = new ModelAndView("eventos/show");
		Evento evento = this.eventoService.findById(eventoId).get();
		mav.addObject(evento);
		return mav;
	}
}
