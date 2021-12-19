package com.ntt.bootcamp.hibernate.services;

import java.util.List;

import com.ntt.bootcamp.hibernate.bbdd.Contrato;

public interface ContratoService {
	/**
	 * Método que inserta un nuevo jugador
	 * 
	 * @param player nuevo jugador a guardar
	 */
	public void insertNewContrato(Contrato contrato);
	
	/**
	 * Método que busca un jugador por id
	 * 
	 * @param id del jugador
	 * @return Jugador encontrado
	 */
	public Contrato searchContratoById(Long id);
	
	public List<Contrato> findAllContratos();
	
	public void eliminarContrato(Contrato contrato);
	
	public void actualizaContrato(Contrato contrato);
	
	public List<Contrato> searchClienteById(Long ClienteId);
}
