package pe.edu.upc.velapp.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pe.edu.upc.velapp.entities.Usuario;
import pe.edu.upc.velapp.repository.RegisterRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private RegisterRepository registerRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			Optional<Usuario> optional = this.registerRepository.findByUsername(username);
			if (optional.isPresent()) {
				MyUserDetails myUserDetails = new MyUserDetails( optional.get() );
				return myUserDetails;
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new UsernameNotFoundException("The user is not found");	
	}
	
}                 