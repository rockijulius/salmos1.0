/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.salmos.infrastructure.service;

import br.com.ifba.salmos.item.model.Item;
import br.com.ifba.salmos.requisicao.model.Requisicao;
import br.com.ifba.salmos.setor.model.Setor;
import br.com.ifba.salmos.tiposdeusuarios.model.TipoDeUsuario;
import br.com.ifba.salmos.usuario.model.Usuario;
import java.util.List;

/**
 *
 * @author rocki.julius
 */
public interface IFacade {

    // ------------------- Usuario -------------------------------//
    public abstract Usuario saveUsuario(Usuario usuario);

    public abstract Usuario updateUsuario(Usuario usuario);

    public abstract void deleteUsuario(Usuario usuario);

    public List<Usuario> getAllUsuarios();

    public List<Usuario> findByName(String name);

    // -------------------------TipoDeUsuario-----------------------------//
    public abstract TipoDeUsuario saveTipoDeUsuario(TipoDeUsuario tipodeusuario);

    public abstract TipoDeUsuario updateTipoDeUsuario(TipoDeUsuario tipodeusuario);

    public abstract void deleteTipoDeUsuario(TipoDeUsuario tipodeusuario);

    public List<TipoDeUsuario> getAllTipoDeUsuarios();

    public List<TipoDeUsuario> findByNameTipo(String name);

    // ------------------------Item-----------------------------//
    public abstract Item saveItem(Item item);

    public abstract Item updateItem(Item item);

    public abstract void deleteItem(Item item);

    public List<Item> getAllItem();

    public List<Item> findByNameItem(String Item);

    // ------------------------Requisicao-----------------------------//
    public abstract Requisicao saveRequisicao(Requisicao requisicao);

    public abstract Requisicao updateRequisicao(Requisicao requisicao);

    public abstract void deleteRequisicao(Requisicao requisicao);

    public List<Requisicao> getAllRequisicao();

    public List<Requisicao> findByNameRequisicao(String requisicao);

    // ------------------------Setor-----------------------------//
    public Setor saveSetor(Setor setor);

    public Setor updateSetor(Setor setor);

    public void deleteSetor(Setor setor);

    public List<Setor> getAllSetor();

    public List<Setor> findByNameSetor(String setor);
}
