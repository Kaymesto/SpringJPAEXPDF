package fr.inetum.main.services.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import fr.inetum.main.models.Commande;
import fr.inetum.main.repositories.CommandeRepository;
import fr.inetum.main.services.CommandeService;

public class CommandeServiceImpl implements CommandeService {
	
	private CommandeRepository commandeRepository;
	
	public CommandeServiceImpl(CommandeRepository commandeRepository) {
		this.commandeRepository = commandeRepository;
	}

	@Transactional
	@Override
	public List<Commande> findAll() {
		return commandeRepository.findAll();
	}

	@Transactional
	@Override
	public Commande findOne(Long id) {
		return commandeRepository.findById(id).get();
	}

	@Transactional
	@Override
	public Commande create(Commande commande) {
		return commandeRepository.save(commande);
	}

	@Transactional
	@Override
	public Commande update(Commande commande) {
		return commandeRepository.save(commande);
	}

	@Transactional
	@Override
	public void delete(Long id) {
		commandeRepository.deleteById(id);
	}

	@Override
	public List<Commande> getClientCommandes(Long id) {
		return commandeRepository.findByClientId(id);
	}

}
