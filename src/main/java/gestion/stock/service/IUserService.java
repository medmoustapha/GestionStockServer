package gestion.stock.service;

import java.util.List;

import gestion.stock.entity.User;


public interface IUserService {
	    List<User> getAll();
	    void add(User u);
	    void update(User u);
	    void delete(Long id);
}
