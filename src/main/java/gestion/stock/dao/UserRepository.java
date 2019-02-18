package gestion.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import gestion.stock.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("select u from User u where u.username like:x")
	  User findByUsername(@Param("x")String str);
}
