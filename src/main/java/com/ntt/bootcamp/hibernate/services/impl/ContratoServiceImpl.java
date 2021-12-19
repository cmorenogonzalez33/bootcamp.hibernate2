package com.ntt.bootcamp.hibernate.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntt.bootcamp.hibernate.bbdd.Contrato;
import com.ntt.bootcamp.hibernate.bbdd.dao.ContratoDao;
import com.ntt.bootcamp.hibernate.services.ContratoService;

@Service
public class ContratoServiceImpl implements ContratoService {

	@Autowired
	private ContratoDao contratoDao;

	@Override
	@Transactional
	public void insertNewContrato(Contrato contrato) {
		contratoDao.insert(contrato);
	}

	@Override
	@Transactional
	public Contrato searchContratoById(Long id) {
		Contrato contrato = null;
	
		if(null != id) {
			contrato = contratoDao.searchById(id);
		}
	
		return contrato;
	}

	@Override
	@Transactional
	public List<Contrato> findAllContratos(){
		return contratoDao.getContratos	();
	}

	@Override
	@Transactional
	public void actualizaContrato(Contrato contrato){
		contratoDao.actualizar(contrato);
	}

	@Override
	@Transactional
	public void eliminarContrato(Contrato contrato) {
		contratoDao.delete(contrato);
	}

	@Override
	@Transactional
	public List<Contrato> searchClienteById(Long id){
		return contratoDao.searchById(id);
}
}
