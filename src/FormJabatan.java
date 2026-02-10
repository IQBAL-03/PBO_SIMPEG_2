import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;
public class FormJabatan extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormJabatan.class.getName());

    Connection con;
    Statement stm;
    PreparedStatement pstm;
    ResultSet  rs;
    String sql;
    public FormJabatan() {
        initComponents();
        koneksi DBS = new koneksi();
        DBS.config();
        con = DBS.con;
        stm = DBS.stm;
        load_table();
        kosong();
    }

    private void load_table() {
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.addColumn("ID JABATAN");
    tableModel.addColumn("NAMA JABATAN");
    tableModel.addColumn("GAJI POKOK");
    tableModel.addColumn("TUNJANGAN JABATAN");
    tableModel.addColumn("TUNJANGAN ANAK");
    tableModel.addColumn("TUNJANGAN KESEHATAN");
    tableModel.addColumn("PERJALANAN DINAS");

    try {
        sql = "SELECT * FROM tabel_jabatan";
        rs = stm.executeQuery(sql);
        while (rs.next()) {
            tableModel.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6),
                rs.getString(7)
            });
        }
        tabel.setModel(tableModel);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
    private void kosong() {
    jabatan.setText(null);
    njabatan.setText(null);
    pokok.setText(null);
    tunjangan.setText(null);
    anak.setText(null);
    kesehatan.setText(null);
    dinas.setText(null);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kesehatan = new javax.swing.JTextField();
        dinas = new javax.swing.JTextField();
        anak = new javax.swing.JTextField();
        tunjangan = new javax.swing.JTextField();
        pokok = new javax.swing.JTextField();
        njabatan = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        jabatan = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Jabatan");

        jLabel1.setText("ID JABATAN");

        jLabel2.setText("JABATAN");

        jLabel3.setText("GAJI POKOK");

        jLabel4.setText("TUNJANGAN JABATAN");

        jLabel5.setText("TUNJANGAN ANAK");

        jLabel6.setText("TUNJANGAN KESEHATAN");

        jLabel7.setText("PERJALANAN DINAS");

        kesehatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kesehatanActionPerformed(evt);
            }
        });

        dinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinasActionPerformed(evt);
            }
        });

        anak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anakActionPerformed(evt);
            }
        });

        tunjangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tunjanganActionPerformed(evt);
            }
        });

        pokok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokokActionPerformed(evt);
            }
        });

        njabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                njabatanActionPerformed(evt);
            }
        });

        cari.setText("CARI");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatanActionPerformed(evt);
            }
        });

        tambah.setText("TAMBAH");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(update)
                        .addGap(106, 106, 106)
                        .addComponent(hapus)
                        .addGap(83, 83, 83)
                        .addComponent(keluar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(kesehatan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dinas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anak, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tunjangan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pokok, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(njabatan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jabatan, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cari))))
                    .addComponent(jScrollPane1))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(njabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pokok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tunjangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(anak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kesehatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(update)
                    .addComponent(hapus)
                    .addComponent(keluar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinasActionPerformed
        // TODO add your handling code here:
        tambah.doClick();
    }//GEN-LAST:event_dinasActionPerformed

    private void jabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatanActionPerformed
        // TODO add your handling code here:
        njabatan.requestFocus();
    }//GEN-LAST:event_jabatanActionPerformed

    private void njabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_njabatanActionPerformed
        // TODO add your handling code here:
        pokok.requestFocus();
    }//GEN-LAST:event_njabatanActionPerformed

    private void pokokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokokActionPerformed
        // TODO add your handling code here:
        tunjangan.requestFocus();
    }//GEN-LAST:event_pokokActionPerformed

    private void tunjanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tunjanganActionPerformed
        // TODO add your handling code here:
        anak.requestFocus();
    }//GEN-LAST:event_tunjanganActionPerformed

    private void anakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anakActionPerformed
        // TODO add your handling code here:
        kesehatan.requestFocus();
    }//GEN-LAST:event_anakActionPerformed

    private void kesehatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kesehatanActionPerformed
        // TODO add your handling code here:
        dinas.requestFocus();
    }//GEN-LAST:event_kesehatanActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        String id = jabatan.getText().trim();
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nggak Boleh kosong");
            return;
        }
        try{
            sql = "select * from tabel_jabatan where id_jabatan = ?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, id);
            rs = pstm.executeQuery();
            if(rs.next()){
                njabatan.setText(rs.getString("jabatan"));
                pokok.setText(rs.getString("gaji_pokok"));
                tunjangan.setText(rs.getString("tunj_jabatan"));
                anak.setText(rs.getString("tunj_anak"));
                kesehatan.setText(rs.getString("tunj_kesehatan"));
                dinas.setText(rs.getString("perj_dinas"));
            }else{
                JOptionPane.showMessageDialog(null, "Data Ra ketemu");
                kosong();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
    }//GEN-LAST:event_cariActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        String id = jabatan.getText().trim();
        String nama = njabatan.getText().trim();
        String gaji = pokok.getText().trim();
        String tunjanganj = tunjangan.getText().trim();
        String tanak = anak.getText().trim();
        String tkesehatan = kesehatan.getText().trim();
        String pdinas = dinas.getText().trim();
        if(id.isEmpty() || nama.isEmpty() || gaji.isEmpty() || tunjanganj.isEmpty() || tanak.isEmpty() || tkesehatan.isEmpty() || pdinas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nggak Boelh kosong");
            return;
        }
        try{
            sql = "INSERT INTO tabel_jabatan (id_jabatan, jabatan, gaji_pokok, tunj_jabatan, tunj_anak, tunj_kesehatan, perj_dinas) VALUES (?, ?, ?, ?, ?, ?, ?)";
            pstm = con.prepareStatement(sql);
            pstm.setString(1,id);
            pstm.setString(2,nama);
            pstm.setString(3,gaji);
            pstm.setString(4,tunjanganj);
            pstm.setString(5,tanak);
            pstm.setString(6,tkesehatan);
            pstm.setString(7, pdinas);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Berhasil");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_tambahActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
       String id = jabatan.getText().trim();
        String nama = njabatan.getText().trim();
        String gaji = pokok.getText().trim();
        String tunjanganj = tunjangan.getText().trim();
        String tanak = anak.getText().trim();
        String tkesehatan = kesehatan.getText().trim();
        String pdinas = dinas.getText().trim();
        if(id.isEmpty() || nama.isEmpty() || gaji.isEmpty() || tunjanganj.isEmpty() || tanak.isEmpty() || tkesehatan.isEmpty() || pdinas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nggak Boelh kosong");
            return;
        }
        try{
            sql = "UPDATE tabel_jabatan SET jabatan = ?, gaji_pokok = ?, tunj_jabatan = ?, tunj_anak = ?, tunj_kesehatan = ?, perj_dinas = ? WHERE id_jabatan = ?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, nama);
            pstm.setString(2, gaji);
            pstm.setString(3, tunjanganj);
            pstm.setString(4, tanak);
            pstm.setString(5, tkesehatan);
            pstm.setString(6, pdinas);
            pstm.setString(7, id);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Berhasil");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_updateActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
         String id = jabatan.getText().trim();
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nggak Boleh kosong");
            return;
        }
        try{
            sql = "DELETE FROM tabel_jabatan WHERE id_jabatan= ?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, id);
            pstm.execute();
             JOptionPane.showMessageDialog(null, "Data Berhasil Di hapus");
             load_table();
             kosong();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new FormMenu().setVisible(true);
    }//GEN-LAST:event_keluarActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int row = tabel.rowAtPoint(evt.getPoint());
        jabatan.setText(tabel.getValueAt(row, 0).toString());
        njabatan.setText(tabel.getValueAt(row, 1).toString());
        pokok.setText(tabel.getValueAt(row, 2).toString());
        tunjangan.setText(tabel.getValueAt(row, 3).toString());
        anak.setText(tabel.getValueAt(row, 4).toString());
        kesehatan.setText(tabel.getValueAt(row, 5).toString());
        dinas.setText(tabel.getValueAt(row, 6).toString());
    }//GEN-LAST:event_tabelMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormJabatan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anak;
    private javax.swing.JButton cari;
    private javax.swing.JTextField dinas;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jabatan;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField kesehatan;
    private javax.swing.JTextField njabatan;
    private javax.swing.JTextField pokok;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tunjangan;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
