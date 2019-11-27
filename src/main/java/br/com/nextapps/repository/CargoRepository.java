package br.com.nextapps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.nextapps.model.Cargo;

@Repository	
public interface CargoRepository extends JpaRepository<Cargo, Long> {
	
	@Query("select c from Cargo c where c.id = ?1")
	Cargo findOne(Long id);
	
}
