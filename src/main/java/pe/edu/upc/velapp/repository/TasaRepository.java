package pe.edu.upc.velapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.velapp.entities.Tasa;

@Repository
public interface TasaRepository extends JpaRepository<Tasa, Integer>{

}
