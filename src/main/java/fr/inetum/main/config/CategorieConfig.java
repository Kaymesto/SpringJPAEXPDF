package fr.inetum.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.inetum.main.repositories.CategorieRepository;
import fr.inetum.main.services.CategorieService;
import fr.inetum.main.services.servicesImpl.CategorieServiceImpl;


@Configuration
public class CategorieConfig {
	
	@Bean
	public CategorieService categorieService(CategorieRepository categorieRepository) {
		return new CategorieServiceImpl(categorieRepository);
	}

}
