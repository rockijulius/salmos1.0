/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.item.dao;

import br.com.ifba.salmos.infrastructure.dao.BaseDAO;
import br.com.ifba.salmos.item.model.Item;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author vitor
 */
public class DaoItem extends BaseDAO<Item> implements IDaoItem{

    @Override
    public List<Item> findByName(String name) {
        String busca = "SELECT a FROM Item AS a WHERE a.nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();
    }
    
}
