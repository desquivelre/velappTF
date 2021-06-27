package pe.edu.upc.velapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.velapp.entities.TipoCalendario;

@Repository
public interface TipoCalendarioRepository extends JpaRepository<TipoCalendario, Integer>{

}
