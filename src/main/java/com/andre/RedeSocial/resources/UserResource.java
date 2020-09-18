package com.andre.RedeSocial.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andre.RedeSocial.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> lista = new ArrayList<>();
		User usuario1 = new User("1", "Andre", "andre@gmail.com");
		User usuario2 = new User("2", "Maria", "maria@gmail.com");
		User usuario3 = new User("3", "João", "joao@gmail.com");
		User usuario4 = new User("4", "Alex", "alex@gmail.com");
		User usuario5 = new User("5", "Amanda", "amanda@gmail.com");
		
		lista.addAll(Arrays.asList(usuario1,usuario2,usuario3,usuario4,usuario5));
		return ResponseEntity.ok().body(lista);
	}
}
