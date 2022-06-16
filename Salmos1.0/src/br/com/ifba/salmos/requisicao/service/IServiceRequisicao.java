/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.requisicao.service;

import br.com.ifba.salmos.requisicao.model.Requisicao;
import java.util.List;

/**
 *
 * @author Igor Lopes
 */
public interface IServiceRequisicao {
    public abstract Requisicao saveRequisicao(Requisicao requisicao);
    public abstract Requisicao updateRequisicao(Requisicao requisicao);
    public abstract void deleteRequisicao(Requisicao requisicao);
    public abstract List<Requisicao> getAllRequisicao();
    public List<Requisicao> findByName(String name);
}
