/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.salmos.requisicao.model;

import br.com.ifba.salmos.infrastructure.service.FacadeInstance;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rocki.julius
 */
public class RequisicaoTableModel extends AbstractTableModel{

    private List<Requisicao> listaRequisicoes = FacadeInstance.getInstance().getAllRequisicao();
    private String[] colunas = {"Número", "Usuário", "Itens"};
       
    @Override
    public String getColumnName(int column) {
        return colunas[column]; 
    }
    
    @Override
    public int getRowCount() {
        return listaRequisicoes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna){
                case 0:
                    return listaRequisicoes.get(linha).getId();
                case 1:
                    return listaRequisicoes.get(linha).getUsuario();
                case 2:
                    return listaRequisicoes.get(linha).getListaItens();
        }
        return null;
    }

    public List<Requisicao> getListaRequisisoes() {
        return listaRequisicoes;
    }
    
    public void atualizaListaRequisicao(){
        listaRequisicoes = FacadeInstance.getInstance().getAllRequisicao(); //pega os dados novamente no banco de dados
        this.fireTableDataChanged();
    };
   
}
