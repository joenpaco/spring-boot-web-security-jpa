package com.joenpaco.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joenpaco.daos.UsuarioDao;
import com.joenpaco.errors.UsuarioNameNotFoundException;
import com.joenpaco.models.entities.Usuario;
import com.joenpaco.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public Usuario findByUsername(String username) {
		
		Usuario usuario = usuarioDao.findByUsername(username);
		
		if (usuario == null) {

			throw new UsuarioNameNotFoundException("El nombre: " + username + " No Existe");

		}
		
		return usuarioDao.findByUsername(username);
	}

}
