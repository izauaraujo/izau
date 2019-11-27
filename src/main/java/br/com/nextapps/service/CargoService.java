package br.com.nextapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextapps.model.Cargo;
import br.com.nextapps.repository.CargoRepository;

@Service
public class CargoService implements IService<Cargo> {

	@Autowired
	private CargoRepository cargoReposiotry;

	@Override
	public Cargo cadastra(Cargo t) {
		cargoReposiotry.save(t);
		return t;
	}

	@Override
	public Optional<Cargo> buscarPorId(Long id) {
		return cargoReposiotry.findById(id);
	}

	@Override
	public List<Cargo> buscaTodos() {
		return cargoReposiotry.findAll();
	}

	@Override
	public Cargo atualizar(Cargo t) {
		return cargoReposiotry.save(t);
	}

	@Override
	public void excluir(Optional<Cargo> t) {
		cargoReposiotry.delete(t.get());
	}

}
