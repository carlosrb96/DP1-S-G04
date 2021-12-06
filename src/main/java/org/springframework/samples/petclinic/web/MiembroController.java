package org.springframework.samples.petclinic.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Miembro;
import org.springframework.samples.petclinic.service.MiembroService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/miembros")
public class MiembroController {
	
	private static final String CREATE_UPDATE_FORM = "miembro/createOrUpdateForm";
	
	private MiembroService miembroService;
	
	@Autowired
	public MiembroController(MiembroService miembroService) {
		this.miembroService = miembroService;
	}
	
	@InitBinder
	public void setAllowedFiels(WebDataBinder dataBinder) {
		dataBinder.setDisallowedFields("id");
	}
	
	@GetMapping(value = "/miembro/new")
	public String initCreationForm(Map<String,Object> model) {
		Miembro miembro = new Miembro();
		model.put("miembro", miembro);
		return CREATE_UPDATE_FORM;
	}
	
//	@PostMapping(value = "/miembro/new")
//	public String processCreationForm(@Valid Miembro miembro, BindingResult binding) {
//		if(binding.hasErrors()) {
//			return CREATE_UPDATE_FORM;
//		} else {
//			
//		}
//	}

}
