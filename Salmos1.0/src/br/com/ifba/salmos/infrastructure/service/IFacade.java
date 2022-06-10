/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.salmos.infrastructure.service;

import br.com.ifba.salmos.tiposdeusuarios.model.TipoDeUsuario;
import br.com.ifba.salmos.usuario.model.Usuario;
import java.util.List;

/**
 *
 * @author rocki.julius
 */
public interface IFacade {
    
    //------------------- Usuario -------------------------------//
    public abstract Usuario saveUsuario(Usuario usuario);
    public abstract Usuario updateUsuario(Usuario usuario);
    public abstract void deleteUsuario(Usuario usuario);
    public List<Usuario> getAllUsuarios();
    public List<Usuario> findByName(String name);
    //-------------------------TipoDeUsuario-----------------------------//
    public abstract TipoDeUsuario saveTipoDeUsuario(TipoDeUsuario tipodeusuario);
    public abstract TipoDeUsuario updateTipoDeUsuario(TipoDeUsuario tipodeusuario);
    public abstract void deleteTipoDeUsuario(TipoDeUsuario tipodeusuario);
    public List<TipoDeUsuario> getAllTipoDeUsuarios();
    public List<TipoDeUsuario> findByNameTipo(String name);
}
