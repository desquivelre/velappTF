package pe.edu.upc.velapp.service.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import pe.edu.upc.velapp.entities.Usuario;
import pe.edu.upc.velapp.repository.RegisterRepository;
import pe.edu.upc.velapp.service.crud.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterRepository registerRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public JpaRepository<Usuario, Integer> getRepository() {
		return registerRepository;
	}
<<<<<<< Updated upstream



	@Override
	public Usuario findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
=======
>>>>>>> Stashed changes



	@Override
	public Usuario registrar(Usuario u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return registerRepository.save(u);
	}
	


	
	
	
}