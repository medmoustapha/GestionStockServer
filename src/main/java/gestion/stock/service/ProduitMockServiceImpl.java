 package gestion.stock.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import gestion.stock.entity.Produit;
@Service
public class ProduitMockServiceImpl implements IProduitService{
    private List<Produit> produits;
	
	
	public ProduitMockServiceImpl() {
	
	produits=new ArrayList<Produit>();
		produits.add(new Produit("Ordinateur Toshiba",15,1500));
		produits.add(new Produit("Ordinateur Dell",15,1000));
		produits.add(new Produit("Iprimante xx",30,500));
		produits.add(new Produit("Disque Dir 1000",15,250));
		produits.add(new Produit("Disque Dir 1000",15,150));
	}

	@Override
	public List<Produit> getProduits() {
		
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
	produits.add(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
		
	}

	@Override
	public void deleteProduit(String ref) {
		Produit produit =new Produit();
		produit.setRef(ref);
		produits.remove(produit);
		
	}

}
