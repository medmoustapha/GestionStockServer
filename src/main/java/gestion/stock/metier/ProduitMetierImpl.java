package gestion.stock.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import gestion.stock.dao.ProduitRepository;
import gestion.stock.entity.Produit;
@Service
@Primary
public class ProduitMetierImpl implements ProduitMetier{
	@Autowired
    private ProduitRepository produitRepository;
	@Override
	public List<Produit> getProduits() {
		
		return produitRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		produitRepository.save(produit);
		
	}

	@Override
	public void updateProduit(Produit produit) {
		produitRepository.save(produit);
		
	}

	@Override
	public void deleteProduit(Long ref) {
		Produit p=produitRepository.getOne(ref);
		produitRepository.delete(p);
		
	}

}
