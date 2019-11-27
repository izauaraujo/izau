package br.com.nextapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextapps.model.Menbro;
import br.com.nextapps.repository.MenbroRepository;

@Service
public class MenbroService implements IService<Menbro> {

	@Autowired
	private MenbroRepository menbroRepository;

	@Override
	public Menbro cadastra(Menbro t) {
		return menbroRepository.save(t);
	}

	@Override
	public Optional<Menbro> buscarPorId(Long id) {
		return menbroRepository.findById(id);
	}

	@Override
	public List<Menbro> buscaTodos() {
		return menbroRepository.findAll();
	}

	@Override
	public Menbro atualizar(Menbro t) {
		return menbroRepository.save(t);
	}

	@Override
	public void excluir(Optional<Menbro> t) {
		menbroRepository.delete(t.get());

	}

}
