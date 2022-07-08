/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.salmos.grafico.service;

import br.com.ifba.salmos.requisicao.model.Requisicao;
import br.com.ifba.salmos.setor.model.Setor;
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
public class GraficoSetores {
   
//Criando o Dataset
    public CategoryDataset criarDataSet(List<Requisicao> listaRequisicao, List<Setor> listaSetor){
       DefaultCategoryDataset dataset = new DefaultCategoryDataset();
           
           int vet[] =  new int [listaRequisicao.size()];
           int i = 0;
           
           for(Setor setor:listaSetor){
               for(Requisicao requisicao: listaRequisicao){
                   
                   if(setor.getNome().equals(requisicao.getSetor())){
                       vet[i]++;
                   }
               }//for menor
               i++;
            }//for maior
           
                i=0;
           for(Setor setor: listaSetor){
               dataset.addValue(vet[i], setor.getNome(), "");
               i++;
           }
           return dataset;
    }
    //Criando O Grafico de Barras
    
    public JFreeChart criarBarChart(CategoryDataset dataSet){
        
        JFreeChart graficoBarras = ChartFactory.createBarChart(
                "", 
                "Nome Do Setor", 
                "Quantidade de Requisicoes", 
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                true,
                true);
        return graficoBarras;
    }
    
     //Criar grafico completo, recebe o arraylist do objeto e repassa para o metodo de dataset
    
    public ChartPanel criarGrafico(Collection<Requisicao> listaRequisicao,List<Setor> listaSetor){
        CategoryDataset dataSet = this.criarDataSet((List<Requisicao>) listaRequisicao, listaSetor);
        
        JFreeChart grafico = this.criarBarChart(dataSet);
        
        ChartPanel painelGrafico = new ChartPanel(grafico);
        
        //setando propriedados do grafico
        painelGrafico.setPreferredSize(new Dimension(400,400));
        
        return painelGrafico;
    }
    

}
