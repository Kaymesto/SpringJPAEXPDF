package fr.inetum.main.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name="commande")
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "commande_produits", 
    joinColumns = @JoinColumn(name = "produit_id", referencedColumnName = "id"), 
    inverseJoinColumns = @JoinColumn(name = "commande_id", 
    referencedColumnName = "id"))
	private List<Produit> produits;
	
	@ManyToOne
	@JsonIgnore
    @JoinColumn(name="client_id",referencedColumnName= "id")
	private Client client;

}
