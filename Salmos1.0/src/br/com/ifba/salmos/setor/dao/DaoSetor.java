/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.setor.dao;

import br.com.ifba.salmos.infrastructure.dao.BaseDAO;
import br.com.ifba.salmos.setor.model.Setor;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Everton e Tarcísio
 */
public class DaoSetor extends BaseDAO<Setor> implements IDaoSetor {

    @Override
    public List<Setor> findByName(String name) {
        String busca = "SELECT a FROM Aluno AS a WHERE a.nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();  
    }
}
