/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.tiposdeusuarios.service;

import br.com.ifba.salmos.tiposdeusuarios.model.TipoDeUsuario;
import java.util.List;

/**
 *
 * @author Igor Lopes e Eduarda
 */
public interface IServiceTipoDeUsuario {
    public abstract TipoDeUsuario saveTipoDeUsuario(TipoDeUsuario tipoDeUsuario);
    public abstract TipoDeUsuario updateTipoDeUsuario(TipoDeUsuario tipoDeUsuario);
    public abstract void deleteTipoDeUsuario(TipoDeUsuario tipoDeUsuario);
    public abstract List<TipoDeUsuario> getAllTipoDeUsuario();
    public List<TipoDeUsuario> findByName(String name);
}
