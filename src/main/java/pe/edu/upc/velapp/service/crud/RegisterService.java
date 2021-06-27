package pe.edu.upc.velapp.service.crud;
import java.util.List;

import org.springframework.data.repository.query.Param;

import pe.edu.upc.velapp.entities.Usuario;

public interface RegisterService  extends CrudService<Usuario, Integer> {

	List<Usuario> filterById_Usuario(Integer dni) throws Exception;

}
