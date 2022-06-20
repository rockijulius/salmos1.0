/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.grafico.service;


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
 *
 * @author Felipe
 */
public class GraficoItems {
    
    //Criando o Dataset
    public CategoryDataset criarDataSet(List<Item> listaDeItems){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset ();
        
        for(Item item : listaDeItems){
            dataSet.addValue(item.getQuantidade(), item.getNome(),"");
        }
        return dataSet;
    }
    
    //Criando O Grafico de Barras
    
    public JFreeChart criarBarChart(CategoryDataset dataSet){
        
        JFreeChart graficoBarras = ChartFactory.createBarChart(
                "  Nome Dos Itens", 
                "", 
                "Quantidade", 
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                false,
                false);
        return graficoBarras;
    }
    
     //Criar grafico completo, recebe o arraylist do objeto e repassa para o metodo de dataset
    
    public ChartPanel criarGrafico(List<Item> listaDeItems){
        CategoryDataset dataSet = this.criarDataSet(listaDeItems);
        
        JFreeChart grafico = this.criarBarChart(dataSet);
        
        ChartPanel painelGrafico = new ChartPanel(grafico);
        
        //setando propriedados do grafico
        painelGrafico.setPreferredSize(new Dimension(400,400));
        
        return painelGrafico;
    }
}
