package br.com.nextapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextapps.model.Usuario;
import br.com.nextapps.repository.UsuarioRepository;

@Service
public class UsuarioService implements IService<Usuario> {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario cadastra(Usuario t) {
		return usuarioRepository.save(t);
	}

	@Override
	public Optional<Usuario> buscarPorId(Long id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public List<Usuario> buscaTodos() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario atualizar(Usuario t) {
		return usuarioRepository.save(t);
	}

	@Override
	public void excluir(Optional<Usuario> t) {
		usuarioRepository.delete(t.get());

	}

}
