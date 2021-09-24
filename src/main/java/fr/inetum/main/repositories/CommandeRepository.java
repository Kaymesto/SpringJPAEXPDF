package fr.inetum.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.inetum.main.models.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
