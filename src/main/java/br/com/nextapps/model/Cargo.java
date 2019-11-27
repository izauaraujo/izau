
package br.com.nextapps.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author francisco
 */
@SuppressWarnings("serial")
@Entity
@Table(name="cargo_tbl")
public class Cargo extends AbstractEntity<Long> {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nomeCargo;
    
    @Column(nullable = false)
    private String atribuicoes;
    
    @Lob
    private String descricao;
    
    @OneToOne(mappedBy = "cargo", cascade = CascadeType.ALL)
    private InformacaoEclesiastica informacaoEclesiastica;
    
    
    public Long getId() {
        return id;
    }

    public Cargo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public Cargo setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
        return this;
    }

    public String getAtribuicoes() {
        return atribuicoes;
    }

    public Cargo setAtribuicoes(String atribuicoes) {
        this.atribuicoes = atribuicoes;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Cargo setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public InformacaoEclesiastica getInformacaoEclesiastica() {
        return informacaoEclesiastica;
    }

    public Cargo setInformacaoEclesiastica(InformacaoEclesiastica informacaoEclesiastica) {
        this.informacaoEclesiastica = informacaoEclesiastica;
        informacaoEclesiastica.setCargo(this);
        return this;
    }
    
    
    
    @Override
    public String toString() {
        return "Cargo{" + "id=" + id + ", nomeCargo=" + nomeCargo + ", atribuicoes=" + atribuicoes + ", descricao=" + descricao + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Cargo other = (Cargo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
     
}
