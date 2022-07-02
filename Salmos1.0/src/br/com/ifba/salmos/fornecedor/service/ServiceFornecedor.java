/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.fornecedor.service;

import br.com.ifba.salmos.fornecedor.dao.DaoFornecedor;
import br.com.ifba.salmos.fornecedor.dao.IDaoFornecedor;
import br.com.ifba.salmos.fornecedor.model.Fornecedor;
import br.com.ifba.salmos.infrastructure.exception.BusinessException;
import java.util.List;

/**
 *
 * @author vitor
 */
public class ServiceFornecedor implements IServiceFornecedor{
    
    //Constantes para condições de erro
    
    //Fornecedor Null
    public final static String FORNECEDOR_NULL = "Fornecedor null";
    
    //Fornecedor já existe
    public final static String FORNECEDOR_EXISTE = "Fornecedor já existe";
    
    //Fornecedor não existente
    public final static String FORNECEDOR_NAO_EXISTE = "O Fornecedor já existe na base de dados";
    
    //Fornecedor inválido
    public final static String FORNECEDOR_INVALIDO = "Fornecedor inválido";
    
    //Criando objeto de instância
    
    private final IDaoFornecedor daoFornecedor = new DaoFornecedor();
    
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null){
            throw new BusinessException(FORNECEDOR_NULL);
        } else if(daoFornecedor.findById(fornecedor.getId()) != null){
            throw new BusinessException(FORNECEDOR_EXISTE);
        } else{
            return daoFornecedor.save(fornecedor);
        }
    }

    @Override
    public Fornecedor updateFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null){
            throw new BusinessException(FORNECEDOR_NULL);
        } else if(daoFornecedor.findById(fornecedor.getId()) == null){
            throw new BusinessException(FORNECEDOR_EXISTE);
        } else{
            return daoFornecedor.update(fornecedor);
        }
    }

    @Override
    public void deleteFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null){
            throw new BusinessException(FORNECEDOR_NULL);
        } else if(daoFornecedor.findById(fornecedor.getId()) != null){
            this.daoFornecedor.delete(fornecedor);
            return;
        } 
        
        throw new BusinessException(FORNECEDOR_NAO_EXISTE);
    }

    @Override
    public List<Fornecedor> getAllFornecedor() {
        return daoFornecedor.findAll();
    }

    @Override
    public List<Fornecedor> findByName(String name) {
        if(name == null){
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()){
            throw new BusinessException("Nome vazio");
        } else {
            return daoFornecedor.findByName(name);
        }
    }
    
}
