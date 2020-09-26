package org.sid.web;

import java.util.List;

import javax.validation.Valid;

import org.sid.dao.InfractionRepository;
import org.sid.entites.Infraction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InfractionController {
	@Autowired
	private InfractionRepository infractionRepository;
	@GetMapping("/index")
	public String chercher(Model model, @RequestParam(name="page", defaultValue="0") int page, 
			@RequestParam(name="titre", defaultValue="") String t) {
		Page<Infraction> pageInfractions = infractionRepository.findByMatriculeVContains(t, PageRequest.of(page,5));
		model.addAttribute("listInfractions", pageInfractions.getContent());
		model.addAttribute("page", new int[pageInfractions.getTotalPages()]);
		model.addAttribute("currentPage", page);
		model.addAttribute("titre", t);
		return "infraction";	
	}
	@GetMapping("/delete")
	public String delete(Long num_infr, int page, String titre) {
		infractionRepository.deleteById(num_infr);
		return "redirect:/index?page="+page+"&titre="+titre;
		
	}
	@GetMapping("/form")
	public String formProduit(Model model) {
		
		model.addAttribute("infraction", new Infraction());
		return "formInfractions";
	}
	@GetMapping("/edit")
	public String edit(Model model, Long num_infr) {
		Infraction inf = infractionRepository.getOne(num_infr);
		model.addAttribute("infraction", inf);
		return "EditInfraction";
	}
	@PostMapping("/save")
	public String save(Model model, @Valid Infraction infraction, BindingResult bindingResult) {
		
		/*if(bindingResult.hasErrors()) {
			return "formInfractions";
		}*/
		infractionRepository.save(infraction);
		return "Confirmation";
	}
	

}
