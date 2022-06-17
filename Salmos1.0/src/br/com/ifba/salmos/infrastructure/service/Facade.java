/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.salmos.infrastructure.service;

import br.com.ifba.salmos.item.model.Item;
import br.com.ifba.salmos.item.service.IServiceItem;
import br.com.ifba.salmos.item.service.ServiceItem;
import br.com.ifba.salmos.requisicao.model.Requisicao;
import br.com.ifba.salmos.requisicao.service.IServiceRequisicao;
import br.com.ifba.salmos.requisicao.service.ServiceRequisicao;
import br.com.ifba.salmos.setor.model.Setor;
import br.com.ifba.salmos.setor.service.IServiceSetor;
import br.com.ifba.salmos.setor.service.ServiceSetor;
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

    // -----------------Usuario-------------------//

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

    // -----------------TipoDeUsuario-----------------//

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

    // ------------------------Item--------------------------//

    private final IServiceItem serviceItem = new ServiceItem();

    @Override
    public Item saveItem(Item item) {
        return serviceItem.saveItem(item);
    }

    @Override
    public Item updateItem(Item item) {
        return serviceItem.updateItem(item);
    }

    @Override
    public void deleteItem(Item item) {
        this.serviceItem.deleteItem(item);
    }

    @Override
    public List<Item> getAllItem() {
        return serviceItem.getAllItens();
    }

    @Override
    public List<Item> findByNameItem(String Item) {
        return serviceItem.findByName(Item);
    }

    // ------------------------Requisição--------------------------//

    private final IServiceRequisicao serviceRequisicao = new ServiceRequisicao();

    @Override
    public Requisicao saveRequisicao(Requisicao requisicao) {
        return serviceRequisicao.saveRequisicao(requisicao);
    }

    @Override
    public Requisicao updateRequisicao(Requisicao requisicao) {
        return serviceRequisicao.updateRequisicao(requisicao);
    }

    @Override
    public void deleteRequisicao(Requisicao requisicao) {
        this.serviceRequisicao.deleteRequisicao(requisicao);
    }

    @Override
    public List<Requisicao> getAllRequisicao() {
        return serviceRequisicao.getAllRequisicao();
    }

    @Override
    public List<Requisicao> findByNameRequisicao(String Requisicao) {
        return serviceRequisicao.findByName(Requisicao);
    }

    // ------------------------Setor--------------------------//

    private final IServiceSetor serviceSetor = new ServiceSetor();

    @Override
    public Setor saveSetor(Setor setor) {
        return serviceSetor.saveSetor(setor);
    }

    @Override
    public Setor updateSetor(Setor setor) {
        return serviceSetor.updateSetor(setor);
    }

    @Override
    public void deleteSetor(Setor setor) {
        serviceSetor.deleteSetor(setor);
    }

    @Override
    public List<Setor> getAllSetor() {
        return serviceSetor.getAllSetor();
    }

    @Override
    public List<Setor> findByNameSetor(String setor) {
        return serviceSetor.findByName(setor);
    }
}
