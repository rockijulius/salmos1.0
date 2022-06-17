/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.salmos.setor.view;

import br.com.ifba.salmos.infrastructure.service.FacadeInstance;
import br.com.ifba.salmos.setor.model.Setor;
import br.com.ifba.salmos.usuario.model.Usuario;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tarciiz
 */
public class SetorView extends javax.swing.JFrame {
    DefaultTableModel tableModel;
    int selectedIndex = -1;
    Setor setor;
    List<Setor> listSetor;

    Usuario usuarioLogado;

    /**
     * Creates new form SetorView
     */
    public SetorView() {
        initComponents();

        this.listSetor = FacadeInstance.getInstance().getAllSetor();
        this.updateTable(this.listSetor);
    }

    public SetorView(Usuario user) {
        initComponents();
        this.usuarioLogado = user;

        this.listSetor = FacadeInstance.getInstance().getAllSetor();
        this.updateTable(this.listSetor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtDescricao = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSetor = new javax.swing.JTable();
        lblNomeEdit = new javax.swing.JLabel();
        txtNomeEdit = new javax.swing.JTextField();
        lblDescricaoEdit = new javax.swing.JLabel();
        btnSalvarEdit = new javax.swing.JButton();
        btnExcluirEdit = new javax.swing.JButton();
        btnCancelarEdit = new javax.swing.JButton();
        txtDescricaoEdit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        lblDescricao.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(232, 189, 72));
        lblDescricao.setText("Descrição");

        txtNome.setBackground(new java.awt.Color(253, 255, 175));
        txtNome.setBorder(null);
        txtNome.setSelectionColor(new java.awt.Color(250, 206, 86));
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(232, 189, 72));
        lblNome.setText("Nome");

