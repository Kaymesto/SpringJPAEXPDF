package fr.inetum.main.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nom")
	private String nom;	
	
	@Column(name="prenom")
	private String prenom;
	
	@OneToMany(mappedBy = "client")
	private List<Commande> mesCommandes;
	
	
}
