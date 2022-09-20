package com.cg.services;

import com.cg.entities.User;

public interface UserService {
	
	public abstract User addNewUser(User user);
	public abstract User updateUser(User user);
}
