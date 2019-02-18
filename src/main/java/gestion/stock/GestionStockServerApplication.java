package gestion.stock;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import gestion.stock.dao.ProduitRepository;
import gestion.stock.dao.RoleRepository;
import gestion.stock.dao.UserRepository;
import gestion.stock.entity.Produit;
import gestion.stock.entity.Role;
import gestion.stock.entity.User;

@SpringBootApplication
public class GestionStockServerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnx= SpringApplication.run(GestionStockServerApplication.class, args);
	    ProduitRepository produiRepository=cnx.getBean(ProduitRepository.class);
	    produiRepository.save(new Produit("TOSHIBA", 12, 1200));
	    produiRepository.save(new Produit("HP", 10, 1000));
	    produiRepository.save(new Produit("LENOVO", 12, 1500));
	    produiRepository.save(new Produit("IMPRIMANTE", 12, 500));
	    produiRepository.save(new Produit("IMPRIMANTE XX", 12, 400));
	    RoleRepository roleRepository =cnx.getBean(RoleRepository.class);
	    UserRepository userRepository=cnx.getBean(UserRepository.class);
	    Role user_role=new Role("ROLE_USER");
	    Role admin_role=new Role("ROLE_ADMIN");
	    roleRepository.save(user_role);
	    roleRepository.save(admin_role);
	    User user=new User("moustapha", "123", true);
	    User admin = new User("abidine", "123", true);
	    user.setRoles(Arrays.asList(user_role));
	    admin.setRoles(Arrays.asList(admin_role));
	    admin.setRoles(Arrays.asList(user_role));
	    userRepository.save(user);
	    userRepository.save(admin);
	}
}
