/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.salmos.setor.dao;

import br.com.ifba.salmos.infrastructure.dao.IBaseDAO;
import br.com.ifba.salmos.setor.model.Setor;
import java.util.List;

/**
 *
 * @author Everton de Tarcísio
 */
public interface IDaoSetor extends IBaseDAO<Setor>{
   public abstract List<Setor> findByName(String name);
}
