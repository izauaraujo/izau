package br.com.nextapps.model;

import java.util.Collection;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 *
 * @author francisco
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "cidade_tbl")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Cidade extends AbstractEntity<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nomeCidade;

	@ManyToOne
	private Estado estadoCidade;

	@OneToMany(mappedBy = "cidadeEndereco", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
	private Collection<Endereco> listaEndereco;

	public Long getId() {
		return id;
	}

	public Cidade setId(Long id) {
		this.id = id;
		return this;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public Cidade setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
		return this;
	}

	public Estado getEstadoCidade() {
		return estadoCidade;
	}

	public Cidade setEstadoCidade(Estado estadoCidade) {
		this.estadoCidade = estadoCidade;
		return this;
	}

	public Collection<Endereco> getListaEndereco() {
		return listaEndereco;
	}

	public Cidade setListaEndereco(Collection<Endereco> listaEndereco) {
		this.listaEndereco = listaEndereco;
		return this;
	}

	@Override
	public String toString() {
		return "Cidade{" + "id=" + id + ", nomeCidade=" + nomeCidade + ", estadoCidade=" + estadoCidade
				+ ", listaEndereco=" + listaEndereco + '}';
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 17 * hash + Objects.hashCode(this.id);
		return hash;
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
		final Cidade other = (Cidade) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		return true;
	}

}
