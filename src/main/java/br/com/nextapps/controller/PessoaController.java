package br.com.nextapps.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.com.nextapps.model.Pessoa;
import br.com.nextapps.service.PessoaService;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;

	@RequestMapping(method = RequestMethod.POST, 
			value = "/cadastrar", 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pessoa> cadastraPessoa(@RequestBody Pessoa pessoa) {
		Pessoa pessoaSalva = pessoaService.cadastra(pessoa);
		return new ResponseEntity<>(pessoaSalva, HttpStatus.CREATED);
	}

	@RequestMapping(method=RequestMethod.GET, 
			value="/buscartodos",
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Pessoa>> buscaTodasPessoas() {
		Collection<Pessoa> listaPessoa = pessoaService.buscaTodos();
		return new ResponseEntity<>(listaPessoa, HttpStatus.OK);
	}
	
	@RequestMapping(
			method=RequestMethod.GET, 
			value="/buscar/{id}",
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<Pessoa>>buscaPorId(@PathVariable Long id){
		Optional<Pessoa> pessoa = pessoaService.buscarPorId(id);
		return new ResponseEntity<>(pessoa, HttpStatus.OK);
	}
	
	@RequestMapping(
			method=RequestMethod.DELETE, 
			value="/excluir/{id}")
	public ResponseEntity<Optional<Pessoa>> excluirCliente(@PathVariable Long id) {
		Optional<Pessoa> pessoaEncontrada = pessoaService.buscarPorId(id);
		if(pessoaEncontrada == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		pessoaService.excluir(pessoaEncontrada);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(
			method=RequestMethod.PUT, 
			value="/alterar",
			consumes=MediaType.APPLICATION_JSON_VALUE,	
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pessoa> alterarPessoa(@RequestBody Pessoa pessoa) {
		Pessoa pessoaAlterado =  pessoaService.atualizar(pessoa);
		return new ResponseEntity<>(pessoaAlterado, HttpStatus.OK);
	}
	
}
