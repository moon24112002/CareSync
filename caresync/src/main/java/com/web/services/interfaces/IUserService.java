package com.web.services.interfaces;

import com.web.models.User;

public interface IUserService {
	public User create(User user);
	public User getUser(String email,String password);
	public User getUserById(Long id);
}
