/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.requisicao.dao;

import br.com.ifba.salmos.infrastructure.dao.IBaseDAO;
import br.com.ifba.salmos.requisicao.model.Requisicao;
import java.util.List;

/**
 *
 * @author Igor Lopes
 */
public interface IDaoRequisicao extends IBaseDAO<Requisicao>{
     public List<Requisicao> findByName(String name);
}
