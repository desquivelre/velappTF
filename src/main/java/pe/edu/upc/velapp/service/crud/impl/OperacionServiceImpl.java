package pe.edu.upc.velapp.service.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.velapp.entities.Operacion;
import pe.edu.upc.velapp.entities.Usuario;
import pe.edu.upc.velapp.repository.OperacionRepository;
import pe.edu.upc.velapp.service.crud.OperacionService;

@Service
public class OperacionServiceImpl implements OperacionService {

	@Autowired
	private OperacionRepository operacionRepository;
	@Override
	public JpaRepository<Operacion, Integer> getRepository() {
		// TODO Auto-generated method stub
		return operacionRepository;
	}
	@Override
	public List<Usuario> filterById_Usuario(Integer dni) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
