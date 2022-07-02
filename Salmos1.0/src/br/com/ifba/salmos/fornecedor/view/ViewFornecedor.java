/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.salmos.fornecedor.view;

import br.com.ifba.salmos.fornecedor.model.Fornecedor;
import br.com.ifba.salmos.homescreen.view.homescreen;
import br.com.ifba.salmos.infrastructure.service.FacadeInstance;
import br.com.ifba.salmos.usuario.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vitor
 */
public class ViewFornecedor extends javax.swing.JFrame {
    DefaultTableModel tableModel;
    int selectedIndex = -1;
    Fornecedor fornecedor;
    List<Fornecedor> listFornecedor;

    Usuario usuarioLogado;
    
    /**
     * Creates new form ViewFornecedor
     */
    public ViewFornecedor() {
        initComponents();
        setLocationRelativeTo(null);
        
        this.listFornecedor = FacadeInstance.getInstance().getAllFornecedor();
        this.updateTable(this.listFornecedor);
    }
    
    public ViewFornecedor(Usuario user) {
        initComponents();
        setLocationRelativeTo(null);
        this.usuarioLogado = user;
        
        this.listFornecedor = FacadeInstance.getInstance().getAllFornecedor();
        this.updateTable(this.listFornecedor);
    }
    
    private void updateTable(List<Fornecedor> fornecedorList) {
        this.tableModel = new DefaultTableModel(null,
                new String[] { "Id", "Nome", "Email", "Telefone" });

        for (Fornecedor set : fornecedorList) {
            tableModel.addRow(new Object[] { set.getId(), set.getNome(), set.getEmail(), set.getTelefone()});
        }

        this.tblFronecedor.setModel(this.tableModel);
    }
    
    private List<Fornecedor> buscaFornecedores(String nome) {
        if(nome == null || nome.equals("")){
            return FacadeInstance.getInstance().getAllFornecedor();
        } 
        List<Fornecedor> search = new ArrayList<>();
        
        for (Fornecedor sett : this.listFornecedor) {
            if (sett.getNome().toLowerCase().contains(nome.toLowerCase()) ||
                    nome.toLowerCase().contains(sett.getNome().toLowerCase()))
                search.add(sett);
        }
        return search;
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        btnHomescreen = new javax.swing.JButton();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFronecedor = new javax.swing.JTable();
        lblNomeEdit = new javax.swing.JLabel();
        txtNomeEdit = new javax.swing.JTextField();
        btnSalvarEdit = new javax.swing.JButton();
        btnExcluirEdit = new javax.swing.JButton();
        btnCancelarEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscaFornecedor = new javax.swing.JTextField();
        lblEmail1 = new javax.swing.JLabel();
        txtEmailEdit = new javax.swing.JTextField();
        lblTelefone1 = new javax.swing.JLabel();
        txtTelefoneEdit = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblEmail.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(232, 189, 72));
        lblEmail.setText("Email");

