/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.usuario.dao;

import br.com.ifba.salmos.infrastructure.dao.BaseDAO;
import br.com.ifba.salmos.usuario.model.Usuario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author vitor
 */
public class DaoUsuario extends BaseDAO<Usuario> implements IDaoUsuario{

    @Override
    public List<Usuario> findByName(String name) {
      String busca = "SELECT a FROM Aluno AS a WHERE a.nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();  
    }
    
}
