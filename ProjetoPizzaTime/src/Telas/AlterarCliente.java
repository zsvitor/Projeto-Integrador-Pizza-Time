package Telas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Dados.AppDao;
/**
 *
 * @author Vitor
 */
public class AlterarCliente extends javax.swing.JFrame {

    /**
     * Creates new form AlterarCliente
     */
    public AlterarCliente() {
        initComponents();
    }
    
    public AlterarCliente(String nom, String sob, String cpf, String cel, String cep){
        initComponents();
        txtNome.setText(nom);
        txtSobrenome.setText(sob);
        txtCpf.setText(cpf);
        txtCelular.setText(cel);
        txtCep.setText(cep);
        
        txtNome.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblSobrenome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtCep = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo.jpeg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 20, 180, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/fundovermelho.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 530, 90);

        lblSobrenome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSobrenome.setForeground(new java.awt.Color(0, 0, 0));
        lblSobrenome.setText("Sobrenome:");
        getContentPane().add(lblSobrenome);
        lblSobrenome.setBounds(80, 170, 110, 16);

        lblCpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(0, 0, 0));
        lblCpf.setText("CPF:");
        getContentPane().add(lblCpf);
        lblCpf.setBounds(80, 210, 40, 16);

        lblCelular.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCelular.setForeground(new java.awt.Color(0, 0, 0));
        lblCelular.setText("Celular:");
        getContentPane().add(lblCelular);
        lblCelular.setBounds(80, 250, 70, 16);

        lblCep.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCep.setForeground(new java.awt.Color(0, 0, 0));
        lblCep.setText("CEP:");
        getContentPane().add(lblCep);
        lblCep.setBounds(80, 290, 40, 16);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(80, 130, 60, 16);

        btnSalvar.setBackground(new java.awt.Color(0, 0, 0));
        btnSalvar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(190, 340, 150, 40);
        getContentPane().add(txtCep);
        txtCep.setBounds(200, 290, 240, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(200, 130, 240, 30);
        getContentPane().add(txtSobrenome);
        txtSobrenome.setBounds(200, 170, 240, 30);
        getContentPane().add(txtCpf);
        txtCpf.setBounds(200, 210, 240, 30);
        getContentPane().add(txtCelular);
        txtCelular.setBounds(200, 250, 240, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 90, 530, 360);

        setSize(new java.awt.Dimension(545, 452));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        String nom, sob, cpf, cel, cep;
        nom = txtNome.getText();
        sob = txtSobrenome.getText();
        cpf = txtCpf.getText();
        cel = txtCelular.getText();
        cep = txtCep.getText();
        
        try {
            new AppDao().alterarCliente(sob, cpf, cel, cep, nom);
            
            JOptionPane.showMessageDialog(null, "Alteração Concluída");
            
        } catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        } 
        
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
