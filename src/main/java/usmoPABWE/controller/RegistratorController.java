package usmoPABWE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import usmoPABWE.model.Registrator;
import usmoPABWE.service.RegistratorService;

@Controller
public class RegistratorController {

	private RegistratorService registratorService;
	
	//Karena diinjeksi menggunakan setter, maka diberikan autowired
	@Autowired
	public void setRegistratorService (RegistratorService registratorService) {
		this.registratorService = registratorService;
	}
	
	@RequestMapping("/registrator")
	public String RegistratorList(Model model) {
		model.addAttribute("registrator", registratorService.listRegistrator());
		return "registrator";
	}
	
	@RequestMapping(value = "/registrator/create", method = RequestMethod.GET)
	public String tampilkanForm (Model model) {
		model.addAttribute("registrator", new Registrator());
		return "formRegistrator";
	}
	
	@RequestMapping(value = "/registrator/create", method = RequestMethod.POST)
	public String simpanDataRegistrator (Model model, Registrator registrator) {
		model.addAttribute("registrator", registratorService.saveOrUpdate(registrator));
		return "redirect:/registrator";
	}
	
	@RequestMapping(value= "/registrator/edit/{id}", method = RequestMethod.GET)
	public String updateDataRegistrator (@PathVariable Integer id, Model model) {
		model.addAttribute("registrator", registratorService.getId(id));
		return "formRegistrator";
	}
	
	@RequestMapping(value= "/registrator/delete/{id}", method = RequestMethod.GET)
	public String deleteDataRegistrator (@PathVariable Integer id) {
		registratorService.deleteRegistrator(id);
		return "redirect:/Registrator";
	}
}