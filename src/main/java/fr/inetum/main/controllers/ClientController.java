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
import fr.inetum.main.models.Client;
import fr.inetum.main.services.ClientService;


@RestController
@CrossOrigin
@RequestMapping("client")
public class ClientController {
	
	@Autowired
	private ClientService clientService;

	@GetMapping("allClient")
	public List<Client> getClients(){
		return clientService.findAll();
	}
	
	@GetMapping("/{id}")
	public Client getClient(@PathVariable Long id){
		return clientService.findOne(id);
	}
	
	@PostMapping("create")
	public Client create(@RequestBody Client client) {
		return clientService.create(client);
	}
	
	@PutMapping("update")
	public Client update(@RequestBody Client client) {
		return clientService.update(client);
	}
	
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable Long id) {
		clientService.delete(id);
	}
	
}
