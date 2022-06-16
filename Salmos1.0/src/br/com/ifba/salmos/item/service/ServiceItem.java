/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.item.service;

import br.com.ifba.salmos.infrastructure.exception.BusinessException;
import br.com.ifba.salmos.item.dao.DaoItem;
import br.com.ifba.salmos.item.dao.IDaoItem;
import br.com.ifba.salmos.item.model.Item;
import java.util.List;

/**
 *
 * @author vitor
 */
public class ServiceItem implements IServiceItem{
    
    //Constantes para condições de erro
    
    //Item Null
    public final static String ITEM_NULL = "Item null";
    
    //Item já existe
    public final static String ITEM_EXISTE = "Item já existe";
    
    //Item não existente
    public final static String ITEM_NAO_EXISTE = "O item já existe na base de dados";
    
    //Item inválido
    public final static String ITEM_INVALIDO = "Item inválido";
    
    //Criando objeto de instância
    
    private final IDaoItem daoItem = new DaoItem();

    @Override
    public Item saveItem(Item item) {
        if(item == null){
            throw new BusinessException(ITEM_NULL);
        } else if(daoItem.findById(item.getId()) != null){
            throw new BusinessException(ITEM_EXISTE);
        } else{
            return daoItem.save(item);
        }
    }

    @Override
    public Item updateItem(Item item) {
        if(item == null){
            throw new BusinessException(ITEM_NULL);
        } else if(daoItem.findById(item.getId()) != null){
            throw new BusinessException(ITEM_EXISTE);
        } else{
            return daoItem.update(item);
        }
    }

    @Override
    public void deleteItem(Item item) {
        if(item == null){
            throw new BusinessException(ITEM_NULL);
        } else if(daoItem.findById(item.getId()) != null){
            this.daoItem.delete(item);
            return;
        } 
        
        throw new BusinessException(ITEM_NAO_EXISTE);
        
    }

    @Override
    public List<Item> getAllItens() {
        return daoItem.findAll();
    }

    @Override
    public List<Item> findByName(String name) {
        if(name == null){
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()){
            throw new BusinessException("Nome vazio");
        } else {
            return daoItem.findByName(name);
        }
    }
    
    
}
