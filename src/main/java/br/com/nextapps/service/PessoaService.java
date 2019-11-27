package br.com.nextapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextapps.model.Pessoa;
import br.com.nextapps.repository.PessoaRepository;

@Service
public class PessoaService implements IService<Pessoa> {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public Pessoa cadastra(Pessoa t) {
		pessoaRepository.save(t);
		return t;
	}

	@Override
	public Optional<Pessoa> buscarPorId(Long id) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(id);
		return pessoa;
	}

	@Override
	public List<Pessoa> buscaTodos() {
		return pessoaRepository.findAll();
	}

	@Override
	public Pessoa atualizar(Pessoa t) {
		pessoaRepository.save(t);
		return t;
	}

	@Override
	public void excluir(Optional<Pessoa> t) {
		pessoaRepository.delete(t.get());
	}

}
