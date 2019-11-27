package br.com.nextapps.model;

import java.util.Calendar;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author francisco
 * @date 10/01/2019
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "pessoa_tbl")
public class Pessoa extends AbstractEntity<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = true)
	private Long numeroMatricula;

	@Column(nullable = true)
	private String nome;

	@Column(nullable = true, length = 9)
	private String rg;

	@Column(nullable = true, length = 11)
	private String cpf;

	@Column(nullable = true, length = 13)
	private String tituloEleitor;

	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;

	@Column(nullable = true)
	private String nacionalidade;

	@Column(nullable = true)
	private String naturalDe;

	@Column(nullable = true)
	private String estado;

	@Column(nullable = true)
	private String profissao;

	@Column(nullable = true)
	private String escolaridade;

	@Column(nullable = true)
	private String estadoCivil;

	@Column(nullable = true)
	private String nomePai;

	@Column(nullable = true)
	private String nomeMae;

	@OneToOne(cascade = CascadeType.ALL)
	private Endereco enderecoPessoa;
	
	private String telefone;
	
	public Long getId() {
		return id;
	}

	public Pessoa setId(Long id) {
		this.id = id;
		return this;
	}

	public Long getNumeroMatricula() {
		return numeroMatricula;
	}

	public Pessoa setNumeroMatricula(Long numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public Pessoa setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public String getRg() {
		return rg;
	}

	public Pessoa setRg(String rg) {
		this.rg = rg;
		return this;
	}

	public String getCpf() {
		return cpf;
	}

	public Pessoa setCpf(String cpf) {
		this.cpf = cpf;
		return this;
	}

	public String getTituloEleitor() {
		return tituloEleitor;
	}

	public Pessoa setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
		return this;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public Pessoa setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNaturalDe() {
		return naturalDe;
	}

	public void setNaturalDe(String naturalDe) {
		this.naturalDe = naturalDe;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getProfissao() {
		return profissao;
	}

	public Pessoa setProfissao(String profissao) {
		this.profissao = profissao;
		return this;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public Pessoa setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
		return this;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public Pessoa setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
		return this;
	}

	public String getNomePai() {
		return nomePai;
	}

	public Pessoa setNomePai(String nomePai) {
		this.nomePai = nomePai;
		return this;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public Pessoa setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
		return this;
	}

	public Endereco getEndereco() {
		return enderecoPessoa;
	}

	public Pessoa setEndereco(Endereco enderecoPessoa) {
		this.enderecoPessoa = enderecoPessoa;
		//enderecoPessoa.setPessoa(this);// adicionar isso quando for relacionamentos bidirecinais @OneToOne
		return this;

	}

	public Endereco getEnderecoPessoa() {
		return enderecoPessoa;
	}

	public Pessoa setEnderecoPessoa(Endereco enderecoPessoa) {
		this.enderecoPessoa = enderecoPessoa;
		return this;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 59 * hash + Objects.hashCode(this.id);
		hash = 59 * hash + Objects.hashCode(this.numeroMatricula);
		return hash;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Pessoa other = (Pessoa) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		if (!Objects.equals(this.numeroMatricula, other.numeroMatricula)) {
			return false;
		}
		return true;
	}

}
