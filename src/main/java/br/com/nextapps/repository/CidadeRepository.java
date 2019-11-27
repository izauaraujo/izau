package br.com.nextapps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.nextapps.model.Cidade;

@Repository	
public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	@Query("select  c from Cidade c where c.id = ?1")
	Cidade findOne(Long id);
	
	
}
