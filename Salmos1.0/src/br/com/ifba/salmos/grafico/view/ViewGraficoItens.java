/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.salmos.grafico.view;

import br.com.ifba.salmos.grafico.service.GraficoItems;
import br.com.ifba.salmos.grafico.service.GraficoRequisicoes;
import br.com.ifba.salmos.homescreen.view.homescreen;
import br.com.ifba.salmos.infrastructure.service.FacadeInstance;
import br.com.ifba.salmos.item.model.Item;
import br.com.ifba.salmos.requisicao.model.Requisicao;
import br.com.ifba.salmos.usuario.model.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;


/**
 *
 * @author Felipe
 */
public class ViewGraficoItens extends javax.swing.JFrame {

   
    /**
     * Creates new form ViewGraficoItens
     */
    List<Item> itemLista;
    List<Requisicao> requisicaoLista;
    Usuario usuarioLogado;
    public ViewGraficoItens(Usuario user) {
        initComponents();
        setLocationRelativeTo(null);
        this.usuarioLogado = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblGraficoItens = new javax.swing.JLabel();
        jpnGrafico = new javax.swing.JPanel();
        btnGerarGrafico = new javax.swing.JButton();
        btnHomescreen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGerarGraficoRequisicoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblGraficoItens.setBackground(new java.awt.Color(0, 0, 0));
        lblGraficoItens.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        lblGraficoItens.setText("Gráfico");

        javax.swing.GroupLayout jpnGraficoLayout = new javax.swing.GroupLayout(jpnGrafico);
        jpnGrafico.setLayout(jpnGraficoLayout);
        jpnGraficoLayout.setHorizontalGroup(
            jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );
        jpnGraficoLayout.setVerticalGroup(
            jpnGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        btnGerarGrafico.setBackground(new java.awt.Color(232, 189, 72));
        btnGerarGrafico.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnGerarGrafico.setForeground(new java.awt.Color(253, 255, 175));
        btnGerarGrafico.setText("Itens");
        btnGerarGrafico.setBorder(null);
        btnGerarGrafico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerarGrafico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGerarGraficoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGerarGraficoMouseExited(evt);
            }
        });
        btnGerarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarGraficoActionPerformed(evt);
            }
        });

        btnHomescreen.setBackground(new java.awt.Color(232, 189, 72));
        btnHomescreen.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnHomescreen.setForeground(new java.awt.Color(253, 255, 175));
        btnHomescreen.setText("Homescreen");
        btnHomescreen.setBorder(null);
        btnHomescreen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHomescreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomescreenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomescreenMouseExited(evt);
            }
        });
        btnHomescreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomescreenActionPerformed(evt);
            }
        });

        btnGerarGraficoRequisicoes.setBackground(new java.awt.Color(232, 189, 72));
        btnGerarGraficoRequisicoes.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        btnGerarGraficoRequisicoes.setForeground(new java.awt.Color(253, 255, 175));
        btnGerarGraficoRequisicoes.setText("Requisições");
        btnGerarGraficoRequisicoes.setBorder(null);
        btnGerarGraficoRequisicoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerarGraficoRequisicoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGerarGraficoRequisicoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGerarGraficoRequisicoesMouseExited(evt);
            }
        });
        btnGerarGraficoRequisicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarGraficoRequisicoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGraficoItens)
                .addGap(195, 195, 195))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGerarGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHomescreen, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerarGraficoRequisicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jpnGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGraficoItens)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btnGerarGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGerarGraficoRequisicoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHomescreen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarGraficoActionPerformed
        // TODO add your handling code here:
        this.itemLista = FacadeInstance.getInstance().getAllItem();
        
        GraficoItems graficoItems = new GraficoItems();
        
//IMPORTANTE
        this.jpnGrafico.setLayout(new BorderLayout());
        this.jpnGrafico.add(graficoItems.criarGrafico(itemLista));
        
        pack();
        
    }//GEN-LAST:event_btnGerarGraficoActionPerformed

    private void btnHomescreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomescreenActionPerformed
        // TODO add your handling code here:
        homescreen home = new homescreen(usuarioLogado);
        home.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnHomescreenActionPerformed

    private void btnGerarGraficoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerarGraficoMouseEntered
        // TODO add your handling code here:
        btnGerarGrafico.setContentAreaFilled(false);
        btnGerarGrafico.setOpaque(true);
        btnGerarGrafico.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnGerarGraficoMouseEntered

    private void btnGerarGraficoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerarGraficoMouseExited
        // TODO add your handling code here:
        Color color = btnHomescreen.getBackground();
        btnGerarGrafico.setContentAreaFilled(false);
        btnGerarGrafico.setOpaque(true);
        btnGerarGrafico.setBackground(color);
    }//GEN-LAST:event_btnGerarGraficoMouseExited

    private void btnHomescreenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomescreenMouseEntered
        // TODO add your handling code here:
        btnHomescreen.setContentAreaFilled(false);
        btnHomescreen.setOpaque(true);
        btnHomescreen.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnHomescreenMouseEntered

    private void btnHomescreenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomescreenMouseExited
        // TODO add your handling code here:
        Color color = btnGerarGrafico.getBackground();
        btnHomescreen.setContentAreaFilled(false);
        btnHomescreen.setOpaque(true);
        btnHomescreen.setBackground(color);
    }//GEN-LAST:event_btnHomescreenMouseExited

    private void btnGerarGraficoRequisicoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerarGraficoRequisicoesMouseEntered
        // TODO add your handling code here:
        btnGerarGraficoRequisicoes.setContentAreaFilled(false);
        btnGerarGraficoRequisicoes.setOpaque(true);
        btnGerarGraficoRequisicoes.setBackground(Color.ORANGE);
    }//GEN-LAST:event_btnGerarGraficoRequisicoesMouseEntered

    private void btnGerarGraficoRequisicoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerarGraficoRequisicoesMouseExited
        // TODO add your handling code here:
        Color color = btnHomescreen.getBackground();
        btnGerarGraficoRequisicoes.setContentAreaFilled(false);
        btnGerarGraficoRequisicoes.setOpaque(true);
        btnGerarGraficoRequisicoes.setBackground(color);
    }//GEN-LAST:event_btnGerarGraficoRequisicoesMouseExited

    private void btnGerarGraficoRequisicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarGraficoRequisicoesActionPerformed
          // TODO add your handling code here:
        this.requisicaoLista = FacadeInstance.getInstance().getAllRequisicao();
        
        GraficoRequisicoes graficoRequisicoes = new GraficoRequisicoes();
        
//IMPORTANTE
        this.jpnGrafico.setLayout(new BorderLayout());
        this.jpnGrafico.add(graficoRequisicoes.criarGrafico(requisicaoLista));
        
        pack();
        
    }//GEN-LAST:event_btnGerarGraficoRequisicoesActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewGraficoItens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewGraficoItens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewGraficoItens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewGraficoItens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ViewGraficoItens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarGrafico;
    private javax.swing.JButton btnGerarGraficoRequisicoes;
    private javax.swing.JButton btnHomescreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnGrafico;
    private javax.swing.JLabel lblGraficoItens;
    // End of variables declaration//GEN-END:variables
}
