/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.fornecedor.service;

import br.com.ifba.salmos.fornecedor.model.Fornecedor;
import java.util.List;

/**
 *
 * @author vitor
 */
public interface IServiceFornecedor {
    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
    public abstract Fornecedor updateFornecedor(Fornecedor fornecedor);
    public abstract void deleteFornecedor(Fornecedor fornecedor);
    public abstract List<Fornecedor> getAllFornecedor();
    public List<Fornecedor> findByName(String name);
}
