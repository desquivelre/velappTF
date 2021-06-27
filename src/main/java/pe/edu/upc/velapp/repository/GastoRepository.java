package pe.edu.upc.velapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.velapp.entities.Gasto;

@Repository
public interface GastoRepository extends JpaRepository<Gasto,Integer>{

}
