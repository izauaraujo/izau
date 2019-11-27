package br.com.nextapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextapps.model.Estado;
import br.com.nextapps.repository.EstadoRepository;

@Service
public class EstadoService implements IService<Estado> {

	@Autowired
	private EstadoRepository repository;

	@Override
	public Estado cadastra(Estado t) {
		return repository.save(t);
	}

	@Override
	public Optional<Estado> buscarPorId(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Estado> buscaTodos() {
		return repository.findAll();
	}

	@Override
	public Estado atualizar(Estado t) {
		return repository.save(t);
	}

	@Override
	public void excluir(Optional<Estado> t) {
		repository.delete(t.get());

	}

}
