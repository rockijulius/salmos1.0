/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.grafico.service;

import br.com.ifba.salmos.requisicao.model.Requisicao;
import java.awt.Dimension;
import java.util.Collection;
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
public class GraficoRequisicoes extends Requisicao{
//Criando o Dataset
    public CategoryDataset criarDataSet(Collection<Requisicao> listaDeRequisicoes){
       
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset ();
        
        for(Requisicao requisicao : listaDeRequisicoes){
            dataSet.addValue(requisicao.getListaItens().size(),requisicao.getSetor(),requisicao.getId());
        }
        return dataSet;
    }
    
    //Criando O Grafico de Barras
    
    public JFreeChart criarBarChart(CategoryDataset dataSet){
        
        JFreeChart graficoBarras = ChartFactory.createBarChart(
                "Requisições Realizadas", 
                "Id Da Requisição", 
                "Quantidade de itens Requisitados", 
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                true,
                true);
        return graficoBarras;
    }
    
     //Criar grafico completo, recebe o arraylist do objeto e repassa para o metodo de dataset
    
    public ChartPanel criarGrafico(Collection<Requisicao> listaDeRequisicoes){
        CategoryDataset dataSet = this.criarDataSet(listaDeRequisicoes);
        
        JFreeChart grafico = this.criarBarChart(dataSet);
        
        ChartPanel painelGrafico = new ChartPanel(grafico);
        
        //setando propriedados do grafico
        painelGrafico.setPreferredSize(new Dimension(400,400));
        
        return painelGrafico;
    }
    

}
    
