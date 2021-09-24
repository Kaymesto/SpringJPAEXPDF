package fr.inetum.main.services;

import java.util.List;

import fr.inetum.main.models.Produit;

public interface ProduitService {
	
	public List<Produit> findAll();
	
	public Produit findOne(Long id);
	
	public Produit create(Produit produit);
	
	public Produit update(Produit produit);
	
	public void delete(Long id);

}
