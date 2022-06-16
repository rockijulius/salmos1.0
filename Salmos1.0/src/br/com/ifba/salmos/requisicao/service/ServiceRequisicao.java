/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.requisicao.service;

import br.com.ifba.salmos.infrastructure.exception.BusinessException;
import br.com.ifba.salmos.requisicao.dao.DaoRequisicao;
import br.com.ifba.salmos.requisicao.dao.IDaoRequisicao;
import br.com.ifba.salmos.requisicao.model.Requisicao;
import java.util.List;

/**
 *
 * @author Igor Lopes
 */
public class ServiceRequisicao implements IServiceRequisicao{
    
    //CONSTANTES
    
    //mensagem de erro se a requisição for null;
    public final static String REQUISICAO_NULL = "Requisição null";
    
    //mensagem de erro se a Requisição já existir;
    public final static String REQUISICAO_EXISTE = "Requisição já existe,";
    
    //mensagem de erro se a Requisição não existir no banco;
    public final static String REQUISICAO_NAO_EXISTE = "Requisição não existe na base de dados";
    
    //mensagem de erro se a Requisição for inválido;
    public final static String REQUISICAO_INVALIDO = "Requisição inválida";
    
    //OBJETO
    
    private final IDaoRequisicao daoRequisicao = new DaoRequisicao();

    @Override
    public Requisicao saveRequisicao(Requisicao requisicao) {
       if(requisicao == null){
            throw new BusinessException(REQUISICAO_NULL);
        } else if(daoRequisicao.findById(requisicao.getId()) != null) {
            throw new BusinessException(REQUISICAO_EXISTE);
        } else {
            return daoRequisicao.save(requisicao);
        }
    }

    @Override
    public Requisicao updateRequisicao(Requisicao requisicao) {
        if(requisicao == null){
            throw new BusinessException(REQUISICAO_NULL);
        } else if(daoRequisicao.findById(requisicao.getId()) == null) {
            throw new BusinessException(REQUISICAO_NAO_EXISTE);
        } else {
            return daoRequisicao.update(requisicao);
        }
    }

   @Override
    public void deleteRequisicao(Requisicao requisicao) {
        if(requisicao == null){
            throw new BusinessException(REQUISICAO_NULL);
        } else if(daoRequisicao.findById(requisicao.getId()) != null){
            this.daoRequisicao.delete(requisicao);
            return;
        } 
        
        throw new BusinessException(REQUISICAO_NAO_EXISTE);
        
    }

    @Override
    public List<Requisicao> getAllRequisicao() {
        return this.daoRequisicao.findAll();
    }

    @Override
    public List<Requisicao> findByName(String name) {
        if(name == null) {
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()) {
            throw new BusinessException("Nome vazio");
        } else {
            return daoRequisicao.findByName(name);
        } 
    }
    
}
