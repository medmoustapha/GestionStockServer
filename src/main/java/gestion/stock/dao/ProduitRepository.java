package gestion.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import gestion.stock.entity.Produit;
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{
    @Query("select p from Produit p where p.id like:x")
	Produit getOne(@Param("x")Long ref);

}
