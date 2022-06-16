/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.item.service;

import br.com.ifba.salmos.item.model.Item;
import java.util.List;

/**
 *
 * @author vitor
 */
public interface IServiceItem {
    public abstract Item saveItem(Item item);
    public abstract Item updateItem(Item item);
    public abstract void deleteItem(Item item);
    public abstract List<Item> getAllItens();
    public List<Item> findByName(String name);
}
