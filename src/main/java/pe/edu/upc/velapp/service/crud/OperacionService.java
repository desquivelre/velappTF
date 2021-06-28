package pe.edu.upc.velapp.service.crud;

import java.util.Date;
import java.util.List;


import pe.edu.upc.velapp.entities.Operacion;

public interface OperacionService extends CrudService<Operacion, Integer>{
	
	List<Operacion> filterOperacionesByIdCartera(Integer id) throws Exception;

}
