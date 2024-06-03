package Telas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Dados.AppDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Vitor
 */
public class ListarCliente extends javax.swing.JFrame {

    /**
     * Creates new form ListarCliente
     */
    public ListarCliente() {
        initComponents();
        carregarDados();
    }
    
    public void carregarDados(){
        
        try{
            ResultSet cliente =new AppDao().listarCliente();
            
            DefaultTableModel tblModelo = (DefaultTableModel) tblCliente.getModel();
            tblModelo.setRowCount(0);
            
            while(cliente.next()){
                
                Object nomes[] = {"", "", "", "", ""};
                Object linha[] = {
                    cliente.getString("nome_cliente"),
                    cliente.getString("sobrenome_cliente"),
                    cliente.getString("cpf_cliente"),
                    cliente.getString("celular_cliente"),
                    cliente.getString("cep_cliente")
                };
                tblModelo.addRow(linha);
            }            
            
        } catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte e informe o erro: " + ex.getMessage());
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo.jpeg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 20, 180, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/fundovermelho.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 90);
        getContentPane().add(txtNomeCliente);
        txtNomeCliente.setBounds(20, 110, 220, 30);

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(240, 110, 75, 30);

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "CPF", "Celular", "CEP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 600, 402);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 90, 640, 520);

        setSize(new java.awt.Dimension(656, 616));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        String n;
        n = txtNomeCliente.getText();
        if(n.equals("")){
            carregarDados();
            return;
        }
        
        try{
             ResultSet cliente = new AppDao().buscaCliente(n);
             
            DefaultTableModel tblModelo = (DefaultTableModel) tblCliente.getModel();
            tblModelo.setRowCount(0);
            while(cliente.next()){
                
                Object nomes[] = {"", "", "", "", ""};
                Object linha[] = {
                    cliente.getString("nome_cliente"),
                    cliente.getString("sobrenome_cliente"),
                    cliente.getString("cpf_cliente"),
                    cliente.getString("celular_cliente"),
                    cliente.getString("cep_cliente")
                };
                tblModelo.addRow(linha);
            }            
            
        } catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte e informe o erro: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
