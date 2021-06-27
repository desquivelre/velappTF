package pe.edu.upc.velapp.service.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import pe.edu.upc.velapp.entities.Usuario;
import pe.edu.upc.velapp.repository.RegisterRepository;
import pe.edu.upc.velapp.service.crud.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterRepository registerRepository;
	@Override
	public JpaRepository<Usuario, Integer> getRepository() {
		return registerRepository;
	}
	@Override
	public List<Usuario> filterById_Usuario(Integer dni) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	
}