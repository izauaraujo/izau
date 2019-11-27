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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author francisco
 */
@SuppressWarnings("serial")
@Entity
@Table(name="estado_tbl")
public class Estado extends AbstractEntity<Long> {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String sigla;
    
    @OneToMany(mappedBy = "estadoCidade",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private Collection<Cidade> listaCidades;
    
    @OneToOne(mappedBy = "estadoEndereco",cascade = CascadeType.ALL)
    private Endereco enderecoEstado;
    
    
    public Long getId() {
        return id;
    }

    public Estado setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Estado setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSigla() {
        return sigla;
    }

    public Estado setSigla(String sigla) {
        this.sigla = sigla;
        return this;
    }

    public Collection<Cidade> getListaCidades() {
        return listaCidades;
    }

    public Estado setListaCidades(Collection<Cidade> listaCidades) {
        this.listaCidades = listaCidades;
        return this;
    }

    public Endereco getEnderecoEstado() {
        return enderecoEstado;
    }

    public Estado setEnderecoEstado(Endereco enderecoEstado) {
        this.enderecoEstado = enderecoEstado;
        enderecoEstado.setEstadoEndereco(this);
        return this;
        
    }
    
    
  

    @Override
	public String toString() {
		return "Estado [id=" + id + ", nome=" + nome + ", sigla=" + sigla + ", listaCidades=" + listaCidades
				+ ", enderecoEstado=" + enderecoEstado + "]";
	}

	@Override
    public int hashCode() {
        int hash = 3;
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
        final Estado other = (Estado) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