        txtNome.setBackground(new java.awt.Color(253, 255, 175));
        txtNome.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 11)); // NOI18N
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

        txtEmail.setBackground(new java.awt.Color(253, 255, 175));
        txtEmail.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 11)); // NOI18N
        txtEmail.setBorder(null);
        txtEmail.setSelectionColor(new java.awt.Color(250, 206, 86));

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

        lblTelefone.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(232, 189, 72));
        lblTelefone.setText("Telefone");

        txtTelefone.setBackground(new java.awt.Color(253, 255, 175));
        txtTelefone.setBorder(null);
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnHomescreen, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(154, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEmail)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNome)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelefone)
                .addGap(7, 7, 7)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnHomescreen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmail, txtTelefone});

        jTabbedPane1.addTab("Cadastro", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblFronecedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblFronecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblFronecedor.setRowHeight(30);
        tblFronecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFronecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFronecedor);

        lblNomeEdit.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblNomeEdit.setForeground(new java.awt.Color(232, 189, 72));
        lblNomeEdit.setText("Nome");

        txtNomeEdit.setBackground(new java.awt.Color(253, 255, 175));
        txtNomeEdit.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        txtNomeEdit.setBorder(null);
        txtNomeEdit.setEnabled(false);
        txtNomeEdit.setSelectionColor(new java.awt.Color(250, 206, 86));
        txtNomeEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeEditKeyPressed(evt);
            }
        });

        btnSalvarEdit.setBackground(new java.awt.Color(232, 189, 72));
        btnSalvarEdit.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnSalvarEdit.setForeground(new java.awt.Color(253, 255, 175));
        btnSalvarEdit.setText("Salvar");
        btnSalvarEdit.setBorder(null);
        btnSalvarEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarEdit.setEnabled(false);
        btnSalvarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEditActionPerformed(evt);
            }
        });

        btnExcluirEdit.setBackground(new java.awt.Color(232, 189, 72));
        btnExcluirEdit.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnExcluirEdit.setForeground(new java.awt.Color(253, 255, 175));
        btnExcluirEdit.setText("Excluir");
        btnExcluirEdit.setBorder(null);
        btnExcluirEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirEdit.setEnabled(false);
        btnExcluirEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEditActionPerformed(evt);
            }
        });

        btnCancelarEdit.setBackground(new java.awt.Color(232, 189, 72));
        btnCancelarEdit.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        btnCancelarEdit.setForeground(new java.awt.Color(253, 255, 175));
        btnCancelarEdit.setText("Cancelar");
        btnCancelarEdit.setBorder(null);
        btnCancelarEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarEdit.setEnabled(false);
        btnCancelarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel1.setText("Procure pelo nome: ");

        txtBuscaFornecedor.setBackground(new java.awt.Color(253, 255, 175));
        txtBuscaFornecedor.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        txtBuscaFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaFornecedorKeyReleased(evt);
            }
        });

        lblEmail1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblEmail1.setForeground(new java.awt.Color(232, 189, 72));
        lblEmail1.setText("Email");

        txtEmailEdit.setBackground(new java.awt.Color(253, 255, 175));
        txtEmailEdit.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 11)); // NOI18N
        txtEmailEdit.setBorder(null);
        txtEmailEdit.setSelectionColor(new java.awt.Color(250, 206, 86));

        lblTelefone1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        lblTelefone1.setForeground(new java.awt.Color(232, 189, 72));
        lblTelefone1.setText("Telefone");

        txtTelefoneEdit.setBackground(new java.awt.Color(253, 255, 175));
        txtTelefoneEdit.setBorder(null);
        try {
            txtTelefoneEdit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneEdit.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnCancelarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 26, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtEmailEdit, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEmail1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNomeEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                        .addComponent(lblTelefone1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefoneEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblNomeEdit))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscaFornecedor))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(lblNomeEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefone1)
                        .addGap(7, 7, 7)
                        .addComponent(txtTelefoneEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtEmailEdit, txtTelefoneEdit});

        jTabbedPane1.addTab("Editar", jPanel2);

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fornecedor");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1)
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Fornecedor forn = new Fornecedor();
        forn.setNome(txtNome.getText());
        forn.setEmail(txtEmail.getText());
        forn.setTelefone(txtTelefone.getText());
        
        forn = FacadeInstance.getInstance().saveFornecedor(forn);
        if(forn != null){
            this.listFornecedor.add(forn);

            this.listFornecedor = FacadeInstance.getInstance().getAllFornecedor();
            this.updateTable(this.listFornecedor);
            
            JOptionPane.showMessageDialog(null, "Fornecedor " + forn.getNome() + " salvo com sucesso!", "Sucesso!",
                    JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Erro, ao salvar o Fornecedor!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        
        btnCancelar.doClick();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNome.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnHomescreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomescreenActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        homescreen retornar = new homescreen();
        retornar.setVisible(true);
    }//GEN-LAST:event_btnHomescreenActionPerformed

    private void tblFronecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFronecedorMouseClicked
        this.selectedIndex = this.tblFronecedor.getSelectedRow();
        // Setar os componentes de edição
        if (this.selectedIndex >= 0) {
            this.fornecedor = this.listFornecedor.get(this.selectedIndex);
        }

        if (this.fornecedor != null) {
            txtNomeEdit.setText(this.fornecedor.getNome());
            txtEmailEdit.setText(this.fornecedor.getEmail());
            txtTelefoneEdit.setText(this.fornecedor.getTelefone());
            
            txtNomeEdit.setEnabled(true);
            txtEmailEdit.setEnabled(true);
            txtTelefoneEdit.setEnabled(true);
            
            btnCancelarEdit.setEnabled(true);
            btnExcluirEdit.setEnabled(true);
            btnSalvarEdit.setEnabled(true);
        } else {
            btnCancelarEdit.doClick();
        }
    }//GEN-LAST:event_tblFronecedorMouseClicked

    private void txtNomeEditKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeEditKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEditKeyPressed

    private void btnSalvarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEditActionPerformed
        if (this.fornecedor.getId() != null) {
            this.fornecedor.setEmail(txtEmailEdit.getText());
            this.fornecedor.setNome(txtNomeEdit.getText());
            this.fornecedor.setTelefone(txtTelefoneEdit.getText());

            FacadeInstance.getInstance().updateFornecedor(this.fornecedor);

            this.listFornecedor = FacadeInstance.getInstance().getAllFornecedor();
            this.updateTable(this.listFornecedor);

            btnCancelarEdit.doClick();
        }
    }//GEN-LAST:event_btnSalvarEditActionPerformed

    private void btnExcluirEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEditActionPerformed
        if (this.fornecedor != null) {
            int dialogResult = JOptionPane.showConfirmDialog(null,
                    "Deseja excluir o fornecedor " + this.fornecedor.getNome() + "?", "Confirme!",
                    JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                FacadeInstance.getInstance().deleteFornecedor(this.fornecedor);

                this.listFornecedor = FacadeInstance.getInstance().getAllFornecedor();
                this.updateTable(this.listFornecedor);

                btnCancelarEdit.doClick();
            }
        }
    }//GEN-LAST:event_btnExcluirEditActionPerformed

    private void btnCancelarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditActionPerformed
        txtEmailEdit.setText("");
        txtTelefoneEdit.setText("");
        txtNomeEdit.setText("");

        txtNomeEdit.setEnabled(false);
        txtEmailEdit.setEnabled(false);
        txtTelefoneEdit.setEnabled(false);
        btnCancelarEdit.setEnabled(false);
        btnExcluirEdit.setEnabled(false);
        btnSalvarEdit.setEnabled(false);

        this.fornecedor = null;
    }//GEN-LAST:event_btnCancelarEditActionPerformed

    private void txtBuscaFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaFornecedorKeyReleased
        String nome = txtBuscaFornecedor.getText().toLowerCase();
        this.listFornecedor = buscaFornecedores(nome);
        updateTable(listFornecedor);
    }//GEN-LAST:event_txtBuscaFornecedorKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarEdit;
    private javax.swing.JButton btnExcluirEdit;
    private javax.swing.JButton btnHomescreen;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeEdit;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTelefone1;
    private javax.swing.JTable tblFronecedor;
    private javax.swing.JTextField txtBuscaFornecedor;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailEdit;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeEdit;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JFormattedTextField txtTelefoneEdit;
    // End of variables declaration//GEN-END:variables
}
