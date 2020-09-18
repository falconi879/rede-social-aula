package com.andre.RedeSocial.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.andre.RedeSocial.domain.User;
import com.andre.RedeSocial.repository.UserRepository;

@Configuration
public class InstantiationConfig implements CommandLineRunner {

	@Autowired
	private UserRepository usuarioRepositorio;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		usuarioRepositorio.deleteAll();
		
		
		User usuario1 = new User(null, "Andre", "andre@gmail.com");
		User usuario2 = new User(null, "Maria", "maria@gmail.com");
		User usuario3 = new User(null, "João", "joao@gmail.com");
		User usuario4 = new User(null, "Alex", "alex@gmail.com");
		User usuario5 = new User(null, "Amanda", "amanda@gmail.com");
		
		usuarioRepositorio.saveAll(Arrays.asList(usuario1,usuario2,usuario3,usuario4,usuario5));
		

		
	}

}
