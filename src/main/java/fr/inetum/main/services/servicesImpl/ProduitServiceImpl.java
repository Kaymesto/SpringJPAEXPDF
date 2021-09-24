package fr.inetum.main.services.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import fr.inetum.main.models.Produit;
import fr.inetum.main.repositories.ProduitRepository;
import fr.inetum.main.services.ProduitService;

public class ProduitServiceImpl implements ProduitService {
	
	private ProduitRepository produitRepository;
	
	public ProduitServiceImpl(ProduitRepository produitRepository) {
		this.produitRepository = produitRepository;
	}

	@Transactional
	@Override
	public List<Produit> findAll() {
		return produitRepository.findAll();
	}

	@Transactional
	@Override
	public Produit findOne(Long id) {
		return produitRepository.findById(id).get();
	}

	@Transactional
	@Override
	public Produit create(Produit produit) {
		return produitRepository.save(produit);
	}

	@Transactional
	@Override
	public Produit update(Produit produit) {
		return produitRepository.save(produit);
	}

	@Transactional
	@Override
	public void delete(Long id) {
		produitRepository.deleteById(id);
	}

}
