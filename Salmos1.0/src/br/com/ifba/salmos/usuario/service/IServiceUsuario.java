/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.usuario.service;

import br.com.ifba.salmos.usuario.model.Usuario;
import java.util.List;

/**
 *
 * @author vitor
 */
public interface IServiceUsuario {
    public abstract Usuario saveUsuario(Usuario usuario);
    public abstract Usuario updateUsuario(Usuario usuario);
    public abstract void deleteUsuario(Usuario usuario);
    public abstract List<Usuario> getAllUsuarios();
    public List<Usuario> findByName(String name);
}
