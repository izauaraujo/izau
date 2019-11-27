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
 * @date 10/01/2019
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "congregacao_tbl")
public class Congregacao extends AbstractEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long codigo;

    @Column(nullable = false)
    private String nomeCongregacao;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco enderecoCongregacao;

//    @OneToMany(mappedBy = "congregacaoTelefone", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @Fetch(FetchMode.SUBSELECT)
//    private Collection<Telefone> listaTelefone;
    
    private String telefone;

    @OneToOne(cascade = CascadeType.ALL)
    private HistoricoEclesiastico historicoEclesiastico;
    
    @OneToOne(cascade = CascadeType.ALL)
    private IgrejaBatismo congrecacaoBatismo;
    
    @OneToOne(cascade = CascadeType.ALL)
    private InformacaoEclesiastica infoEclesiasticoCongregacao;
    
    
    public Long getId() {
        return id;
    }

    public Congregacao setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCodigo() {
        return codigo;
    }

    public Congregacao setCodigo(Long codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNomeCongregacao() {
        return nomeCongregacao;
    }

    public Congregacao setNomeCongregacao(String nomeCongregacao) {
        this.nomeCongregacao = nomeCongregacao;
        return this;
    }

    public Endereco getEndereco() {
        return enderecoCongregacao;
    }

    public Congregacao setEndereco(Endereco endereco) {
        this.enderecoCongregacao = endereco;
        endereco.setCongregacao(this);//adicionar isso quando for relacionamentos bidirecinais @OneToOne
        return this;
    }

//    public Collection<Telefone> getListaTelefone() {
//        return listaTelefone;
//    }
//
//    public Congregacao setListaTelefone(Collection<Telefone> listaTelefone) {
//        this.listaTelefone = listaTelefone;
//        return this;
//    }
     
    public Endereco getEnderecoCongregacao() {
        return enderecoCongregacao;
    }

    public InformacaoEclesiastica getInfoEclesiasticoCongregacao() {
		return infoEclesiasticoCongregacao;
	}

	public Congregacao setInfoEclesiasticoCongregacao(InformacaoEclesiastica infoEclesiasticoCongregacao) {
		this.infoEclesiasticoCongregacao = infoEclesiasticoCongregacao;
		return this;
	}

	public String getTelefone() {
		return telefone;
	}

	public Congregacao setTelefone(String telefone) {
		this.telefone = telefone;
		return this;
	}

	public Congregacao setEnderecoCongregacao(Endereco enderecoCongregacao) {
        this.enderecoCongregacao = enderecoCongregacao;
        enderecoCongregacao.setCongregacao(this);
        return this;
    }

    public HistoricoEclesiastico getHistoricoEclesiastico() {
        return historicoEclesiastico;
    }

    public Congregacao setHistoricoEclesiastico(HistoricoEclesiastico historicoEclesiastico) {
        this.historicoEclesiastico = historicoEclesiastico;
        historicoEclesiastico.setCongregacaoAnterior(this);
        return this;
    }

    public IgrejaBatismo getCongrecacaoBatismo() {
        return congrecacaoBatismo;
    }

    public Congregacao setCongrecacaoBatismo(IgrejaBatismo congrecacaoBatismo) {
        this.congrecacaoBatismo = congrecacaoBatismo;
        congrecacaoBatismo.setCongregacao(this);
        return this;
    }

    public InformacaoEclesiastica getInfoEclisiasticoCongregacao() {
        return infoEclesiasticoCongregacao;
    }

    public Congregacao setInfoEclisiasticoCongregacao(InformacaoEclesiastica infoEclesiasticoCongregacao) {
        this.infoEclesiasticoCongregacao = infoEclesiasticoCongregacao;
        infoEclesiasticoCongregacao.setCongregacao(this);
        return this;
    }
    
    

    @Override
	public String toString() {
		return "Congregacao [id=" + id + ", codigo=" + codigo + ", nomeCongregacao=" + nomeCongregacao
				+ ", enderecoCongregacao=" + enderecoCongregacao + ", telefone=" + telefone + ", historicoEclesiastico="
				+ historicoEclesiastico + ", congrecacaoBatismo=" + congrecacaoBatismo
				+ ", infoEclesiasticoCongregacao=" + infoEclesiasticoCongregacao + "]";
	}

	@Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
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
        final Congregacao other = (Congregacao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
