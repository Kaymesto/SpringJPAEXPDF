package fr.inetum.main.services;

import java.util.List;

import fr.inetum.main.models.Commande;

public interface CommandeService {
	
	public List<Commande> findAll();
	
	public Commande findOne(Long id);
	
	public Commande create(Commande commande);
	
	public Commande update(Commande commande);
	
	public void delete(Long id);

	public List<Commande> getClientCommandes(Long id);

}
