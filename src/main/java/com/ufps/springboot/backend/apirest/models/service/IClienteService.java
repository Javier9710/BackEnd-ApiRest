package com.ufps.springboot.backend.apirest.models.service;

import java.util.List;

import com.ufps.springboot.backend.apirest.models.entities.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();

}
