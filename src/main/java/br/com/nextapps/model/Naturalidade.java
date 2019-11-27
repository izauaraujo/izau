//package br.com.nextapps.model;
//
//import java.util.List;
//import java.util.Objects;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
///**
// *
// * @author francisco
// * @date 10/01/2019
// */
//@SuppressWarnings("serial")
//@Entity
//@Table(name = "naturalidade_tbl")
//public class Naturalidade extends AbstractEntity<Long>{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @OneToOne(mappedBy = "naturalidadeCidade", cascade = CascadeType.ALL)
//    private Cidade cidade;
//
//    @OneToOne(mappedBy = "naturalidadeEstado")
//    private Estado estado;
//
//    @OneToMany(mappedBy = "naturalidade", cascade = CascadeType.ALL)
//    private List<Pessoa> pessoasNaturalidade;
//        
//    public Long getId() {
//        return id;	
//    }
//
//    public Naturalidade setId(Long id) {
//        this.id = id;
//        return this;
//    }
//
//    public Cidade getCidade() {
//        return cidade;
//    }
//
//    public Naturalidade setCidade(Cidade cidade) {
//        this.cidade = cidade;
//        cidade.setNaturalidadeCidade(this);
//        return this;
//    }
//
//    public Estado getEstado() {
//        return estado;
//    }
//
//    public Naturalidade setEstado(Estado estado) {
//        this.estado = estado;
//        estado.setNaturalidadeEstado(this);
//        return this;
//    }
//
////    public Pessoa getPessoaNaturalidade() {
////        return pessoaNaturalidade;
////    }
//
////    public Naturalidade setPessoaNaturalidade(Pessoa pessoaNaturalidade) {
////        this.pessoaNaturalidade = pessoaNaturalidade;
////        pessoaNaturalidade.setNaturalidade(this);
////        return this;
////    }
//
//    @Override
//    public String toString() {
//        return "OrigemPessoa{" + "id=" + id + ", cidade=" + cidade + ", estado=" + estado + '}';
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 97 * hash + Objects.hashCode(this.id);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Naturalidade other = (Naturalidade) obj;
//        if (!Objects.equals(this.id, other.id)) {
//            return false;
//        }
//        return true;
//    }
//
//}
