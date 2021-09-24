package fr.inetum.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.inetum.main.repositories.ProduitRepository;
import fr.inetum.main.services.ProduitService;
import fr.inetum.main.services.servicesImpl.ProduitServiceImpl;

@Configuration
public class ProduitConfig {
	
	@Bean
	public ProduitService produitService(ProduitRepository produitRepository) {
		return new ProduitServiceImpl(produitRepository);
	}

}
