package com.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.web.models.User;
import com.web.repository.IUserRepository;
import com.web.services.interfaces.IUserService;

@Service
public class UserService  implements IUserService{
	
	@Autowired
	private IUserRepository _userRepository;
	
	@Autowired
	private PasswordEncoder _passwordEncoder;

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		user.setPassword(_passwordEncoder.encode(user.getPassword()));
		return _userRepository.save(user);
		//return null;
	}

	@Override
	public User getUser(String email, String password) {
		// TODO Auto-generated method stub
		User user = _userRepository.getUserByEmailAndPassword(email);
		var match =_passwordEncoder.matches(password, user.getPassword());
		if(match) {
			user.setPassword("ENCRYPTED");
			return user;
		}
		return null;
	}

	@Override
	public User getUserById(Long id) {
		var d =  _userRepository.findById(id);
		if(d.isPresent()) {
			return d.get();
		}
		return null;
		
	}

}
