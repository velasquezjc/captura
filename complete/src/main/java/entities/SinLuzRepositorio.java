package entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SinLuzRepositorio extends JpaRepository<CorteServicioMedia, Long> {

	  CorteServicioMedia findBySubestacion_alimentador(String subestacion_alimentador);

	  List<CorteServicioMedia> findByLocalidad(String localidad);
	}