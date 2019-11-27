package br.com.nextapps.model;


import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 *
 * @author francisco
 * @date 10/01/2019
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "endereco_tbl")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Endereco extends AbstractEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_pk")
    
    private Long id;

    @OneToOne(mappedBy = "enderecoPessoa", cascade = CascadeType.ALL)
    @JsonIgnore
    private Pessoa pessoa;

    @Column(nullable = false)
    private String logradoudo;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String bairro;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cidade cidadeEndereco;

    @OneToOne(cascade = CascadeType.ALL)
    private Estado estadoEndereco;

    @OneToOne(mappedBy = "enderecoCongregacao", cascade = CascadeType.ALL)
    private Congregacao congregacao;

    public Long getId() {
        return id;
    }

    public Endereco setId(Long id) {
        this.id = id;
        return this;
    }

    public String getLogradoudo() {
        return logradoudo;
    }

    public Endereco setLogradoudo(String logradoudo) {
        this.logradoudo = logradoudo;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public Endereco setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getBairro() {
        return bairro;
    }

    public Endereco setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public Cidade getCidadeEndereco() {
        return cidadeEndereco;
    }

    public Endereco setCidadeEndereco(Cidade cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
        return this;
    }

    public Estado getEstadoEndereco() {
        return estadoEndereco;
    }

    public Endereco setEstadoEndereco(Estado estadoEndereco) {
        this.estadoEndereco = estadoEndereco;
        //estadoEndereco.setEnderecoEstado(this);
        return this;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Endereco setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
       // pessoa.setEndereco(this);//adicionar isso quando for relacionamentos bidirecinais @OneToOne
        return this;
    }

    public Congregacao getCongregacao() {
        return congregacao;
    }

    public Endereco setCongregacao(Congregacao congregacao) {
        this.congregacao = congregacao;
       // congregacao.setEndereco(this);//adicionar isso quando for relacionamentos bidirecinais @OneToOne
        return this;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", pessoa=" + pessoa + ", logradoudo=" + logradoudo + ", numero=" + numero + ", bairro=" + bairro + ", cidadeEndereco=" + cidadeEndereco + ", estadoEndereco=" + estadoEndereco + ", congregacao=" + congregacao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
