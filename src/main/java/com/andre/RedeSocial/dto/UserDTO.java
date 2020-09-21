package com.andre.RedeSocial.dto;

import java.io.Serializable;

import com.andre.RedeSocial.domain.User;

public class UserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String email;
	
	public UserDTO() {
		
	}
	public UserDTO(User objeto) {
		id = objeto.getId();
		nome = objeto.getNome();
		email = objeto.getEmail();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
