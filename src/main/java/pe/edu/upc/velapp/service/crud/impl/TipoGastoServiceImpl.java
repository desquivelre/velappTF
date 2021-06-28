package pe.edu.upc.velapp.service.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


import pe.edu.upc.velapp.entities.TipoGasto;
import pe.edu.upc.velapp.entities.Usuario;
import pe.edu.upc.velapp.repository.TipoGastoRepository;

import pe.edu.upc.velapp.service.crud.TipoGastoService;

@Service
public class TipoGastoServiceImpl implements TipoGastoService{

	@Autowired
	private TipoGastoRepository tipogastoRepository;

	@Override
	public JpaRepository<TipoGasto, Integer> getRepository() {
		// TODO Auto-generated method stub
		return tipogastoRepository;
	}




}
