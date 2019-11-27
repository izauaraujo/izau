package br.com.nextapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.nextapps.model.HistoricoEclesiastico;
import br.com.nextapps.repository.HistoricoEclesiasticoRepository;

@Service
public class HistoricoEclesiasticoService implements IService<HistoricoEclesiastico> {

	private HistoricoEclesiasticoRepository repositorEclesiasticoRepository;

	@Override
	public HistoricoEclesiastico cadastra(HistoricoEclesiastico t) {
		return repositorEclesiasticoRepository.save(t);
	}

	@Override
	public Optional<HistoricoEclesiastico> buscarPorId(Long id) {
		return repositorEclesiasticoRepository.findById(id);
	}

	@Override
	public List<HistoricoEclesiastico> buscaTodos() {
		return repositorEclesiasticoRepository.findAll();
	}

	@Override
	public HistoricoEclesiastico atualizar(HistoricoEclesiastico t) {
		return repositorEclesiasticoRepository.save(t);
	}

	@Override
	public void excluir(Optional<HistoricoEclesiastico> t) {
		repositorEclesiasticoRepository.delete(t.get());
	}

}
