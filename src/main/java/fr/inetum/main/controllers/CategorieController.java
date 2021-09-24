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

import fr.inetum.main.models.Categorie;
import fr.inetum.main.services.CategorieService;

@RestController
@CrossOrigin
@RequestMapping("categorie")
public class CategorieController {
	
	@Autowired
	private CategorieService categorieService;
	
	@GetMapping("allCategories")
	public List<Categorie> getCategories(){
		return categorieService.findAll();
	}
	
	@GetMapping("/{id}")
	public Categorie getCategorie(@PathVariable Long id){
		return categorieService.findOne(id);
	}
	
	@PostMapping("create")
	public Categorie saveCategorie(@RequestBody Categorie categorie) {
		return categorieService.create(categorie);
	}
	
	@PutMapping("update")
	public Categorie updateCategories(@RequestBody Categorie categorie) {
		return categorieService.update(categorie);
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteCategorie(@PathVariable Long id) {
		categorieService.delete(id);
	}

}
