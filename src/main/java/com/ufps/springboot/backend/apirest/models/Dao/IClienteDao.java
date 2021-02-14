package com.ufps.springboot.backend.apirest.models.Dao;

import org.springframework.data.repository.CrudRepository;

import com.ufps.springboot.backend.apirest.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
