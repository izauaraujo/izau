package br.com.nextapps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.nextapps.model.Endereco;

@Repository	
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
	
}
