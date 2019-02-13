package gestion.stock.metier;

import java.util.List;

import gestion.stock.entity.Produit;

public interface ProduitMetier {
	    List<Produit> getProduits();
	    void addProduit(Produit produit);
	    void updateProduit(Produit produit);
	    void deleteProduit(Long ref);
}
