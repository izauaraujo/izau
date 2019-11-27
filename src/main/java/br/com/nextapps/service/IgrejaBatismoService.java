package br.com.nextapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextapps.model.IgrejaBatismo;
import br.com.nextapps.repository.IgrejaBatismoRepository;

@Service
public class IgrejaBatismoService implements IService<IgrejaBatismo> {

	@Autowired
	private IgrejaBatismoRepository batismoRepository;

	@Override
	public IgrejaBatismo cadastra(IgrejaBatismo t) {
		return batismoRepository.save(t);
	}

	@Override
	public Optional<IgrejaBatismo> buscarPorId(Long id) {
		return batismoRepository.findById(id);
	}

	@Override
	public List<IgrejaBatismo> buscaTodos() {
		return batismoRepository.findAll();
	}

	@Override
	public IgrejaBatismo atualizar(IgrejaBatismo t) {
		return batismoRepository.save(t);
	}

	@Override
	public void excluir(Optional<IgrejaBatismo> t) {
		batismoRepository.delete(t.get());
	}

}
