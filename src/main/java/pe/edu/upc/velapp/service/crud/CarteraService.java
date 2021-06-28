package pe.edu.upc.velapp.service.crud;

import java.util.List;


import pe.edu.upc.velapp.entities.Cartera;

public interface CarteraService extends CrudService<Cartera, Integer>{
	List<Cartera> filterCarterasByIdUsuario(Integer id) throws Exception;
	

}
