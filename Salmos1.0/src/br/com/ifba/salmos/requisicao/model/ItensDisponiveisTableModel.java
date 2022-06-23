/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.salmos.requisicao.model;

import br.com.ifba.salmos.infrastructure.service.FacadeInstance;
import br.com.ifba.salmos.item.model.Item;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rocki.julius
 */
public class ItensDisponiveisTableModel extends AbstractTableModel{

    private List<Item> listaItens = FacadeInstance.getInstance().getAllItem();
    private String[] colunas = {"Id", "Item", "Quantidade"};
       
    @Override
    public String getColumnName(int column) {
        return colunas[column]; 
    }
    
    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna){
                case 0:
                    return listaItens.get(linha).getId();
                case 1:
                    return listaItens.get(linha).getNome();
                case 2:
                    return listaItens.get(linha).getQuantidade();
        }
        return null;
    }

    public List<Item> getListaItensRequisicao() {
        return listaItens;
    }
    
    public void atualizaListaRequisicao(){
        listaItens = FacadeInstance.getInstance().getAllItem(); //pega os dados novamente no banco de dados
        this.fireTableDataChanged();
    };
   
}
