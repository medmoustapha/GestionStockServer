package gestion.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gestion.stock.entity.Produit;
import gestion.stock.metier.ProduitMetier;
import gestion.stock.service.IProduitService;

@RestController
@RequestMapping("/api/produit")
@CrossOrigin(origins = "http://localhost:4200")
public class ProduitController{
	@Autowired
	//@Qualifier("ProduitMetierImpl")
	private ProduitMetier produitMetier;

	@GetMapping
	public List<Produit> getProduits(){
		return produitMetier.getProduits();
	}
	@PostMapping
	public void addProduit(@RequestBody Produit produit){
		produitMetier.addProduit(produit);
	}
	@PutMapping
	public void updateProduit(@RequestBody Produit produit){
		produitMetier.updateProduit(produit);
	}
	@DeleteMapping("/{ref}")
	public void deleteProduit(@PathVariable Long ref){
		produitMetier.deleteProduit(ref);
	}

}
