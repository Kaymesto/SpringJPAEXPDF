package fr.inetum.main.models;

import org.springframework.beans.factory.annotation.Autowired;

import fr.inetum.main.services.CategorieService;
import fr.inetum.main.services.ClientService;
import fr.inetum.main.services.CommandeService;
import fr.inetum.main.services.ProduitService;

public class ServiceBean {
	
	@Autowired
	private CategorieService categorieService;
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private CommandeService commandeService;
	
	@Autowired
	private ProduitService produitService;

}
