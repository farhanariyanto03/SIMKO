/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simko_fiks;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Farhan Ariyanto
 */
public class detail_laporan extends javax.swing.JFrame {

    /**
     * Creates new form detail_laporan
     */
    public detail_laporan() {
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

        jLabel2 = new javax.swing.JLabel();
        lbl_close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        txtf_idTagihan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtf_idTagihanMouseClicked(evt);
            }
        });
        getContentPane().add(txtf_idTagihan);
        txtf_idTagihan.setBounds(460, 200, 250, 30);
        getContentPane().add(txtf_nama);
        txtf_nama.setBounds(460, 270, 240, 30);
        getContentPane().add(txtf_noKamar);
        txtf_noKamar.setBounds(460, 340, 240, 30);
        getContentPane().add(txtf_harga);
        txtf_harga.setBounds(460, 410, 240, 30);
        getContentPane().add(txtf_periode);
        txtf_periode.setBounds(460, 480, 250, 30);
        getContentPane().add(txtf_bayar);
        txtf_bayar.setBounds(460, 550, 250, 30);
        getContentPane().add(txtf_tglTransaksi);
        txtf_tglTransaksi.setBounds(460, 620, 250, 30);
        getContentPane().add(txtf_status);
        txtf_status.setBounds(460, 690, 260, 30);
        getContentPane().add(txtf_keterangan);
        txtf_keterangan.setBounds(460, 760, 260, 30);

        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_closeMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_close);
        lbl_close.setBounds(710, 10, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Pop up laporan_1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 790, 900);

        setSize(new java.awt.Dimension(776, 901));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseClicked
       this.dispose();
    }//GEN-LAST:event_lbl_closeMouseClicked

    private void txtf_idTagihanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtf_idTagihanMouseClicked
        try{
        String sql = "SELECT * FROM tb_tagihan where id_tagihan = '"+txtf_idTagihan.getText()+"'";
        java.sql.Connection conn = (Connection)config.configDB();
        java.sql.Statement st = conn.createStatement();
        java.sql.ResultSet res = st.executeQuery(sql);
        
        while(res.next()){
            txtf_nama.setText(res.getString("id_penghuni"));
            txtf_noKamar.setText(res.getString("noKamar"));
            txtf_periode.setText(res.getString("periode_tagihan"));
            txtf_bayar.setText(res.getString("total_tagihan"));
            txtf_tglTransaksi.setText(res.getString("tgl_bayar"));
            txtf_status.setText(res.getString("status"));
            txtf_keterangan.setText(res.getString("keterangan"));
        }
        
        }catch (SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        this.setVisible(true);
        new detail_laporan().setVisible(true);
    }//GEN-LAST:event_txtf_idTagihanMouseClicked

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
            java.util.logging.Logger.getLogger(detail_laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detail_laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detail_laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detail_laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detail_laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_close;
    public static final javax.swing.JLabel txtf_bayar = new javax.swing.JLabel();
    public static final javax.swing.JLabel txtf_harga = new javax.swing.JLabel();
    public static final javax.swing.JLabel txtf_idTagihan = new javax.swing.JLabel();
    public static final javax.swing.JLabel txtf_keterangan = new javax.swing.JLabel();
    public static final javax.swing.JLabel txtf_nama = new javax.swing.JLabel();
    public static final javax.swing.JLabel txtf_noKamar = new javax.swing.JLabel();
    public static final javax.swing.JLabel txtf_periode = new javax.swing.JLabel();
    public static final javax.swing.JLabel txtf_status = new javax.swing.JLabel();
    public static final javax.swing.JLabel txtf_tglTransaksi = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
