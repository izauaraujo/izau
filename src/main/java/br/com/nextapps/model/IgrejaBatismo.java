package br.com.nextapps.model;

import java.util.Calendar;
import java.util.Objects;

import javax.persistence.CascadeType;
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
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "igreja_batismo_tbl")
public class IgrejaBatismo extends AbstractEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "congrecacaoBatismo", cascade = CascadeType.ALL)
    private Congregacao congregacao;

    @Temporal(TemporalType.DATE)
    private Calendar dataBatismo;
    
    @OneToOne(mappedBy = "igrejaBatismo", cascade = CascadeType.ALL)
    private Menbro menbro;
    
    @OneToOne(mappedBy = "igrejaBatismo", cascade = CascadeType.ALL)
    private InformacaoEclesiastica informacaoEclesiastica;
    
    public Long getId() {
        return id;
    }

    public IgrejaBatismo setId(Long id) {
        this.id = id;
        return this;
    }

    public Congregacao getCongregacao() {
        return congregacao;
    }

    public IgrejaBatismo setCongregacao(Congregacao congregacao) {
        this.congregacao = congregacao;
        //congregacao.setCongrecacaoBatismo(this);
        return this;
    }
    
    public Calendar getDataBatismo() {
        return dataBatismo;
    }

    public void setDataBatismo(Calendar dataBatismo) {
        this.dataBatismo = dataBatismo;
    }

    public Menbro getMenbro() {
        return menbro;
    }

    public IgrejaBatismo setMenbro(Menbro menbro) {
        this.menbro = menbro;
       // menbro.setIgrejaBatismo(this);
        return this;
    }

    public InformacaoEclesiastica getInformacaoEclesiastica() {
        return informacaoEclesiastica;
    }

    public IgrejaBatismo setInformacaoEclesiastica(InformacaoEclesiastica informacaoEclesiastica) {
        this.informacaoEclesiastica = informacaoEclesiastica;
        //informacaoEclesiastica.setIgrejaBatismo(this);
        return this;
    }

    @Override
    public String toString() {
        return "IgrejaBatismo{" + "id=" + id + ", congregacao=" + congregacao + ", dataBatismo=" + dataBatismo + ", menbro=" + menbro + ", informacaoEclesiastica=" + informacaoEclesiastica + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final IgrejaBatismo other = (IgrejaBatismo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
