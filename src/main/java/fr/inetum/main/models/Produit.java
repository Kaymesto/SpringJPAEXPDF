package fr.inetum.main.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name="produit")
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nom")
	private String nom;	
	
	@Column(name="prix")
	private Float prix;
	
	@ManyToOne
    @JoinColumn(name="categorie_id",referencedColumnName= "id")
	private Categorie categorie;
	
	@ManyToMany(mappedBy = "produits")
	@JsonIgnore
	private List<Commande> commandesContenantProduits;
	
	

}