        btnSalvar.setBackground(new java.awt.Color(232, 189, 72));
        btnSalvar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(253, 255, 175));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(232, 189, 72));
        btnCancelar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(253, 255, 175));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtDescricao.setBackground(new java.awt.Color(253, 255, 175));
        txtDescricao.setBorder(null);
        txtDescricao.setSelectionColor(new java.awt.Color(250, 206, 86));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(161, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 77,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 65,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblDescricao)
                                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 251,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblNome)
                                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 251,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(154, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(62, Short.MAX_VALUE)
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(lblDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(50, Short.MAX_VALUE)));

        jTabbedPane1.addTab("Cadastro", jPanel3);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        tblSetor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblSetor.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {

                }));
        tblSetor.setRowHeight(30);
        tblSetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSetor);

        lblNomeEdit.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblNomeEdit.setForeground(new java.awt.Color(232, 189, 72));
        lblNomeEdit.setText("Nome");

        txtNomeEdit.setBackground(new java.awt.Color(253, 255, 175));
        txtNomeEdit.setBorder(null);
        txtNomeEdit.setEnabled(false);
        txtNomeEdit.setSelectionColor(new java.awt.Color(250, 206, 86));
        txtNomeEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeEditKeyPressed(evt);
            }
        });

        lblDescricaoEdit.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblDescricaoEdit.setForeground(new java.awt.Color(232, 189, 72));
        lblDescricaoEdit.setText("Descrição");

        btnSalvarEdit.setBackground(new java.awt.Color(232, 189, 72));
        btnSalvarEdit.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnSalvarEdit.setForeground(new java.awt.Color(253, 255, 175));
        btnSalvarEdit.setText("Salvar");
        btnSalvarEdit.setBorder(null);
        btnSalvarEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvarEdit.setEnabled(false);
        btnSalvarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEditActionPerformed(evt);
            }
        });

        btnExcluirEdit.setBackground(new java.awt.Color(232, 189, 72));
        btnExcluirEdit.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnExcluirEdit.setForeground(new java.awt.Color(253, 255, 175));
        btnExcluirEdit.setText("Excluir");
        btnExcluirEdit.setBorder(null);
        btnExcluirEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExcluirEdit.setEnabled(false);
        btnExcluirEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEditActionPerformed(evt);
            }
        });

        btnCancelarEdit.setBackground(new java.awt.Color(232, 189, 72));
        btnCancelarEdit.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnCancelarEdit.setForeground(new java.awt.Color(253, 255, 175));
        btnCancelarEdit.setText("Cancelar");
        btnCancelarEdit.setBorder(null);
        btnCancelarEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelarEdit.setEnabled(false);
        btnCancelarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditActionPerformed(evt);
            }
        });

        txtDescricaoEdit.setBackground(new java.awt.Color(253, 255, 175));
        txtDescricaoEdit.setBorder(null);
        txtDescricaoEdit.setEnabled(false);
        txtDescricaoEdit.setSelectionColor(new java.awt.Color(250, 206, 86));
        txtDescricaoEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoEditKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblNomeEdit)
                                                        .addComponent(txtNomeEdit,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 246,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblDescricaoEdit))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(btnCancelarEdit,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 77,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btnExcluirEdit,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 77,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btnSalvarEdit,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 77,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(txtDescricaoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 246,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(22, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 59, Short.MAX_VALUE)
                                                .addComponent(lblNomeEdit)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNomeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(lblDescricaoEdit)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDescricaoEdit, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnSalvarEdit,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnExcluirEdit,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnCancelarEdit,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 47, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                Short.MAX_VALUE))
                                .addContainerGap()));

        jTabbedPane1.addTab("Editar", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jTabbedPane1)
                                .addGap(100, 100, 100)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jTabbedPane1)
                                .addGap(75, 75, 75)));

        jTabbedPane1.getAccessibleContext().setAccessibleName("Yab");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtNomeKeyPressed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNomeKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarActionPerformed
        Setor set = new Setor();
        set.setDescrição(txtDescricao.getText());
        set.setNome(txtNome.getText());

        FacadeInstance.getInstance().saveSetor(set);
        if (set.getId() != null) {
            this.listSetor.add(set);
            this.updateTable(this.listSetor);

            JOptionPane.showMessageDialog(null, "Setor " + set.getNome() + " salvo com sucesso!", "Sucesso!",
                    JOptionPane.INFORMATION_MESSAGE);

            btnCancelar.doClick();
        } else {
            JOptionPane.showMessageDialog(null, "Erro, ao salvar o Setor!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }

    }// GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelarActionPerformed
        txtDescricao.setText("");
        txtNome.setText("");
    }// GEN-LAST:event_btnCancelarActionPerformed

    private void tblSetorMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblSetorMouseClicked
        this.selectedIndex = this.tblSetor.getSelectedRow();
        // Setar os componentes de edição
        if (this.selectedIndex >= 0) {
            this.setor = this.listSetor.get(this.selectedIndex);
        }

        if (this.setor != null) {
            txtNomeEdit.setText(this.setor.getNome());
            txtDescricaoEdit.setText(this.setor.getDescrição());
            txtNomeEdit.setEnabled(true);
            txtDescricaoEdit.setEnabled(true);
            btnCancelarEdit.setEnabled(true);
            btnExcluirEdit.setEnabled(true);
            btnSalvarEdit.setEnabled(true);
        } else {
            btnCancelarEdit.doClick();
        }
    }// GEN-LAST:event_tblSetorMouseClicked

    private void txtNomeEditKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtNomeEditKeyPressed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNomeEditKeyPressed

    private void txtDescricaoEditKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtDescricaoEditKeyPressed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtDescricaoEditKeyPressed

    private void btnSalvarEditActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarEditActionPerformed
        if (this.setor.getId() != null) {
            this.setor.setDescrição(txtDescricaoEdit.getText());
            this.setor.setNome(txtNomeEdit.getText());

            FacadeInstance.getInstance().updateSetor(this.setor);

            this.listSetor = FacadeInstance.getInstance().getAllSetor();
            this.updateTable(this.listSetor);

            btnCancelarEdit.doClick();
        }

    }// GEN-LAST:event_btnSalvarEditActionPerformed

    private void btnExcluirEditActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcluirEditActionPerformed
        if (this.setor != null) {
            int dialogResult = JOptionPane.showConfirmDialog(null,
                    "Deseja excluir o setor " + this.setor.getNome() + "?", "Confirme!",
                    JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                FacadeInstance.getInstance().deleteSetor(this.setor);

                this.listSetor = FacadeInstance.getInstance().getAllSetor();
                this.updateTable(this.listSetor);

                btnCancelarEdit.doClick();
            }
        }
    }// GEN-LAST:event_btnExcluirEditActionPerformed

    private void btnCancelarEditActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCancelarEditActionPerformed
        txtDescricaoEdit.setText("");
        txtNomeEdit.setText("");

        txtNomeEdit.setEnabled(false);
        txtDescricaoEdit.setEnabled(false);
        btnCancelarEdit.setEnabled(false);
        btnExcluirEdit.setEnabled(false);
        btnSalvarEdit.setEnabled(false);

        this.setor = null;

    }// GEN-LAST:event_btnCancelarEditActionPerformed

    private void updateTable(List<Setor> setorList) {
        this.tableModel = new DefaultTableModel(null,
                new String[] { "Id", "Nome", "Descrição" });

        for (Setor set : setorList) {
            tableModel.addRow(new Object[] { set.getId(), set.getNome(), set.getDescrição() });
        }

        this.tblSetor.setModel(this.tableModel);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SetorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarEdit;
    private javax.swing.JButton btnExcluirEdit;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarEdit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDescricaoEdit;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeEdit;
    private javax.swing.JTable tblSetor;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtDescricaoEdit;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeEdit;
    // End of variables declaration//GEN-END:variables
}
