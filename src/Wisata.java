/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sofyan
 */

import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Wisata extends javax.swing.JFrame {
    /**
     * Creates new form Wisata
     */
    public Statement st;
    public ResultSet rs;
    Connection cn = koneksi.BukaKoneksi();
    public Wisata() {
        initComponents();
        TampilData();
    }
    
    private void Bersih(){
        txt_IdWisata.setText("");
        txt_NamaWisata.setText("");
        txt_BiayaWisata.setText("");
        
        button_Simpan.setText("SIMPAN");
        txt_IdWisata.setEditable(true);
    }
    
    private void TampilData(){
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM wisata");
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("id_wisata");
            model.addColumn("nama_wisata");
            model.addColumn("biaya_wisata");
            
            
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            model.setRowCount(0);
            
            while(rs.next()){
                Object[] data = {
                  rs.getString("id_wisata"),
                  rs.getString("nama_wisata"),
                  rs.getString("biaya_wisata")
                };
                model.addRow(data);
                table_Wisata.setModel(model);
            }
        } catch (Exception e){
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_NamaWisata = new javax.swing.JTextField();
        txt_BiayaWisata = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Wisata = new javax.swing.JTable();
        button_Simpan = new javax.swing.JButton();
        button_Batal = new javax.swing.JButton();
        button_Hapus = new javax.swing.JButton();
        button_Kembali = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_IdWisata = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama Wisata");

        jLabel2.setText("Biaya Wisata");

        table_Wisata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Wisata", "Nama Wisata", "Biaya Wisata"
            }
        ));
        table_Wisata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_WisataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_Wisata);

        button_Simpan.setText("SIMPAN");
        button_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SimpanActionPerformed(evt);
            }
        });

        button_Batal.setText("BATAL");
        button_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_BatalActionPerformed(evt);
            }
        });

        button_Hapus.setText("HAPUS");
        button_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_HapusActionPerformed(evt);
            }
        });

        button_Kembali.setText("KEMBALI");
        button_Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_KembaliActionPerformed(evt);
            }
        });

        jLabel4.setText("ID Wisata");

        jButton1.setText("CETAK LAPORAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("INPUT WISATA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(173, 173, 173))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(205, 205, 205)
                            .addComponent(txt_IdWisata, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(124, 124, 124)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(button_Simpan)
                                .addComponent(txt_BiayaWisata, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addComponent(txt_NamaWisata, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_Kembali)
                                .addGap(101, 101, 101)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_Hapus)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 373, Short.MAX_VALUE)
                .addComponent(button_Batal)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_IdWisata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NamaWisata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_BiayaWisata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Simpan)
                    .addComponent(button_Batal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Hapus)
                    .addComponent(button_Kembali)
                    .addComponent(jButton1))
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SimpanActionPerformed
        // TODO add your handling code here:
        try{
            st = cn.createStatement();
            if (txt_BiayaWisata.getText().equals("") || txt_IdWisata.getText().equals("") || txt_NamaWisata.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            //aksi simpan data
            if(button_Simpan.getText() == "SIMPAN") {
                String cek = "SELECT * FROM wisata WHERE id_wisata = '" + txt_IdWisata.getText() + "'";
                rs = st.executeQuery(cek);
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Ups... id ini sudah ada");
                }else{
                    String sql = "INSERT INTO wisata VALUES ('" + txt_IdWisata.getText() + "','" + txt_NamaWisata.getText() +
                            "','" + txt_BiayaWisata.getText() + "')";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                    Bersih();
                    TampilData();
                }
            }else{
                //aksi ubah data
                String update = "UPDATE wisata SET nama_wisata = '" + txt_NamaWisata.getText() +
                        "', biaya_wisata = '" + txt_BiayaWisata.getText() + 
                        "' WHERE id_wisata = '" + txt_IdWisata.getText() + "'";
                st.executeUpdate(update);
                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                Bersih();
                TampilData();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
//        DefaultTableModel dataModel = (DefaultTableModel) table_Pelanggan.getModel();
//            List list = new ArrayList<>();
//            table_Pelanggan.setAutoCreateColumnsFromModel(true);
//            list.add(txt_NoPelanggan.getText());
//            list.add(txt_NamaPelanggan.getText());
//            list.add(txt_NoTelp.getText());
//            list.add(txt_Email.getText());
//            dataModel.addRow(list.toArray());
//             JOptionPane.showMessageDialog(null, "Data berhasil disimpan "
//    + "Information !!", "Information",
//       JOptionPane.INFORMATION_MESSAGE);
//        txt_NoPelanggan.setText("P0");
//        txt_NamaPelanggan.setText("");
//        txt_NoTelp.setText("");
//        txt_Email.setText("");
//        txt_NamaPelanggan.requestFocus();
    }//GEN-LAST:event_button_SimpanActionPerformed

    private void table_WisataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_WisataMouseClicked
        // TODO add your handling code here:
        txt_IdWisata.setText(table_Wisata.getValueAt(table_Wisata.getSelectedRow(), 0).toString());
        txt_NamaWisata.setText(table_Wisata.getValueAt(table_Wisata.getSelectedRow(), 1).toString());
        txt_BiayaWisata.setText(table_Wisata.getValueAt(table_Wisata.getSelectedRow(), 2).toString());
        
        txt_IdWisata.setEditable(false);
        button_Simpan.setText("UBAH");
    }//GEN-LAST:event_table_WisataMouseClicked

    private void button_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_HapusActionPerformed
        // TODO add your handling code here:
        if(txt_IdWisata.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih data yang akan dihapus !");
        }else{
            int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan dihapus, lanjutkan ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (jawab == 0) {
                try{
                    st = cn.createStatement();
                    String sql = "DELETE FROM wisata WHERE id_wisata = '" + txt_IdWisata.getText() + "'";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                    TampilData();
                    Bersih();
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
        }
        }
    }//GEN-LAST:event_button_HapusActionPerformed

    private void button_BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_BatalActionPerformed
        // TODO add your handling code here:
        Bersih();
    }//GEN-LAST:event_button_BatalActionPerformed

    private void button_KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_KembaliActionPerformed
        // TODO add your handling code here:
        new MenuUtama().setVisible(true);
        dispose();
    }//GEN-LAST:event_button_KembaliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            HashMap parameter = new HashMap();
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql:" + "///tour", "root", "");
            File file = new File("src/LaporanWisata.jasper");
            JasperReport jr = (JasperReport) JRLoader.loadObject(file);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameter, cn);
            JasperViewer.viewReport(jp, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        }catch (Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Data tidak dapat di Cetak !!!" + "\n" + e.getMessage(), "Cetak Data", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wisata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Batal;
    private javax.swing.JButton button_Hapus;
    private javax.swing.JButton button_Kembali;
    private javax.swing.JButton button_Simpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Wisata;
    private javax.swing.JTextField txt_BiayaWisata;
    private javax.swing.JTextField txt_IdWisata;
    private javax.swing.JTextField txt_NamaWisata;
    // End of variables declaration//GEN-END:variables
}
