/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.salmos.tiposdeusuarios.view;

import br.com.ifba.salmos.homescreen.view.homescreen;
import br.com.ifba.salmos.infrastructure.service.FacadeInstance;
import br.com.ifba.salmos.infrastructure.support.StringUtil;
import br.com.ifba.salmos.setor.model.Setor;
import br.com.ifba.salmos.tiposdeusuarios.model.TipoDeUsuario;
import br.com.ifba.salmos.usuario.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Igor Lopes e Eduarda
 */
public class ViewTipoDeUsuario extends javax.swing.JFrame {

    DefaultTableModel listaTabela;
    List<TipoDeUsuario> lista;
    int selecionado;

    TipoDeUsuario tipodeusuario;
    Usuario usuario;

    Usuario usuarioLogado;

    /**
     * Creates new form TipoDeUsuario
     */
    public ViewTipoDeUsuario(Usuario user) {
        initComponents();
        setLocationRelativeTo(null);
        this.usuarioLogado = user;
        this.lista = FacadeInstance.getInstance().getAllTipoDeUsuarios();
        atualizarTabela(this.lista);
    }

    public ViewTipoDeUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        this.lista = FacadeInstance.getInstance().getAllTipoDeUsuarios();
        atualizarTabela(this.lista);
    }

    private void atualizarTabela(List<TipoDeUsuario> listaUsuario) {
        this.listaTabela = new DefaultTableModel(null, new String[] { "ID", "Nome", "Descrição" });

        for (TipoDeUsuario tipUsu : listaUsuario) {
            listaTabela.addRow(new Object[] { tipUsu.getId(), tipUsu.getNome(), tipUsu.getDescricao() });
        }

        this.tblTipoDeUsuario.setModel(this.listaTabela);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        txtNomeAdd = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtDescriçãoAdd = new javax.swing.JTextField();
        btnHomescreen = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTipoDeUsuario = new javax.swing.JTable();
        lblNomeEdit = new javax.swing.JLabel();
        txtNomeEdit = new javax.swing.JTextField();
        lblDescricaoEdit = new javax.swing.JLabel();
        btnSalvarEdit = new javax.swing.JButton();
        btnExcluirEdit = new javax.swing.JButton();
        btnCancelarEdit = new javax.swing.JButton();
        txtDescricaoEdit = new javax.swing.JTextField();
        lblBuscaTipoDeUsuario = new javax.swing.JLabel();
        txtBuscaTipoDeUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Tipo De Usuário");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        lblDescricao.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(232, 189, 72));
        lblDescricao.setText("Descrição");

        txtNomeAdd.setBackground(new java.awt.Color(253, 255, 175));
        txtNomeAdd.setBorder(null);
        txtNomeAdd.setSelectionColor(new java.awt.Color(250, 206, 86));
        txtNomeAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeAddKeyPressed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(232, 189, 72));
        lblNome.setText("Nome");

        btnSalvar.setBackground(new java.awt.Color(232, 189, 72));
        btnSalvar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(253, 255, 175));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(232, 189, 72));
        btnCancelar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(253, 255, 175));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtDescriçãoAdd.setBackground(new java.awt.Color(253, 255, 175));
        txtDescriçãoAdd.setBorder(null);
        txtDescriçãoAdd.setSelectionColor(new java.awt.Color(250, 206, 86));

        btnHomescreen.setBackground(new java.awt.Color(232, 189, 72));
        btnHomescreen.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnHomescreen.setForeground(new java.awt.Color(253, 255, 175));
        btnHomescreen.setText("Homescreen");
        btnHomescreen.setBorder(null);
        btnHomescreen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHomescreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomescreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(txtNomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome)
                            .addComponent(txtDescriçãoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnHomescreen, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescriçãoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(90, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHomescreen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        jTabbedPane1.addTab("Cadastro", jPanel3);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        tblTipoDeUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblTipoDeUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTipoDeUsuario.setRowHeight(30);
        tblTipoDeUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTipoDeUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTipoDeUsuario);

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

        lblBuscaTipoDeUsuario.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        lblBuscaTipoDeUsuario.setForeground(new java.awt.Color(253, 255, 175));
        lblBuscaTipoDeUsuario.setText("Busque pelo nome:");

        txtBuscaTipoDeUsuario.setBackground(new java.awt.Color(253, 255, 175));
        txtBuscaTipoDeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaTipoDeUsuarioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeEdit)
                                    .addComponent(txtNomeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnCancelarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnExcluirEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSalvarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblDescricaoEdit)
                            .addComponent(txtDescricaoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtBuscaTipoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBuscaTipoDeUsuario)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNomeEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(lblDescricaoEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricaoEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addComponent(lblBuscaTipoDeUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaTipoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar", jPanel2);

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tipo de usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jTabbedPane1)
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeAddKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAddKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        TipoDeUsuario tipodeusuarioAdd = new TipoDeUsuario();
        
        List<TipoDeUsuario> listaNome = FacadeInstance.getInstance().getAllTipoDeUsuarios();
        int i;
        
        if (validaCampos() == true) {
            tipodeusuarioAdd.setNome(txtNomeAdd.getText());
            tipodeusuarioAdd.setDescricao(txtDescriçãoAdd.getText());
            
            for(i = 0; i < listaNome.size(); i++){
                if(tipodeusuarioAdd.getNome().equals(listaNome.get(i).getNome())){
                    JOptionPane.showMessageDialog(null, "Nome do usuário já cadastrado", "Atenção", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            
            FacadeInstance.getInstance().saveTipoDeUsuario(tipodeusuarioAdd);
            this.lista = FacadeInstance.getInstance().getAllTipoDeUsuarios();
            this.atualizarTabela(this.lista);
            JOptionPane.showMessageDialog(null, "Tipo De Usuário Cadastrado!!!");
            txtNomeAdd.setText("");
            txtDescriçãoAdd.setText("");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNomeAdd.setText("");
        txtDescriçãoAdd.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblTipoDeUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTipoDeUsuarioMouseClicked
        this.selecionado = this.tblTipoDeUsuario.getSelectedRow();
        if (this.selecionado != -1) {
            this.tipodeusuario = this.lista.get(this.selecionado);
            if (this.tipodeusuario != null) {
                txtNomeEdit.setText(this.tipodeusuario.getNome());
                txtDescricaoEdit.setText(this.tipodeusuario.getDescricao());
                txtNomeEdit.setEnabled(true);
                txtDescricaoEdit.setEnabled(true);
                btnCancelarEdit.setEnabled(true);
                btnExcluirEdit.setEnabled(true);
                btnSalvarEdit.setEnabled(true);
            } else {
                btnCancelarEdit.doClick();
            }
        }
    }//GEN-LAST:event_tblTipoDeUsuarioMouseClicked

    private void txtNomeEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeEditKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEditKeyPressed

    private void btnSalvarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEditActionPerformed
        this.selecionado = this.tblTipoDeUsuario.getSelectedRow();

        if (this.selecionado != -1) {

            String nome = txtNomeEdit.getText();
            String descricao = txtDescricaoEdit.getText();

            List<Usuario> listaUsuario = FacadeInstance.getInstance().getAllUsuarios();

            for (Usuario usu : listaUsuario) {
                if (usu.getTipodeusuario().equals(tipodeusuario.getNome())) {

                    usu.setNome(usu.getNome());
                    usu.setEmail(usu.getEmail());
                    usu.setSenha(usu.getSenha());
                    usu.setLogin(usu.getLogin());
                    usu.setTipodeusuario(nome);

                    FacadeInstance.getInstance().updateUsuario(usu);
                }
            }

            if (nome.isEmpty() || descricao.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente! Tente novamente.");// msg de
                                                                                                               // campos
                                                                                                               // faltantes
            } else {
                tipodeusuario.setNome(nome);
                tipodeusuario.setDescricao(descricao);
                FacadeInstance.getInstance().updateTipoDeUsuario(tipodeusuario);
                this.atualizarTabela(this.lista);
                JOptionPane.showMessageDialog(null, "Tipo De Usuário Editado!!!");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione corretamente o tipo de usuario para ser alterado!!",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        btnCancelarEdit.doClick();
    }//GEN-LAST:event_btnSalvarEditActionPerformed

    private void btnExcluirEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEditActionPerformed
        List<Usuario> listaUsuario = FacadeInstance.getInstance().getAllUsuarios();

        for (Usuario usu : listaUsuario) {
            if (usu.getTipodeusuario().equals(tipodeusuario.getNome())) {
                FacadeInstance.getInstance().deleteUsuario(usu);
            }
        }

        FacadeInstance.getInstance().deleteTipoDeUsuario(tipodeusuario);
        this.lista = FacadeInstance.getInstance().getAllTipoDeUsuarios();
        this.atualizarTabela(this.lista);
        JOptionPane.showMessageDialog(null, "Usuario Excluído", "Atenção", JOptionPane.WARNING_MESSAGE);
        this.selecionado = -1;
    }//GEN-LAST:event_btnExcluirEditActionPerformed

    private void btnCancelarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditActionPerformed
        txtDescricaoEdit.setText("");
        txtNomeEdit.setText("");

        txtNomeEdit.setEnabled(false);
        txtDescricaoEdit.setEnabled(false);
        btnCancelarEdit.setEnabled(false);
        btnExcluirEdit.setEnabled(false);
        btnSalvarEdit.setEnabled(false);

        this.tipodeusuario = null;
    }//GEN-LAST:event_btnCancelarEditActionPerformed
    private List<TipoDeUsuario> buscaTipoDeUsuario(String nome) {
        if(nome == null || nome.equals("")){
            return FacadeInstance.getInstance().getAllTipoDeUsuarios();
        } 
        List<TipoDeUsuario> search = new ArrayList<>();
        
        for (TipoDeUsuario tipousu : this.lista) {
            if (tipousu.getNome().toLowerCase().contains(nome.toLowerCase()) ||
                    nome.toLowerCase().contains(tipousu.getDescricao().toLowerCase()))
                search.add(tipousu);
        }
        return search;
    }
    private void txtDescricaoEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoEditKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoEditKeyPressed

    private void btnHomescreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomescreenActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        homescreen retornar = new homescreen();
        retornar.setVisible(true);
    }//GEN-LAST:event_btnHomescreenActionPerformed

    private void txtBuscaTipoDeUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaTipoDeUsuarioKeyReleased
        // TODO add your handling code here:
        String nome = txtBuscaTipoDeUsuario.getText().toLowerCase();
        this.lista = buscaTipoDeUsuario(nome);
        atualizarTabela(lista);
    }//GEN-LAST:event_txtBuscaTipoDeUsuarioKeyReleased

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRemoverActionPerformed
        
    }// GEN-LAST:event_btnRemoverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEditarActionPerformed
        
    }// GEN-LAST:event_btnEditarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnListarActionPerformed
        this.lista = FacadeInstance.getInstance().getAllTipoDeUsuarios();
        this.atualizarTabela(this.lista);
    }// GEN-LAST:event_btnListarActionPerformed

    private void btnAdicionarAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAdicionarAddActionPerformed
        TipoDeUsuario tipodeusuarioAdd = new TipoDeUsuario();
        if (validaCampos() == true) {
            tipodeusuarioAdd.setNome(txtNomeAdd.getText());
            tipodeusuarioAdd.setDescricao(txtDescriçãoAdd.getText());
            FacadeInstance.getInstance().saveTipoDeUsuario(tipodeusuarioAdd);
            this.lista = FacadeInstance.getInstance().getAllTipoDeUsuarios();
            this.atualizarTabela(this.lista);
            JOptionPane.showMessageDialog(null, "Tipo De Usuário Cadastrado!!!");
            txtNomeAdd.setText(" ");
            txtDescriçãoAdd.setText(" ");
        }

    }// GEN-LAST:event_btnAdicionarAddActionPerformed

    private void txtDescriçãoAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDescriçãoAddActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtDescriçãoAddActionPerformed

    private void btnHomescreenTipoUsuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnHomescreenTipoUsuActionPerformed
        homescreen home = new homescreen();
        home.setVisible(true);

        this.setVisible(false);
    }// GEN-LAST:event_btnHomescreenTipoUsuActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewTipoDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTipoDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTipoDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTipoDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTipoDeUsuario().setVisible(true);
            }
        });
    }

    private boolean validaCampos() {
        StringUtil util = StringUtil.getInstance();
        if (txtNomeAdd.getText().equals("") && txtDescriçãoAdd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.", "CAMPOS OBRIGATÓRIOS",
                    JOptionPane.ERROR_MESSAGE);
            return false;

        } else if (util.isNullOrEmpty(txtNomeAdd.getText())) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome.", "CAMPOS OBRIGATÓRIOS",
                    JOptionPane.WARNING_MESSAGE);
            return false;

        } else if (util.isNullOrEmpty(txtDescriçãoAdd.getText())) {
            JOptionPane.showMessageDialog(null, "Preencha o campo Descrição", "CAMPOS OBRIGATÓRIOS",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarEdit;
    private javax.swing.JButton btnExcluirEdit;
    private javax.swing.JButton btnHomescreen;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarEdit;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblBuscaTipoDeUsuario;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDescricaoEdit;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeEdit;
    private javax.swing.JTable tblTipoDeUsuario;
    private javax.swing.JTextField txtBuscaTipoDeUsuario;
    private javax.swing.JTextField txtDescricaoEdit;
    private javax.swing.JTextField txtDescriçãoAdd;
    private javax.swing.JTextField txtNomeAdd;
    private javax.swing.JTextField txtNomeEdit;
    // End of variables declaration//GEN-END:variables
}
