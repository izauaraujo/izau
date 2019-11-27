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
@Table(name = "historico_eclesiastico_tbl")
public class HistoricoEclesiastico extends AbstractEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataEntrada;
    
    @Temporal(TemporalType.DATE)
    private Calendar dataSaida;
    
    @OneToOne(mappedBy = "historicoEclesiastico", cascade = CascadeType.ALL)
    private Congregacao congregacaoAnterior;
    
    @OneToOne(mappedBy = "historicoEclesiastico", cascade = CascadeType.ALL)
    private Menbro menbro;
    
    @Column(nullable = true)
    private String historico;
    
    @Column(nullable = true)
    private String observacao;

    public Long getId() {
        return id;
    }

    public HistoricoEclesiastico setId(Long id) {
        this.id = id;
        return this;
    }

    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public HistoricoEclesiastico setDataEntrada(Calendar dataEntrada) {
        this.dataEntrada = dataEntrada;
        return this;
    }

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public HistoricoEclesiastico setDataSaida(Calendar dataSaida) {
        this.dataSaida = dataSaida;
        return this;
    }

    public Congregacao getCongregacaoAnterior() {
        return congregacaoAnterior;
    }

    public HistoricoEclesiastico setCongregacaoAnterior(Congregacao congregacaoAnterior) {
        this.congregacaoAnterior = congregacaoAnterior;
        return this;
    }

    public String getHistorico() {
        return historico;
    }

    public HistoricoEclesiastico setHistorico(String historico) {
        this.historico = historico;
        return this;
    }

    public String getObservacao() {
        return observacao;
    }

    public HistoricoEclesiastico setObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    public Menbro getMenbro() {
        return menbro;
    }

    public HistoricoEclesiastico setMenbro(Menbro menbro) {
        this.menbro = menbro;
        menbro.setHistoricoEclesiastico(this);
        return this;
        
    }
    
    
    @Override
    public String toString() {
        return "AntecedentesEclesiastico{" + "id=" + id + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", congregacaoAnterior=" + congregacaoAnterior + ", historico=" + historico + ", observacao=" + observacao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final HistoricoEclesiastico other = (HistoricoEclesiastico) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    

}
