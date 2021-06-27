package pe.edu.upc.velapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.velapp.entities.Usuario;
@Repository
public interface RegisterRepository extends JpaRepository<Usuario, Integer> {
	
	Optional<Usuario>findByUsername(String username);
	
	
<<<<<<< Updated upstream
	@Query("SELECT c FROM Usuario c WHERE c.id= :dni")
	List<Usuario>filterById_Usuario(@Param("dni")Integer dni);
=======
>>>>>>> Stashed changes

}
