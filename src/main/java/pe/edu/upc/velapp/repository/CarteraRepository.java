package pe.edu.upc.velapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.velapp.entities.Cartera;


@Repository
public interface CarteraRepository extends JpaRepository<Cartera, Integer>{

}
