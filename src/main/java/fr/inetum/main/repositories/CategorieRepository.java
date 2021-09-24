package fr.inetum.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.inetum.main.models.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
