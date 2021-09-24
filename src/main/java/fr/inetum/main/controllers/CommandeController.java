package fr.inetum.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.inetum.main.models.Commande;
import fr.inetum.main.services.CommandeService;

@RestController
@CrossOrigin
@RequestMapping("commande")
public class CommandeController {
	
	@Autowired
	private CommandeService commandeService;
	
	@GetMapping("allCommandes")
	public List<Commande> getCommandes(){
		return commandeService.findAll();
	}
	
	@GetMapping("{id}")
	public Commande getCommande(@PathVariable Long id) {
		return commandeService.findOne(id);
	}
	
	@GetMapping("/client/{id}")
	public List<Commande> getClientCommandes(@PathVariable Long id){
		return commandeService.getClientCommandes(id);
	}
	
	@PostMapping("create")
	public Commande create(@RequestBody Commande commande) {
		return commandeService.create(commande);
	}
	
	@PutMapping("update")
	public Commande update(@RequestBody Commande commande) {
		return commandeService.update(commande);
	}

	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable Long id) {
		commandeService.delete(id);
	}
}
