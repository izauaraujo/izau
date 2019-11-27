package br.com.nextapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.nextapps.model.InformacaoEclesiastica;
import br.com.nextapps.repository.InformacaoEclesiasticaRepository;

@Service
public class InformacaoEclesiasticaService implements IService<InformacaoEclesiastica> {

	private InformacaoEclesiasticaRepository eclesiasticaRepository;

	@Override
	public InformacaoEclesiastica cadastra(InformacaoEclesiastica t) {
		return eclesiasticaRepository.save(t);
	}

	@Override
	public Optional<InformacaoEclesiastica> buscarPorId(Long id) {
		return eclesiasticaRepository.findById(id);
	}

	@Override
	public List<InformacaoEclesiastica> buscaTodos() {
		return eclesiasticaRepository.findAll();
	}

	@Override
	public InformacaoEclesiastica atualizar(InformacaoEclesiastica t) {
		return eclesiasticaRepository.save(t);
	}

	@Override
	public void excluir(Optional<InformacaoEclesiastica> t) {
		eclesiasticaRepository.delete(t.get());
	}

}
