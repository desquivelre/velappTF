package pe.edu.upc.velapp;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import pe.edu.upc.velapp.entities.Usuario;
import pe.edu.upc.velapp.repository.RegisterRepository;

@SpringBootTest
class VelappApplicationTests {

    @Autowired
    private RegisterRepository registerRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Test
    public void crearUsuario() {

        Usuario us = new Usuario();
        us.setId(20);
        us.setUsername("prueba2");
        us.setPassword(encoder.encode("123"));
    Usuario retorno    =registerRepository.save(us);

        assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
    }

	private void assertTrue(boolean equalsIgnoreCase) {
		// TODO Auto-generated method stub
		
	}

}