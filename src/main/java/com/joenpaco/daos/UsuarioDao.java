package com.joenpaco.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joenpaco.models.entities.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {

	public abstract Usuario findByUsername(String username);

	
}
