/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author enric
 */
public class editTipemobil extends javax.swing.JFrame {

    /**
     * Creates new form editTipemobil
     */
    public editTipemobil() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_tipe_mobil = new javax.swing.JTable();
        tomboltambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tomboledit = new javax.swing.JButton();
        tombolhapus = new javax.swing.JButton();
        tombolcari = new javax.swing.JButton();
        tombolrefresh = new javax.swing.JButton();
        tombolkembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pengolahan Database Penyewaan Kendaraan");

        tabel_tipe_mobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "kode_tipe", "kode_merek", "nama_tipe", "biaya_mobil"
            }
        ));
        jScrollPane1.setViewportView(tabel_tipe_mobil);

        tomboltambah.setText("Tambah");
        tomboltambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomboltambahActionPerformed(evt);
            }
        });

        jLabel1.setText("Tabel Tipe Mobil");

        tomboledit.setText("Edit");
        tomboledit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomboleditActionPerformed(evt);
            }
        });

        tombolhapus.setText("Hapus");
        tombolhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolhapusActionPerformed(evt);
            }
        });

        tombolcari.setText("Cari");
        tombolcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolcariActionPerformed(evt);
            }
        });

        tombolrefresh.setText("Refresh");
        tombolrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolrefreshActionPerformed(evt);
            }
        });

        tombolkembali.setText("Kembali");
        tombolkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolkembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addContainerGap(354, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tomboledit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolcari, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tomboltambah, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tombolrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tomboltambah, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(tombolhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tomboledit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tombolcari, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tombolkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tomboltambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomboltambahActionPerformed
        // TODO add your handling code here:
        try{
            String user = "root";
            String pass = "";
            String dbURL = "jdbc:mysql://localhost/db10118295penyewaankendaraan";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, user, pass);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from merek_mobil;");
            JComboBox jc = new JComboBox();
            JPanel kd_merek = new JPanel();
            kd_merek.add(new JLabel("Kode Merek"));
            
            String kode_tipe = JOptionPane.showInputDialog("Masukan Kode Tipe");
            while(rs.next())
            {
                jc.addItem(rs.getString("kode_merek")+" - "+rs.getString("nama_merek"));
                kd_merek.add(jc);
            }
            
            int result = JOptionPane.showConfirmDialog(null, kd_merek,
            "Pilih Kode Merek", JOptionPane.OK_CANCEL_OPTION);
            String kode_mrk = jc.getSelectedItem().toString();
            String kode_merek = kode_mrk.substring(0,5);
            String nama_tipe = JOptionPane.showInputDialog("Masukan Nama Tipe");
            int biaya_mobil = Integer.parseInt(JOptionPane.showInputDialog("Masukan Biaya Mobil"));
            if(kode_tipe == null || nama_tipe == null || kode_merek == null || biaya_mobil == 0)
            {
                JOptionPane.showMessageDialog(null, "Data Gagal Ditambah");
            }
            else
            {
                String sql ="insert into tipe_mobil(kode_tipe,kode_merek,nama_tipe,biaya_mobil) values (?,?,?,?)";
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setString(1,kode_tipe);
                ps.setString(2,kode_merek);
                ps.setString(3,nama_tipe);
                ps.setInt(4,biaya_mobil);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah, Silahkan Klik Tombol Refresh");
            }
            st.close();
            conn.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Dalam Memproses");
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "JDBC Driver tidak ditemukan");
        }
    }//GEN-LAST:event_tomboltambahActionPerformed

    private void tomboleditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomboleditActionPerformed
        // TODO add your handling code here:
        String test;
        try{
            String user = "root";
            String pass = "";
            String dbURL = "jdbc:mysql://localhost/db10118295penyewaankendaraan";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, user, pass);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from merek_mobil;");  
            JComboBox jc = new JComboBox();
            JPanel kd_merek = new JPanel();
            kd_merek.add(new JLabel("Kode Merek"));
            String kode_tipe = JOptionPane.showInputDialog("Masukan Kode Tipe");
            while(rs.next())
            {
                jc.addItem(rs.getString("kode_merek")+" - "+rs.getString("nama_merek"));
                kd_merek.add(jc);
            }

            int result = JOptionPane.showConfirmDialog(null, kd_merek,
            "Pilih Kode Merek", JOptionPane.OK_CANCEL_OPTION);
            String kode_mrk = jc.getSelectedItem().toString();
            String kode_merek = kode_mrk.substring(0,5);
            String nama_tipe = JOptionPane.showInputDialog("Masukan Nama Tipe");
            int biaya_mobil = Integer.parseInt(JOptionPane.showInputDialog("Masukan Biaya Mobil"));
            
            int column = 0;
            int row = tabel_tipe_mobil.getSelectedRow();
            String kode =  tabel_tipe_mobil.getModel().getValueAt(row, 0).toString();
            
            if(kode_tipe == null || nama_tipe == null || kode_merek == null || biaya_mobil == 0)
            {
                JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
            }        
            else
            {
                String sql ="UPDATE tipe_mobil SET kode_tipe = (?) , kode_merek = (?) , "
                        + "nama_tipe = (?) , biaya_mobil = (?) WHERE kode_tipe = '"+kode+"'; ";
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setString(1,kode_tipe);
                ps.setString(2,kode_merek);
                ps.setString(3,nama_tipe);
                ps.setInt(4,biaya_mobil);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah, Silahkan Klik Tombol Refresh");
            }
            st.close();
            conn.close();
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Dalam Pemrosesan");
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "JDBC Driver tidak ditemukan");
        }
    }//GEN-LAST:event_tomboleditActionPerformed

    private void tombolhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolhapusActionPerformed
        // TODO add your handling code here:
        try{
            String user = "root";
            String pass = "";
            String dbURL = "jdbc:mysql://localhost/db10118295penyewaankendaraan";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, user, pass);
            Statement st = conn.createStatement();

            int column = 0;
            int row = tabel_tipe_mobil.getSelectedRow();
            String kode = tabel_tipe_mobil.getModel().getValueAt(row, 0).toString();

            if (JOptionPane.showConfirmDialog(null, "Apakah Kamu Yakin?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            String sql ="DELETE FROM tipe_mobil WHERE kode_tipe = '"+kode+"';";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus, Silahkan Klik Tombol Refresh");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
        }
        st.close();
        conn.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Dalam Pemrosesan");
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "JDBC Driver tidak ditemukan");
        }
    }//GEN-LAST:event_tombolhapusActionPerformed

    private void tombolcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolcariActionPerformed
        // TODO add your handling code here:
        try{
            String user = "root";
            String pass = "";
            String dbURL = "jdbc:mysql://localhost/db10118295penyewaankendaraan";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, user, pass);
            Statement st = conn.createStatement();

            JTextField kode_tipe = new JTextField(10);
            JTextField kode_merek = new JTextField(20);
            JTextField nama_tipe = new JTextField(20);
            JTextField biaya_mobil = new JTextField(12);

            JPanel cari = new JPanel();
            cari.setLayout(new BoxLayout(cari, BoxLayout.PAGE_AXIS));
            cari.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
            cari.add(new JLabel("Kode Tipe:"));
            cari.add(kode_tipe);
            cari.add(Box.createVerticalGlue()); // a spacer
            cari.add(new JLabel("Kode Merek:"));
            cari.add(kode_merek);
            cari.add(Box.createVerticalGlue());
            cari.add(new JLabel("Nama Tipe:"));
            cari.add(nama_tipe);
            cari.add(Box.createVerticalGlue());    
            cari.add(new JLabel("Biaya Mobil:"));
            cari.add(biaya_mobil);
            cari.add(Box.createVerticalGlue());
            
            int result = JOptionPane.showConfirmDialog(null, cari,
                "Masukan Data Yang Ingin Di Cari", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION)
            {
                ResultSet rs = st.executeQuery("SELECT * From tipe_mobil WHERE kode_tipe "
                    + "LIKE '%"+kode_tipe.getText()+"%' AND "
                    + "kode_merek LIKE '%"+kode_merek.getText()+"%' AND "
                    + "nama_tipe LIKE '%"+nama_tipe.getText()+"%' "                            
                    + "AND biaya_mobil LIKE '%"+biaya_mobil.getText()+"%';");
                DefaultTableModel tm=(DefaultTableModel)tabel_tipe_mobil.getModel();
                tm.setRowCount(0);
                while(rs.next())
                {
                    Object o[]={rs.getString("kode_tipe"),rs.getString("kode_merek"),
                    rs.getString("nama_tipe"),rs.getString("biaya_mobil")};
                    tm.addRow(o);
                }
            }
            st.close();
            conn.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Dalam Pemrosesan");
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "JDBC Driver tidak ditemukan");
        }
    }//GEN-LAST:event_tombolcariActionPerformed

    private void tombolrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolrefreshActionPerformed
        // TODO add your handling code here:
        try{
            String user = "root";
            String pass = "";
            String dbURL = "jdbc:mysql://localhost/db10118295penyewaankendaraan";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbURL, user, pass);
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM tipe_mobil;");
            DefaultTableModel tm=(DefaultTableModel)tabel_tipe_mobil.getModel();
            tm.setRowCount(0);
            while(rs.next())
            {
                Object o[]={rs.getString("kode_tipe"),rs.getString("kode_merek"),
                    rs.getString("nama_tipe"),rs.getString("biaya_mobil")};
                tm.addRow(o);
            }

            st.close();
            conn.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Dalam Pemrosesan");
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "JDBC Driver tidak ditemukan");
        }
    }//GEN-LAST:event_tombolrefreshActionPerformed

    private void tombolkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolkembaliActionPerformed
        // TODO add your handling code here:
        dispose();

        menuForm menu = new menuForm();
        menu.setVisible(true);
    }//GEN-LAST:event_tombolkembaliActionPerformed

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
            }UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editTipemobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_tipe_mobil;
    private javax.swing.JButton tombolcari;
    private javax.swing.JButton tomboledit;
    private javax.swing.JButton tombolhapus;
    private javax.swing.JButton tombolkembali;
    private javax.swing.JButton tombolrefresh;
    private javax.swing.JButton tomboltambah;
    // End of variables declaration//GEN-END:variables
}
