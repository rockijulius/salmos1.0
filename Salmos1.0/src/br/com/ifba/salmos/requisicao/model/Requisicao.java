/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.requisicao.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Igor Lopes
 */
@Entity
@Table
public class Requisicao extends PersistenceEntity{
    private String setor;
    private long idUsuario;
    private String listaItens;
    private String quantidadeItens;

    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public long getUsuario() {
        return idUsuario;
    }

    public void setUsuario(long usuario) {
        this.idUsuario = usuario;
    }

    public String getListaItens() {
        return listaItens;
    }

    public void setListaItens(String listaItens) {
        this.listaItens = listaItens;
    }

    public String getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(String quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    @Override
    public String toString() {
        return "Requisicao{" + "setor=" + setor + ", usuario=" + idUsuario + ", listaItens=" + listaItens + ", quantidadeItens=" + quantidadeItens + '}';
    }

  
    
    
}
