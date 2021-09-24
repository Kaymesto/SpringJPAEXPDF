package fr.inetum.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.inetum.main.models.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {

}
