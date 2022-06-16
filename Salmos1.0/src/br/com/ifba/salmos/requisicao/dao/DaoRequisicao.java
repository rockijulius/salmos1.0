/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.requisicao.dao;

import br.com.ifba.salmos.infrastructure.dao.BaseDAO;
import br.com.ifba.salmos.requisicao.model.Requisicao;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Igor Lopes
 */
public class DaoRequisicao extends BaseDAO<Requisicao> implements IDaoRequisicao{
    
    @Override
    public List<Requisicao> findByName(String name) {
        String busca = "SELECT a FROM Aluno AS a WHERE a.nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();  
    }
}
