/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nextapps.model;


import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 *
 * @author francisco
 * @date 17/01/2019
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "usuario_tbl")
@IdClass(Usuario.class)
public class Usuario extends AbstractEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(length = 60, nullable = false)
    private String name;

    @Column(length = 60, nullable = false)
    private String password;

    public Usuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public Long getId() {
        return idUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public Usuario setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public String getName() {
        return name;

    }

    public Usuario setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Usuario setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.idUsuario);
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
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.idUsuario, other.idUsuario);
    }

}
