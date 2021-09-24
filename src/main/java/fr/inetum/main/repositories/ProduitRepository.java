package fr.inetum.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.inetum.main.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
