package com.andre.RedeSocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre.RedeSocial.domain.User;
import com.andre.RedeSocial.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repositorio;
	
	public List<User> findAll() {
	
		return repositorio.findAll();
	}

}
