/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.setor.model;

import br.com.ifba.salmos.infrastructure.model.PersistenceEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Everton.
 */
@Entity//Indicando que essa classe é uma das que vão se tornar persistivél no banco de dados.
@Table
public class Setor extends PersistenceEntity{
    //Atributos
    private String nome;
    private String descrição;

    //Getters e setters.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    
    
}
