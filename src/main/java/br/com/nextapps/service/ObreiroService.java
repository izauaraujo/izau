package br.com.nextapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextapps.model.Obreiro;
import br.com.nextapps.repository.ObreiroRepository;

@Service
public class ObreiroService implements IService<Obreiro> {

	@Autowired
	private ObreiroRepository obreiroRepository;

	@Override
	public Obreiro cadastra(Obreiro t) {
		return obreiroRepository.save(t);
	}

	@Override
	public Optional<Obreiro> buscarPorId(Long id) {
		return obreiroRepository.findById(id);
	}

	@Override
	public List<Obreiro> buscaTodos() {
		return obreiroRepository.findAll();
	}

	@Override
	public Obreiro atualizar(Obreiro t) {
		return obreiroRepository.save(t);
	}

	@Override
	public void excluir(Optional<Obreiro> t) {
		obreiroRepository.delete(t.get());

	}

}
