package fr.inetum.main.services;

import java.util.List;

import fr.inetum.main.models.Client;


public interface ClientService {
	
	public List<Client> findAll();
	
	public Client findOne(Long id);
	
	public Client create(Client client);
	
	public Client update(Client client);
	
	public void delete(Long id);

}
