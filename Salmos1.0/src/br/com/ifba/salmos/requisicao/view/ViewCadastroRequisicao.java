/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifba.salmos.requisicao.view;

import br.com.ifba.salmos.infrastructure.service.FacadeInstance;
import br.com.ifba.salmos.item.model.Item;
import br.com.ifba.salmos.setor.model.Setor;
import br.com.ifba.salmos.usuario.model.Usuario;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author rocki.julius
 */
public class ViewCadastroRequisicao extends javax.swing.JFrame {

    private Usuario usuarioLogado;
    private List<Setor> setores;
    private List<Item> itens;
    DefaultListModel itensDisponiveis = new DefaultListModel();
    
    /** Creates new form ViewCadastroRequisicao */
        
    public ViewCadastroRequisicao(Usuario usuarioLogado) {
        initComponents();
        
        this.usuarioLogado = usuarioLogado;
        iniciaComboBoxSetor();
        iniciaListaItens();
    }
    
    public ViewCadastroRequisicao() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnTelaRequisicoes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCmBoxSetor = new javax.swing.JComboBox<>();
        jLblUsuario = new javax.swing.JLabel();
        jBtnSalvarRequisicao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListItensDisponiveis = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jBtnAdicionaListaRequisicao = new javax.swing.JButton();
        jBtnRemoveListaRequisicao = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListItensRequisitados = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerQuantidadeItemSelecionado = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBtnTelaRequisicoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/salmos/image/voltar.png"))); // NOI18N
        jBtnTelaRequisicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTelaRequisicoesActionPerformed(evt);
            }
        });

        jLabel1.setText("Setor:");

        jLabel2.setText("Usuário requisitante:");

        jBtnSalvarRequisicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/salmos/image/salvar.png"))); // NOI18N

        jScrollPane1.setViewportView(jListItensDisponiveis);

        jLabel3.setText("Itens disponíveis:");

        jBtnAdicionaListaRequisicao.setText(">>>");

        jBtnRemoveListaRequisicao.setText("<<<");

        jScrollPane2.setViewportView(jListItensRequisitados);

        jLabel4.setText("Quantidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnTelaRequisicoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSalvarRequisicao))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerQuantidadeItemSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(413, 413, 413))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnAdicionaListaRequisicao)
                            .addComponent(jBtnRemoveListaRequisicao))
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jCmBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCmBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jSpinnerQuantidadeItemSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(jBtnAdicionaListaRequisicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnRemoveListaRequisicao))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnTelaRequisicoes)
                    .addComponent(jBtnSalvarRequisicao))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnTelaRequisicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTelaRequisicoesActionPerformed
        new ViewRequisicao(usuarioLogado).setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnTelaRequisicoesActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadastroRequisicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroRequisicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroRequisicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroRequisicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastroRequisicao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAdicionaListaRequisicao;
    private javax.swing.JButton jBtnRemoveListaRequisicao;
    private javax.swing.JButton jBtnSalvarRequisicao;
    private javax.swing.JButton jBtnTelaRequisicoes;
    private javax.swing.JComboBox<String> jCmBoxSetor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblUsuario;
    private javax.swing.JList<String> jListItensDisponiveis;
    private javax.swing.JList<String> jListItensRequisitados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerQuantidadeItemSelecionado;
    // End of variables declaration//GEN-END:variables

    
    private void iniciaComboBoxSetor(){
        setores = FacadeInstance.getInstance().getAllSetor();
        for(int x = 0; x < setores.size(); x++){
            jCmBoxSetor.addItem(setores.get(x).getNome());
        }
        
    }

    private void iniciaListaItens() {
        itens = FacadeInstance.getInstance().getAllItem();
        for(int x = 0; x < itens.size(); x++){
            itensDisponiveis.addElement(itens.get(x).getNome() + ", " + itens.get(x).getQuantidade());
        }
        
        jListItensDisponiveis.setModel(itensDisponiveis);
    }
}
