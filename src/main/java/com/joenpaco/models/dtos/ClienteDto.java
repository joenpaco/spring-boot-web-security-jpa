package com.joenpaco.models.dtos;

import org.springframework.stereotype.Component;

@Component
public class ClienteDto {

	private Long id;
	
	private String nombre;
	
	private String apellido;

	public ClienteDto() {
	}

	public ClienteDto(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
