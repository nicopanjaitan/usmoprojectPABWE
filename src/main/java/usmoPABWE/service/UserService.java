package usmoPABWE.service;

import usmoPABWE.model.User;

public interface UserService {
	  
	 public User findUserByEmail(String email);
	 
	 public void saveUser(User user);
	}