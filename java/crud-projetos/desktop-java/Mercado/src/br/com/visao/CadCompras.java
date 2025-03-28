/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.visao;

import br.com.controle.Mercado;
import br.com.modelo.MercadoDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sousa
 */
public class CadCompras extends javax.swing.JFrame {

    /**
     * Creates new form CadCompras
     */
    public CadCompras() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPro = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabCli = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodPro = new javax.swing.JTextField();
        txtCodCli = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        btnComprar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnPes.setText("Listar Produtos e Clientes");
        btnPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesActionPerformed(evt);
            }
        });

        tabPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Produtos", "Valor", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(tabPro);

        tabCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Telefone"
            }
        ));
        jScrollPane2.setViewportView(tabCli);

        jLabel1.setText("Digite o codigo do produto:");

        jLabel2.setText("Digite o codigo do cliente:");

        jLabel3.setText("Data:");

        jLabel4.setText("Quantidade:");

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        jLabel5.setText("Exemplo: 2000-12-31");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtData))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(btnComprar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnComprar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesActionPerformed
        // TODO add your handling code here:
        try {
            Mercado m = new Mercado();
            MercadoDAO dao = new MercadoDAO();
            DefaultTableModel produtospesque = (DefaultTableModel) tabPro.getModel();
            
            ArrayList<Mercado> produtos = dao.PesquisarTudoProdutos();
            for (int i = 0; i < produtos.size(); i++) {
                m = produtos.get(i);
                produtospesque.addRow(new Object[] {m.getId_produto(),m.getProdutos(),m.getValor(),m.getQuantidade_produtos()});
            }
            
            DefaultTableModel clientespesque = (DefaultTableModel) tabCli.getModel();
            
            ArrayList<Mercado> clientes = dao.PesquisarTudoClientes();
            for (int i = 0; i < clientes.size(); i++) {
                m = clientes.get(i);
                clientespesque.addRow(new Object[] {m.getId_cliente(),m.getNome(),m.getTelefone()});
            }
        } catch (Exception e) {
            System.out.println("Erro "+e.getMessage());
        }
    }//GEN-LAST:event_btnPesActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
        Mercado m = new Mercado();
        MercadoDAO dao = new MercadoDAO();
        m.setId_produto_pro(Integer.parseInt(txtCodPro.getText()));
        m.setId_cliente_cli(Integer.parseInt(txtCodCli.getText()));
        m.setData_compra(LocalDate.parse(txtData.getText()));
        m.setQuantidade_compras(Integer.parseInt(txtQtd.getText()));
        try {
            dao.inserirCompras(m);
        } catch (Exception e) {
            Logger.getLogger(CadCompras.class.getName()).log(Level.SEVERE, null, e);
        }
        txtCodPro.setText("");
        txtCodCli.setText("");
        txtData.setText("");
        txtQtd.setText("");
    }//GEN-LAST:event_btnComprarActionPerformed

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
            java.util.logging.Logger.getLogger(CadCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnPes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabCli;
    private javax.swing.JTable tabPro;
    private javax.swing.JTextField txtCodCli;
    private javax.swing.JTextField txtCodPro;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
