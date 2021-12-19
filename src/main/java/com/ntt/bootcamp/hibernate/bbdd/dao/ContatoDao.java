package com.ntt.bootcamp.hibernate.bbdd.dao;

import java.util.List;

import com.ntt.bootcamp.hibernate.bbdd.Cliente;
import com.ntt.bootcamp.hibernate.bbdd.Contrato;

public interface ContatoDao {

	/**
	 * Método que inserta un nuevo Contrato
	 * 
	 * @param contrato Nuevo Contrato a guardar
	 * 
	 */
public void insert(Cliente cliente);
	
	/**
	 * Método que busca un nuevo cliente
	 * 
	 * @param cliente Nuevo Cliente a guardar
	 * 
	 */
	public Contrato searchById(Long id);
	
	public List<Contrato> getContratos();
	
	public void actualizar(Contrato contrato);
	
	public void delete(Contrato contrato);
	
	public List<Contrato> searchClienteById(Long id);
}
