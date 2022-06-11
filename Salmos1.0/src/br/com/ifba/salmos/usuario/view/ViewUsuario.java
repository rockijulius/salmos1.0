/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.salmos.usuario.view;

import br.com.ifba.salmos.homescreem.view.homescreem;
import br.com.ifba.salmos.infrastructure.service.FacadeInstance;
import br.com.ifba.salmos.infrastructure.support.StringUtil;
import br.com.ifba.salmos.tiposdeusuarios.model.TipoDeUsuario;
import br.com.ifba.salmos.usuario.model.Usuario;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe
 */
public class ViewUsuario extends javax.swing.JFrame {
    
    DefaultTableModel listaTabela;
    ComboBoxModel tipoUsuario;
    List<Usuario> lista;
    List<TipoDeUsuario> listaTipo;
    int selecionado;
    
    Usuario usuario;
    /**
     * Creates new form UsuarioView
     */
    public ViewUsuario() {
        initComponents();
        CmbBoxTipoUsuario();
    }
    
    private void atualizarTabela(List<Usuario> listaUsuario, List<TipoDeUsuario> listaTipoUsu){
        this.listaTabela = new DefaultTableModel(null, new String [] {"ID", "Login", "Senha", "Email", "Nome", "Tipo de Usuário"});
        
        for(Usuario usu: listaUsuario){
            List<TipoDeUsuario> tipo = FacadeInstance.getInstance().getAllTipoDeUsuarios();
            listaTabela.addRow(new Object[]{usu.getId(), usu.getLogin(), usu.getSenha(), usu.getEmail(), usu.getNome(), usu.getTipodeusuario()});
        }
        
        this.tblUsuario.setModel(this.listaTabela);
    }
    
    private void CmbBoxTipoUsuario(){
        List<TipoDeUsuario> tipodeusuario = FacadeInstance.getInstance().getAllTipoDeUsuarios();
        for(int i = 0; i < tipodeusuario.size(); i++){
            cbbTipoDeUsuario.addItem(tipodeusuario.get(i).getNome());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        btnHomescreen = new javax.swing.JButton();
        lblTipoDeUsuario = new javax.swing.JLabel();
        cbbTipoDeUsuario = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lblNome.setText("Nome");

        jLabel1.setText("Senha");

        jLabel2.setText("Email");

        jLabel3.setText("Usuario");

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsuario);

        btnHomescreen.setText("Homescreen");
        btnHomescreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomescreenActionPerformed(evt);
            }
        });

        lblTipoDeUsuario.setText("Tipo De Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnHomescreen))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionar)
                            .addComponent(btnRemover)
                            .addComponent(btnListar)
                            .addComponent(btnEditar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(lblNome))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                        .addComponent(txtNome)
                                        .addComponent(txtSenha)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipoDeUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbTipoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblNome))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoDeUsuario)
                            .addComponent(cbbTipoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(btnListar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover)
                        .addGap(23, 23, 23)
                        .addComponent(btnEditar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(37, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(btnHomescreen)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        
        Usuario usuario = new Usuario();
        
        //Chamando a lista de tipodeusuario para buscar pelo indice
        
        List<TipoDeUsuario> tipodeusuario = FacadeInstance.getInstance().getAllTipoDeUsuarios();
        List<Usuario> usuarios = FacadeInstance.getInstance().getAllUsuarios();
        
        int i, c;
        
        i = cbbTipoDeUsuario.getSelectedIndex();
        if(validaCampos() == true){
            
            usuario.setEmail(txtEmail.getText());
            usuario.setLogin(txtUsuario.getText());
            usuario.setSenha(txtSenha.getText());
            usuario.setNome(txtNome.getText());
            usuario.setTipodeusuario(tipodeusuario.get(i).getNome());
            
            for(c = 0; c < usuarios.size(); c++){
                if(usuario.getLogin().equals(usuarios.get(c).getLogin())){
                    JOptionPane.showMessageDialog(null, "Login existente!!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    return;
                }else if(usuario.getEmail().equals(usuarios.get(c).getEmail())){
                    JOptionPane.showMessageDialog(null, "Email ja existe!!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            
            FacadeInstance.getInstance().saveUsuario(usuario);
            
            txtEmail.setText(null);
            txtUsuario.setText(null);
            txtSenha.setText(null);
            txtNome.setText(null);
            
            JOptionPane.showMessageDialog(null, "Usuario Adicionado", "Parabéns", JOptionPane.INFORMATION_MESSAGE);
            
            this.lista = FacadeInstance.getInstance().getAllUsuarios();
            this.listaTipo = FacadeInstance.getInstance().getAllTipoDeUsuarios();
            this.atualizarTabela(this.lista, this.listaTipo);
        }
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        
        this.lista = FacadeInstance.getInstance().getAllUsuarios();
        this.listaTipo = FacadeInstance.getInstance().getAllTipoDeUsuarios();
        this.atualizarTabela(this.lista, this.listaTipo);
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        
        this.selecionado = this.tblUsuario.getSelectedRow();
        
        if(this.selecionado != -1){
            this.usuario = this.lista.get(this.selecionado);
        }
    }//GEN-LAST:event_tblUsuarioMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        
        FacadeInstance.getInstance().deleteUsuario(usuario);
        this.lista = FacadeInstance.getInstance().getAllUsuarios();
        this.listaTipo = FacadeInstance.getInstance().getAllTipoDeUsuarios();
        this.atualizarTabela(this.lista, this.listaTipo);
        
        this.selecionado = -1;
        
        JOptionPane.showMessageDialog(null, "Usuario Excluído", "Atenção", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        ViewUsuarioEditar view = new ViewUsuarioEditar();
        view.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnHomescreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomescreenActionPerformed
        // TODO add your handling code here:
        
        homescreem home = new homescreem();
        home.setVisible(true);
        
        this.setVisible(false);
        
    }//GEN-LAST:event_btnHomescreenActionPerformed

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
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnHomescreen;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cbbTipoDeUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTipoDeUsuario;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    private boolean validaCampos(){
        StringUtil util = StringUtil.getInstance();
        if (txtNome.getText().equals("") && txtEmail.getText().equals("") && txtSenha.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios.", "CAMPOS OBRIGATÓRIOS", JOptionPane.ERROR_MESSAGE);
        return false;
        
        }
        else if(util.isNullOrEmpty(txtNome.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome.", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
            
        }
        else if(util.isNullOrEmpty(txtEmail.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Email", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
            
        }
        else if(util.isNullOrEmpty(txtSenha.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Senha", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
       
        }
        else if (util.isNullOrEmpty(txtUsuario.getText())){
            JOptionPane.showMessageDialog(null, "Preencha o campo Usuario", "CAMPOS OBRIGATÓRIOS", JOptionPane.WARNING_MESSAGE);
            return false;
            
        }
        return true;
    }
}
