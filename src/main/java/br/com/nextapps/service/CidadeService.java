package br.com.nextapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextapps.model.Cidade;
import br.com.nextapps.repository.CidadeRepository;

@Service
public class CidadeService implements IService<Cidade> {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Override
	public Cidade cadastra(Cidade t) {
		return cidadeRepository.save(t);
	}

	@Override
	public Optional<Cidade> buscarPorId(Long id) {
		return cidadeRepository.findById(id);
	}

	@Override
	public List<Cidade> buscaTodos() {
		return cidadeRepository.findAll();
	}

	@Override
	public Cidade atualizar(Cidade t) {
		return cidadeRepository.save(t);
	}

	@Override
	public void excluir(Optional<Cidade> t) {
		cidadeRepository.delete(t.get());
	}

}
