/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.tiposdeusuarios.dao;

import br.com.ifba.salmos.infrastructure.dao.IBaseDAO;
import br.com.ifba.salmos.tiposdeusuarios.model.TipoDeUsuario;
import java.util.List;

/**
 *
 * @author Igor Lopes e Eduarda
 */
public interface IDaoTipoDeUsuario extends IBaseDAO<TipoDeUsuario> {
   public abstract List<TipoDeUsuario> findByName(String name);
}