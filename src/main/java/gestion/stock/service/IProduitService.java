package gestion.stock.service;

import java.util.List;

import gestion.stock.entity.Produit;

public interface IProduitService {
    List<Produit> getProduits();
    void addProduit(Produit produit);
    void updateProduit(Produit produit);
    void deleteProduit(String ref);
}
