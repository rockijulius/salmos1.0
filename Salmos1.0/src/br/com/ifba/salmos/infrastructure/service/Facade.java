/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.salmos.infrastructure.service;

import br.com.ifba.salmos.tiposdeusuarios.model.TipoDeUsuario;
import br.com.ifba.salmos.tiposdeusuarios.service.IServiceTipoDeUsuario;
import br.com.ifba.salmos.tiposdeusuarios.service.ServiceTipoDeUsuario;
import br.com.ifba.salmos.usuario.model.Usuario;
import br.com.ifba.salmos.usuario.service.ServiceUsuario;
import java.util.List;
import br.com.ifba.salmos.usuario.service.IServiceUsuario;


/**
 *
 * @author rocki.julius
 */
public class Facade implements IFacade {
    
    //-----------------Usuario-------------------//
    
    private final IServiceUsuario serviceUsuario = new ServiceUsuario();

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return serviceUsuario.saveUsuario(usuario);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return serviceUsuario.updateUsuario(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        this.serviceUsuario.deleteUsuario(usuario);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return serviceUsuario.getAllUsuarios();
    }

    @Override
    public List<Usuario> findByName(String name) {
        return serviceUsuario.findByName(name);
    }
    
    //-----------------TipoDeUsuario-----------------//
    
    private final IServiceTipoDeUsuario serviceTipoDeUsuario = new ServiceTipoDeUsuario();

    @Override
    public TipoDeUsuario saveTipoDeUsuario(TipoDeUsuario tipodeusuario) {
        return serviceTipoDeUsuario.saveTipoDeUsuario(tipodeusuario);
    }

    @Override
    public TipoDeUsuario updateTipoDeUsuario(TipoDeUsuario tipodeusuario) {
        return serviceTipoDeUsuario.updateTipoDeUsuario(tipodeusuario);
    }

    @Override
    public void deleteTipoDeUsuario(TipoDeUsuario tipodeusuario) {
        this.serviceTipoDeUsuario.deleteTipoDeUsuario(tipodeusuario);
    }

    @Override
    public List<TipoDeUsuario> getAllTipoDeUsuarios() {
        return serviceTipoDeUsuario.getAllTipoDeUsuario();
    }

    @Override
    public List<TipoDeUsuario> findByNameTipo(String name) {
        return serviceTipoDeUsuario.findByName(name);
    }
    
    
}
