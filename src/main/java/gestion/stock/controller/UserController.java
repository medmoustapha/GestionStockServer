package gestion.stock.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gestion.stock.dao.UserRepository;
import gestion.stock.entity.Produit;
import gestion.stock.entity.User;

@RestController
@RequestMapping("/api/user")
@Service
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public Principal user(Principal user){
		return user;
	}
	@PostMapping
	public User getUser(@RequestBody String str){
		return userRepository.findByUsername(str);
}
}