/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.usuario.dao;

import br.com.ifba.salmos.infrastructure.dao.IBaseDAO;
import br.com.ifba.salmos.usuario.model.Usuario;
import java.util.List;

/**
 *
 * @author vitor
 */
public interface IDaoUsuario extends IBaseDAO<Usuario>{
    public abstract List<Usuario> findByName(String name);
}
