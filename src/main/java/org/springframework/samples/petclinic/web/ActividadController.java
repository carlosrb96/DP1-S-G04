package org.springframework.samples.petclinic.web;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Actividad;
import org.springframework.samples.petclinic.service.ActividadService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/actividades")
public class ActividadController {
	
	public static final String ACTIVIDAD_LISTING = "actividades/list";
	
	private final ActividadService actividadService;
	
	@Autowired
	public ActividadController(ActividadService actividadService) {
		this.actividadService = actividadService;
	}
	
	@InitBinder
	public void setAllowedFields(WebDataBinder dataBinder) {
		dataBinder.setDisallowedFields("id");
	}
	
	
	
	@GetMapping(value = "/list")
	public String listActividadesDisponibles(Map<String,Object> model) {
		Collection<Actividad> actividades;
		actividades = actividadService.findAll();
		model.put("actividades", actividades);
		return ACTIVIDAD_LISTING;
	}
	

}
