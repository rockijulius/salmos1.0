/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.setor.service;

import br.com.ifba.salmos.infrastructure.exception.BusinessException;
import br.com.ifba.salmos.setor.dao.DaoSetor;
import br.com.ifba.salmos.setor.dao.IDaoSetor;
import br.com.ifba.salmos.setor.model.Setor;
import java.util.List;

/**
 *
 * @author Everton e Tarcísio.
 */
public class ServiceSetor implements IServiceSetor{

     //CONSTANTES
    
    //mensagem de erro se o setor for null;
    public final static String SETOR_NULL = "Setor null";
    
    //mensagem de erro se o setor já existir;
    public final static String SETOR_EXISTE = "O Setor já existe,";
    
    //mensagem de erro se o setor não existir no banco;
    public final static String SETOR_NAO_EXISTE = "O Setor não existe na base de dados";
    
    //mensagem de erro se o setor for inválido;
    public final static String SETOR_INVALIDO = "Setor inválido";
    
    //Objeto
    
    private final IDaoSetor daoSetor = new DaoSetor(); 

    @Override
    public Setor saveSetor(Setor setor) {
        if(setor == null){
            throw new BusinessException(SETOR_NULL);
            } else if(daoSetor.findById(setor.getId()) != null) {
            throw new BusinessException(SETOR_EXISTE);
        } else {
            return daoSetor.save(setor);
        }
        }
    

    @Override
    public Setor updateSetor(Setor setor) {
     if(setor == null){
            throw new BusinessException(SETOR_NULL);
        } else if(daoSetor.findById(setor.getId()) == null) {
            throw new BusinessException(SETOR_NAO_EXISTE);
        } else {
            return daoSetor.update(setor);
        }
    }

    @Override
    public void deleteSetor(Setor setor) {
         if(setor == null){
            throw new BusinessException(SETOR_NULL);
        } else if(daoSetor.findById(setor.getId()) != null) {
            daoSetor.delete(setor);
        }else{ 
            throw new BusinessException(SETOR_NAO_EXISTE);
        }
    }

    @Override
    public List<Setor> getAllSetor() {
       return this.daoSetor.findAll();
    }

    @Override
    public List<Setor> findByName(String name) {
           if(name == null) {
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()) {
            throw new BusinessException("Nome vazio");
        } else {
            return daoSetor.findByName(name);
        } 
    }
    
}
