package fr.inetum.main.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Import({ CategorieConfig.class, ClientConfig.class, CommandeConfig.class,ProduitConfig.class })
@Configuration
public class AppConfig {
	
	

}
