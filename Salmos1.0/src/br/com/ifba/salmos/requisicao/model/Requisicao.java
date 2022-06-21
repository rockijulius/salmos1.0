/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.requisicao.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import br.com.ifba.salmos.item.model.Item;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
    @OneToMany
    private Collection<Item> listaItens;
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

    public Collection<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(Collection<Item> listaItens) {
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
