package br.com.nextapps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.nextapps.model.Obreiro;

@Repository	
public interface ObreiroRepository extends JpaRepository<Obreiro, Long> {
	
}
