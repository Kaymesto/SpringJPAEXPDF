package fr.inetum.main.services;

import java.util.List;

import fr.inetum.main.models.Categorie;

public interface CategorieService {
	
	public List<Categorie> findAll();
	
	public Categorie findOne(Long id);
	
	public Categorie create(Categorie categorie);
	
	public Categorie update(Categorie categorie);
	
	public void delete(Long id);

}
