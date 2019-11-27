package br.com.nextapps.model;


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
 * @date 11/01/2019
 */
@SuppressWarnings("serial")
@Entity
@Table(name="menbro_tbl")
public class Menbro extends Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//observar se vai dar algum problema por causa da heranca de id
    
    @OneToOne(cascade = CascadeType.ALL)
    private InformacaoEclesiastica informacaoEclesiastica;
    
    @OneToOne(cascade = CascadeType.ALL)
    private HistoricoEclesiastico historicoEclesiastico;
    
    @OneToOne(cascade = CascadeType.ALL)
    private IgrejaBatismo igrejaBatismo;
    
    @Column(nullable = true)
    private Boolean status;//ativo ou nao, aqui no caso substitui o o campo da ficha "Ja foi menbro dessa Igreja"
    
    @Column(nullable = true)
    private String obsevacoes;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public Menbro setId(Long id) {
        this.id = id;
        return this;
    }

    public InformacaoEclesiastica getInformacaoEclesiastica() {
        return informacaoEclesiastica;
    }

    public void setInformacaoEclesiastica(InformacaoEclesiastica informacaoEclesiastica) {
        this.informacaoEclesiastica = informacaoEclesiastica;
    }

    public HistoricoEclesiastico getHistoricoEclesiastico() {
        return historicoEclesiastico;
    }

    public Menbro setHistoricoEclesiastico(HistoricoEclesiastico historicoEclesiastico) {
        this.historicoEclesiastico = historicoEclesiastico;
        //historicoEclesiastico.setMenbro(this);
        return this;
    }

    public IgrejaBatismo getIgrejaBatismo() {
        return igrejaBatismo;
    }

    public Menbro setIgrejaBatismo(IgrejaBatismo igrejaBatismo) {
        this.igrejaBatismo = igrejaBatismo;
        //igrejaBatismo.setMenbro(this);
        return this;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getObsevacoes() {
        return obsevacoes;
    }

    public void setObsevacoes(String obsevacoes) {
        this.obsevacoes = obsevacoes;
    }

    @Override
    public String toString() {
        return "Menbro{" + "id=" + id + ", informacaoEclesiastica=" + informacaoEclesiastica + ", historicoEclesiastico=" + historicoEclesiastico + ", igrejaBatismo=" + igrejaBatismo + ", status=" + status + ", obsevacoes=" + obsevacoes + '}';
    }


    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final Menbro other = (Menbro) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
}
