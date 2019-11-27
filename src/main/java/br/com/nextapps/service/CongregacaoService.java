package br.com.nextapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextapps.model.Congregacao;
import br.com.nextapps.repository.CongregacaoRepository;

@Service
public class CongregacaoService implements IService<Congregacao>{

	@Autowired
	private CongregacaoRepository congregacaoRepository;
	
	@Override
	public Congregacao cadastra(Congregacao t) {
		return congregacaoRepository.save(t);
	}

	@Override
	public Optional<Congregacao> buscarPorId(Long id) {
		return congregacaoRepository.findById(id);
	}

	@Override
	public List<Congregacao> buscaTodos() {
		return congregacaoRepository.findAll();
	}

	@Override
	public Congregacao atualizar(Congregacao t) {
		return congregacaoRepository.save(t);
	}

	@Override
	public void excluir(Optional<Congregacao> t) {
		congregacaoRepository.delete(t.get());
	}
	
}
