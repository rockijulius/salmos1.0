/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.grafico.service;

import br.com.ifba.salmos.fornecedor.model.Fornecedor;
import br.com.ifba.salmos.item.model.Item;
import java.awt.Dimension;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 .
 * @author Everton
 */
public class GraficoFornecedor {
    
    public CategoryDataset criaDataset (List<Fornecedor> listaFornecedor, List <Item> listaItem) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        int vet[] = new int[listaFornecedor.size()];
        int i = 0;
        
        for(Fornecedor fornecedor: listaFornecedor){
            for(Item item: listaItem){
            
                if(fornecedor.getNome().equals(item.getFornecedor())){ //If para ver quanto cada fornecedor forneceu.
                vet[i] = vet[i] + item.getQuantidade();//incrementando o contador de itens de cada fornecedor.
                }   
            } 
            i++;
        }
            i = 0;
         
        for(Fornecedor fornecedor: listaFornecedor){
            dataset.addValue(vet[i],  fornecedor.getNome(), "");
            i++;
        }
            return dataset;
    }
    
     public JFreeChart criarBarChart(CategoryDataset dataSet){
        
        JFreeChart graficoBarras = ChartFactory.createBarChart(
                "", 
                "Nome do fornecedor", 
                "Quantidade de itens fornecidos", 
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                false,
                false);
        return graficoBarras;
    }
      public ChartPanel criarGrafico(List<Fornecedor> listaFornecedor, List<Item> listaItem){
          
        CategoryDataset dataSet = this.criaDataset(listaFornecedor, listaItem);
        
        JFreeChart grafico = this.criarBarChart(dataSet);
        
        ChartPanel painelGrafico = new ChartPanel(grafico);
        
        
        painelGrafico.setPreferredSize(new Dimension(400,400));
        
        return painelGrafico;
    }
    
}
