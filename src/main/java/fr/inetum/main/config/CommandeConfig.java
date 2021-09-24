package fr.inetum.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.inetum.main.repositories.CommandeRepository;
import fr.inetum.main.services.CommandeService;
import fr.inetum.main.services.servicesImpl.CommandeServiceImpl;


@Configuration
public class CommandeConfig {
	
	@Bean
	public CommandeService commandeService(CommandeRepository commandeRepository) {
		return new CommandeServiceImpl(commandeRepository);
	}

}
