/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.salmos.tiposdeusuarios.view;

import br.com.ifba.salmos.homescreem.view.homescreem;
import br.com.ifba.salmos.infrastructure.service.FacadeInstance;
import br.com.ifba.salmos.infrastructure.support.StringUtil;
import br.com.ifba.salmos.tiposdeusuarios.model.TipoDeUsuario;
import br.com.ifba.salmos.usuario.model.Usuario;
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
    /**
     * Creates new form TipoDeUsuario
     */
    public ViewTipoDeUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void atualizarTabela(List<TipoDeUsuario> listaUsuario){
        this.listaTabela = new DefaultTableModel(null, new String [] {"ID", "Nome", "Descrição"});
        
        for(TipoDeUsuario tipUsu: listaUsuario){
            listaTabela.addRow(new Object[]{tipUsu.getId(), tipUsu.getNome(), tipUsu.getDescricao()});
        }
        
        this.tblTipoDeUsuario.setModel(this.listaTabela);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTabbedPane1 = new javax.swing.JTabbedPane();
        panelAdd = new javax.swing.JPanel();
        lblNomeAdd = new javax.swing.JLabel();
        lblDescriçãoAdd = new javax.swing.JLabel();
        txtNomeAdd = new javax.swing.JTextField();
        txtDescriçãoAdd = new javax.swing.JTextField();
        btnAdicionarAdd = new javax.swing.JButton();
        btnHomescreenTipoUsu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelListar = new javax.swing.JPanel();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTipoDeUsuario = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Tipo De Usuário");

        JTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        JTabbedPane1.setForeground(new java.awt.Color(250, 206, 86));
        JTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTabbedPane1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));

        lblNomeAdd.setBackground(new java.awt.Color(250, 206, 86));
        lblNomeAdd.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        lblNomeAdd.setForeground(new java.awt.Color(250, 206, 86));
        lblNomeAdd.setText("Nome:");

        lblDescriçãoAdd.setBackground(new java.awt.Color(250, 206, 86));
        lblDescriçãoAdd.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        lblDescriçãoAdd.setForeground(new java.awt.Color(250, 206, 86));
        lblDescriçãoAdd.setText("Descrição:");

        txtNomeAdd.setBackground(new java.awt.Color(253, 255, 175));
        txtNomeAdd.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        txtNomeAdd.setBorder(null);
        txtNomeAdd.setSelectionColor(new java.awt.Color(253, 255, 175));

        txtDescriçãoAdd.setBackground(new java.awt.Color(253, 255, 175));
        txtDescriçãoAdd.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        txtDescriçãoAdd.setBorder(null);
        txtDescriçãoAdd.setSelectionColor(new java.awt.Color(253, 255, 175));
        txtDescriçãoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriçãoAddActionPerformed(evt);
            }
        });

        btnAdicionarAdd.setBackground(new java.awt.Color(250, 206, 86));
        btnAdicionarAdd.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnAdicionarAdd.setForeground(new java.awt.Color(253, 255, 175));
        btnAdicionarAdd.setText("Adicionar");
        btnAdicionarAdd.setBorder(null);
        btnAdicionarAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarAddActionPerformed(evt);
            }
        });

        btnHomescreenTipoUsu.setBackground(new java.awt.Color(250, 206, 86));
        btnHomescreenTipoUsu.setFont(new java.awt.Font("Lucida Console", 3, 12)); // NOI18N
        btnHomescreenTipoUsu.setForeground(new java.awt.Color(253, 255, 175));
        btnHomescreenTipoUsu.setText("Homescreen");
        btnHomescreenTipoUsu.setBorder(null);
        btnHomescreenTipoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomescreenTipoUsuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescriçãoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescriçãoAdd)
                            .addComponent(txtNomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeAdd))))
                .addContainerGap(225, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addComponent(btnHomescreenTipoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44))))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(lblNomeAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addComponent(lblDescriçãoAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescriçãoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionarAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnHomescreenTipoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        panelAddLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDescriçãoAdd, txtNomeAdd});

        JTabbedPane1.addTab("Adicionar", panelAdd);

        btnListar.setBackground(new java.awt.Color(250, 206, 86));
        btnListar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnListar.setForeground(new java.awt.Color(253, 255, 175));
        btnListar.setText("Listar");
        btnListar.setBorder(null);
        btnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        tblTipoDeUsuario.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        tblTipoDeUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Descrição"
            }
        ));
        tblTipoDeUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTipoDeUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTipoDeUsuario);
        if (tblTipoDeUsuario.getColumnModel().getColumnCount() > 0) {
            tblTipoDeUsuario.getColumnModel().getColumn(0).setResizable(false);
        }

        btnEditar.setBackground(new java.awt.Color(250, 206, 86));
        btnEditar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(253, 255, 175));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(250, 206, 86));
        btnRemover.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        btnRemover.setForeground(new java.awt.Color(253, 255, 175));
        btnRemover.setText("Remover");
        btnRemover.setBorder(null);
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListarLayout = new javax.swing.GroupLayout(panelListar);
        panelListar.setLayout(panelListarLayout);
        panelListarLayout.setHorizontalGroup(
            panelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        panelListarLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEditar, btnListar, btnRemover});

        panelListarLayout.setVerticalGroup(
            panelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelListarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemover))
                .addGap(7, 7, 7))
        );

        panelListarLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditar, btnListar, btnRemover});

        JTabbedPane1.addTab("Listar", panelListar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(JTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        
        List<Usuario> listaUsuario = FacadeInstance.getInstance().getAllUsuarios();
        
        for(Usuario usu: listaUsuario){
            if(usu.getTipodeusuario().equals(tipodeusuario.getNome())){
                FacadeInstance.getInstance().deleteUsuario(usu);
            }
        }
        
        
        FacadeInstance.getInstance().deleteTipoDeUsuario(tipodeusuario);
        this.lista = FacadeInstance.getInstance().getAllTipoDeUsuarios();
        this.atualizarTabela(this.lista);
        JOptionPane.showMessageDialog(null, "Usuario Excluído", "Atenção", JOptionPane.WARNING_MESSAGE);
        this.selecionado = -1;
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        this.selecionado = this.tblTipoDeUsuario.getSelectedRow();
        
        if(this.selecionado != -1){
        
            String nome = JOptionPane.showInputDialog(null,"Digite um nome: ");
            String descricao = JOptionPane.showInputDialog(null,"Digite uma Descrição: ");
        
            List<Usuario> listaUsuario = FacadeInstance.getInstance().getAllUsuarios();
        
            for(Usuario usu: listaUsuario){
                if(usu.getTipodeusuario().equals(tipodeusuario.getNome())){
                
                    usu.setNome(usu.getNome());
                    usu.setEmail(usu.getEmail());
                    usu.setSenha(usu.getSenha());
                    usu.setLogin(usu.getLogin());
                    usu.setTipodeusuario(nome);
                
                    FacadeInstance.getInstance().updateUsuario(usu);
                }
            }
        
            if(nome.isEmpty() || descricao.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Preencha todos os campos corretamente! Tente novamente.");//msg de campos faltantes
            }else{
                tipodeusuario.setNome(nome);
                tipodeusuario.setDescricao(descricao);
                FacadeInstance.getInstance().updateTipoDeUsuario(tipodeusuario);
                this.atualizarTabela(this.lista);
                JOptionPane.showMessageDialog(null,"Tipo De Usuário Editado!!!");
            
            }
        
        } else{
            JOptionPane.showMessageDialog(null, "Selecione corretamente o tipo de usuario para ser alterado!!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        this.lista = FacadeInstance.getInstance().getAllTipoDeUsuarios();
        this.atualizarTabela(this.lista);
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnAdicionarAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAddActionPerformed
        TipoDeUsuario tipodeusuarioAdd = new TipoDeUsuario();
        if(validaCampos() == true){
            tipodeusuarioAdd.setNome(txtNomeAdd.getText());
            tipodeusuarioAdd.setDescricao(txtDescriçãoAdd.getText());
            FacadeInstance.getInstance().saveTipoDeUsuario(tipodeusuarioAdd);
            this.lista = FacadeInstance.getInstance().getAllTipoDeUsuarios();
            this.atualizarTabela(this.lista);
            JOptionPane.showMessageDialog(null,"Tipo De Usuário Cadastrado!!!");
            txtNomeAdd.setText(" ");
            txtDescriçãoAdd.setText(" ");
        }
        
    }//GEN-LAST:event_btnAdicionarAddActionPerformed

    private void txtDescriçãoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriçãoAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriçãoAddActionPerformed

    private void tblTipoDeUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTipoDeUsuarioMouseClicked
        this.selecionado = this.tblTipoDeUsuario.getSelectedRow();
        if(this.selecionado != -1){
            this.tipodeusuario = this.lista.get(this.selecionado);
        }
    }//GEN-LAST:event_tblTipoDeUsuarioMouseClicked

    private void btnHomescreenTipoUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomescreenTipoUsuActionPerformed
        homescreem home = new homescreem();
        home.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnHomescreenTipoUsuActionPerformed

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
            java.util.logging.Logger.getLogger(ViewTipoDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTipoDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTipoDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTipoDeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTipoDeUsuario().setVisible(true);
            }
        });
    }
    
    private boolean validaCampos(){
        StringUtil util = StringUtil.getInstance();
        if (txtNomeAdd.getText().equals("") && txtDescriçãoAdd.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.", "CAMPOS OBRIGATÓRIOS", JOptionPane.ERROR_MESSAGE);
        return false;
        
        }
        else if(util.isNullOrEmpty(txtNomeAdd.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
            
        }
        else if(util.isNullOrEmpty(txtDescriçãoAdd.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Descrição", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTabbedPane1;
    private javax.swing.JButton btnAdicionarAdd;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnHomescreenTipoUsu;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescriçãoAdd;
    private javax.swing.JLabel lblNomeAdd;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelListar;
    private javax.swing.JTable tblTipoDeUsuario;
    private javax.swing.JTextField txtDescriçãoAdd;
    private javax.swing.JTextField txtNomeAdd;
    // End of variables declaration//GEN-END:variables
}
