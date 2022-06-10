/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.usuario.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.tiposdeusuarios.view.ViewTipoDeUsuario;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author vitor
 */

@Entity
@Table
public class Usuario extends PersistenceEntity{
    
     private String login;
     private String senha;
     private String email;
     private String nome;
     private ViewTipoDeUsuario tipodeusuario;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public ViewTipoDeUsuario getTipodeusuario() {
        return tipodeusuario;
    }

    public void setTipodeusuario(ViewTipoDeUsuario tipodeusuario) {
        this.tipodeusuario = tipodeusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
     
}
