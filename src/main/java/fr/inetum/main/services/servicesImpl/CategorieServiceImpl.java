package fr.inetum.main.services.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import fr.inetum.main.models.Categorie;
import fr.inetum.main.repositories.CategorieRepository;
import fr.inetum.main.services.CategorieService;

public class CategorieServiceImpl implements CategorieService {
	
	private CategorieRepository categorieRepository;
	
	public CategorieServiceImpl(CategorieRepository categorieRepository) {
		this.categorieRepository = categorieRepository;
	}

	@Transactional
	@Override
	public List<Categorie> findAll() {
		return categorieRepository.findAll();
	}

	@Transactional
	@Override
	public Categorie findOne(Long id) {
		return categorieRepository.findById(id).get();
	}

	@Transactional
	@Override
	public Categorie create(Categorie categorie) {
		return categorieRepository.save(categorie);
	}

	@Transactional
	@Override
	public Categorie update(Categorie categorie) {
		return categorieRepository.save(categorie);
	}

	@Transactional
	@Override
	public void delete(Long id) {
		categorieRepository.deleteById(id);
	}

}
