package gestion.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestion.stock.entity.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
