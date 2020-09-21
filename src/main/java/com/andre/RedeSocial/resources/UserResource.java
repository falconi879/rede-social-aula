package com.andre.RedeSocial.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andre.RedeSocial.domain.User;
import com.andre.RedeSocial.dto.UserDTO;
import com.andre.RedeSocial.service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService servico;
	
	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll(){
		List<User> lista = servico.findAll();
		List<UserDTO> listaDTO = lista.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listaDTO);
	}
}
