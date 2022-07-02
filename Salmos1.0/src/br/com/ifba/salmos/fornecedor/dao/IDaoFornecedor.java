/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.fornecedor.dao;

import br.com.ifba.salmos.fornecedor.model.Fornecedor;
import br.com.ifba.salmos.infrastructure.dao.IBaseDAO;
import java.util.List;

/**
 *
 * @author vitor
 */
public interface IDaoFornecedor extends IBaseDAO<Fornecedor>{
    public abstract List<Fornecedor> findByName(String name);
}
