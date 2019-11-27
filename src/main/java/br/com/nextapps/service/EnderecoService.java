package br.com.nextapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextapps.model.Endereco;
import br.com.nextapps.repository.EnderecoRepository;

@Service
public class EnderecoService implements IService<Endereco> {

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Override
	public Endereco cadastra(Endereco t) {
		return enderecoRepository.save(t);
	}

	@Override
	public Optional<Endereco> buscarPorId(Long id) {
		return enderecoRepository.findById(id);
	}

	@Override
	public List<Endereco> buscaTodos() {
		return null;
	}

	@Override
	public Endereco atualizar(Endereco t) {
		return enderecoRepository.save(t);
	}

	@Override
	public void excluir(Optional<Endereco> t) {
		enderecoRepository.delete(t.get());

	}

}
