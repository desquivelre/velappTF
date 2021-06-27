package pe.edu.upc.velapp.service.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.velapp.entities.Tasa;
import pe.edu.upc.velapp.entities.Usuario;
import pe.edu.upc.velapp.repository.TasaRepository;
import pe.edu.upc.velapp.service.crud.TasaService;

@Service
public class TasaServiceImpl implements TasaService{

	@Autowired
	private TasaRepository tasaRepository;
	@Override
	public JpaRepository<Tasa, Integer> getRepository() {
		// TODO Auto-generated method stub
		return tasaRepository;
	}
	@Override
	public List<Usuario> filterById_Usuario(Integer dni) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
