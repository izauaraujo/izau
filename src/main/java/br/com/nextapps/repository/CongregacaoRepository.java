package br.com.nextapps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.nextapps.model.Congregacao;

@Repository	
public interface CongregacaoRepository extends JpaRepository<Congregacao, Long> {

	@Query("select c from Congregacao c where c.id = ?1")
	Congregacao findOne(Long id);
}
