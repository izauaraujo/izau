package br.com.nextapps.service;

import java.util.List;
import java.util.Optional;


public interface IService <T>{
	
	T cadastra(T t);
	
	Optional<T>  buscarPorId(Long id);
	
	List<T> buscaTodos();
	
	T atualizar(T t);
	
	void excluir(Optional<T> t);
	
}
