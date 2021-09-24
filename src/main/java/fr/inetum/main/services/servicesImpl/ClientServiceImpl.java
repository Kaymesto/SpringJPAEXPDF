package fr.inetum.main.services.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import fr.inetum.main.models.Client;
import fr.inetum.main.repositories.ClientRepository;
import fr.inetum.main.services.ClientService;

public class ClientServiceImpl implements ClientService {
	
	private ClientRepository clientRepository;
	
	public ClientServiceImpl(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@Transactional
	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Transactional
	@Override
	public Client findOne(Long id) {
		return clientRepository.findById(id).get();
	}

	@Transactional
	@Override
	public Client create(Client client) {
		return clientRepository.save(client);
	}
	
	@Transactional
	@Override
	public Client update(Client client) {
		return clientRepository.save(client);
	}

	@Transactional
	@Override
	public void delete(Long id) {
		clientRepository.deleteById(id);
	}

}
