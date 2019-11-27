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

/**
 *
 * @author francisco
 * @date 10/01/2019
 */

@SuppressWarnings("serial")
@Entity
@Table(name="informacoes_eclesiastica_tbl")
public class InformacaoEclesiastica extends AbstractEntity<Long>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne(mappedBy = "infoEclesiasticoCongregacao", cascade = CascadeType.ALL)
    private Congregacao congregacao;
    
    @OneToOne(cascade = CascadeType.ALL)
    private IgrejaBatismo igrejaBatismo;
    
    @Column(nullable = false)
    private Calendar dataAdmissao;
    
    @Column(nullable = false)
    private String nomeConjugue;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Cargo cargo;
    
    @OneToOne(mappedBy = "informacaoEclesiastica",cascade = CascadeType.ALL)
    private Menbro menbro;
    
    
    public Long getId() {
        return id;
    }

    public Congregacao getCongregacao() {
        return congregacao;
    }

    public InformacaoEclesiastica setCongregacao(Congregacao congregacao) {
        this.congregacao = congregacao;
        return this;
    }

    public IgrejaBatismo getIgrejaBatismo() {
        return igrejaBatismo;
    }

    public InformacaoEclesiastica setIgrejaBatismo(IgrejaBatismo igrejaBatismo) {
        this.igrejaBatismo = igrejaBatismo;
        igrejaBatismo.setInformacaoEclesiastica(this);
        return this;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public InformacaoEclesiastica setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
        return this;
        
    }

    public String getNomeConjugue() {
        return nomeConjugue;
    }

    public InformacaoEclesiastica setNomeConjugue(String nomeConjugue) {
        this.nomeConjugue = nomeConjugue;
        return this;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public InformacaoEclesiastica setCargo(Cargo cargo) {
        this.cargo = cargo;
        cargo.setInformacaoEclesiastica(this);
        return this;
    }

    public Menbro getMenbro() {
        return menbro;
    }

    public InformacaoEclesiastica setMenbro(Menbro menbro) {
        this.menbro = menbro;
        menbro.setInformacaoEclesiastica(this);
        return this;
        
    }
    
    @Override
    public String toString() {
        return "InformacaoEclesiastica{" + "id=" + id + ", congregacao=" + congregacao + ", igrejaBatismo=" + igrejaBatismo + ", dataAdmissao=" + dataAdmissao + ", nomeConjugue=" + nomeConjugue + ", cargo=" + cargo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final InformacaoEclesiastica other = (InformacaoEclesiastica) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
