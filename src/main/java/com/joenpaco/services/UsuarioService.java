package com.joenpaco.services;

import com.joenpaco.models.entities.Usuario;

public interface UsuarioService {
	
	public abstract Usuario findByUsername(String username);

}
