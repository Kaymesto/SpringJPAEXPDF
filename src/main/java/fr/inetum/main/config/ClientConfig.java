package fr.inetum.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.inetum.main.repositories.ClientRepository;
import fr.inetum.main.services.ClientService;
import fr.inetum.main.services.servicesImpl.ClientServiceImpl;



@Configuration
public class ClientConfig {
	
	@Bean
	public ClientService clientService(ClientRepository clientRepository) {
		return new ClientServiceImpl(clientRepository);
	}

}
