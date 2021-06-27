package pe.edu.upc.velapp.service.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.velapp.entities.Gasto;
import pe.edu.upc.velapp.repository.GastoRepository;
import pe.edu.upc.velapp.service.crud.GastoService;

@Service
public class GastoServiceImpl implements GastoService{

	@Autowired
	private GastoRepository gastoRepository;
	@Override
	public JpaRepository<Gasto, Integer> getRepository() {
		// TODO Auto-generated method stub
		return gastoRepository;
	}

}
