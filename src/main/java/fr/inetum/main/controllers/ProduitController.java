package fr.inetum.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.inetum.main.models.Produit;
import fr.inetum.main.services.ProduitService;

@RestController
@CrossOrigin
@RequestMapping("produit")
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	@GetMapping("allProduits")
	public List<Produit> getProduits(){
		return produitService.findAll();
	}
	
	
	@GetMapping("/{id}")
	public Produit getProduit(@PathVariable Long id){
		return produitService.findOne(id);
	}
	
	@PostMapping("create")
	public Produit createProduit(@RequestBody Produit produit) {
		return produitService.create(produit);
	}

	@PutMapping("update")
	public Produit update(@RequestBody Produit produit) {
		return produitService.update(produit);
	}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable Long id) {
		produitService.delete(id);
	}
	
}
