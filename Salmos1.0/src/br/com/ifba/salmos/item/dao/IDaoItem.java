/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.item.dao;

import br.com.ifba.salmos.infrastructure.dao.IBaseDAO;
import br.com.ifba.salmos.item.model.Item;
import java.util.List;

/**
 *
 * @author vitor
 */
public interface IDaoItem extends IBaseDAO<Item>{
    public abstract List<Item> findByName(String name);
}
