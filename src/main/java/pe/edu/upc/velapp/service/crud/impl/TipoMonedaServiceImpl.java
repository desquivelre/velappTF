package pe.edu.upc.velapp.service.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.velapp.entities.TipoMoneda;
import pe.edu.upc.velapp.repository.TipoMonedaRepository;
import pe.edu.upc.velapp.service.crud.TipoMonedaService;

@Service
public class TipoMonedaServiceImpl implements TipoMonedaService {

	@Autowired
	private TipoMonedaRepository tipomonedaRepository;
	@Override
	public JpaRepository<TipoMoneda, Integer> getRepository() {
		// TODO Auto-generated method stub
		return tipomonedaRepository;
	}

}
