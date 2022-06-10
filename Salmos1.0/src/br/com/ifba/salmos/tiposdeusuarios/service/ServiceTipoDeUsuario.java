/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.tiposdeusuarios.service;

import br.com.ifba.salmos.infrastructure.exception.BusinessException;
import br.com.ifba.salmos.tiposdeusuarios.dao.DaoTipoDeUsuario;
import br.com.ifba.salmos.tiposdeusuarios.dao.IDaoTipoDeUsuario;
import br.com.ifba.salmos.tiposdeusuarios.model.TipoDeUsuario;
import java.util.List;

/**
 *
 * @author Igor Lopes e Eduarda
 */
public class ServiceTipoDeUsuario implements IServiceTipoDeUsuario{
    
    //CONSTANTES
    
    //mensagem de erro se o Usuario for null;
    public final static String USUARIO_NULL = "Usuário null";
    
    //mensagem de erro se o Usuario já existir;
    public final static String USUARIO_EXISTE = "O Usuário já existe,";
    
    //mensagem de erro se o Usuario não existir no banco;
    public final static String USUARIO_NAO_EXISTE = "O Usuário não existe na base de dados";
    
    //mensagem de erro se o Usuario for inválido;
    public final static String USUARIO_INVALIDO = "Usuário inválido";
    
    //OBJETO
    
    private final IDaoTipoDeUsuario daoTipoDeUsuario = new DaoTipoDeUsuario();

    @Override
    public TipoDeUsuario saveTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
       if(tipoDeUsuario == null){
            throw new BusinessException(USUARIO_NULL);
        } else if(daoTipoDeUsuario.findById(tipoDeUsuario.getId()) != null) {
            throw new BusinessException(USUARIO_EXISTE);
        } else {
            return daoTipoDeUsuario.save(tipoDeUsuario);
        }
    }

    @Override
    public TipoDeUsuario updateTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
        if(tipoDeUsuario == null){
            throw new BusinessException(USUARIO_NULL);
        } else if(daoTipoDeUsuario.findById(tipoDeUsuario.getId()) == null) {
            throw new BusinessException(USUARIO_NAO_EXISTE);
        } else {
            return daoTipoDeUsuario.update(tipoDeUsuario);
        }
    }

    @Override
    public void deleteTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
        if(tipoDeUsuario == null){
            throw new BusinessException(USUARIO_NULL);
        } else if(daoTipoDeUsuario.findById(tipoDeUsuario.getId()) != null) {
            daoTipoDeUsuario.delete(tipoDeUsuario);
        }else{ 
            throw new BusinessException(USUARIO_NAO_EXISTE);
        }
    }

    @Override
    public List<TipoDeUsuario> getAllTipoDeUsuario() {
        return this.daoTipoDeUsuario.findAll();
    }

    @Override
    public List<TipoDeUsuario> findByName(String name) {
        if(name == null) {
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()) {
            throw new BusinessException("Nome vazio");
        } else {
            return daoTipoDeUsuario.findByName(name);
        } 
    }
    
}
