package gestion.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import gestion.stock.dao.ProduitRepository;
import gestion.stock.dao.UserRepository;
import gestion.stock.entity.Produit;
import gestion.stock.entity.User;
@Service
@Primary
public class UserService implements IUserService{
	@Autowired
    private UserRepository userRepository;
	@Override
	public List<User> getAll() {
		
		return userRepository.findAll();
	}

	@Override
	public void add(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void update(User user) {
		userRepository.save(user);
		
	}

	@Override
	public void delete(Long ref) {
		User p=userRepository.getOne(ref);
		userRepository.delete(p);
		
	}

}
