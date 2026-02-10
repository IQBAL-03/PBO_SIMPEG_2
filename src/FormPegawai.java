import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;
public class FormPegawai extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormPegawai.class.getName());

    Connection con;
    Statement stm;
    PreparedStatement pstm;
    ResultSet  rs;
    String sql;
    public FormPegawai() {
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
    tableModel.addColumn("ID PEGAWAI");
    tableModel.addColumn("ID DIVISI");
    tableModel.addColumn("ID JABATAN");
    tableModel.addColumn("NAMA");
    tableModel.addColumn("ALAMAT");
    tableModel.addColumn("USIA");

    try {
        sql = "SELECT * FROM tabel_pegawai order by id_pegawai asc";
        rs = stm.executeQuery(sql);
        while (rs.next()) {
            tableModel.addRow(new Object[]{
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6)
            });
        }
        tabel.setModel(tableModel);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
}
    private void kosong() {
    id.setText(null);
    divisi.setText(null);
    jabatan.setText(null);
    nama.setText(null);
    alamat.setText(null);
    usia.setText(null);
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
        divisi = new javax.swing.JTextField();
        jabatan = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        usia = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pegawai");

        jLabel1.setText("ID PEGAWAI");

        jLabel2.setText("ID DIVISI");

        jLabel3.setText("ID JABATAN");

        jLabel4.setText("NAMA");

        jLabel5.setText("ALAMAT");

        jLabel6.setText("USIA");

        divisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisiActionPerformed(evt);
            }
        });

        jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatanActionPerformed(evt);
            }
        });

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });

        usia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usiaActionPerformed(evt);
            }
        });

        cari.setText("CARI");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
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

        close.setText("KELUAR");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
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
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tambah)
                        .addGap(107, 107, 107)
                        .addComponent(update)
                        .addGap(92, 92, 92)
                        .addComponent(hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(close))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(divisi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jabatan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alamat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cari))))
                    .addComponent(jScrollPane1))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cari)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(divisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(usia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update)
                    .addComponent(tambah)
                    .addComponent(close)
                    .addComponent(hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
        divisi.requestFocus();
    }//GEN-LAST:event_idActionPerformed

    private void divisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisiActionPerformed
        // TODO add your handling code here:
        jabatan.requestFocus();
    }//GEN-LAST:event_divisiActionPerformed

    private void jabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatanActionPerformed
        // TODO add your handling code here:
        nama.requestFocus();
    }//GEN-LAST:event_jabatanActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
        alamat.requestFocus();
    }//GEN-LAST:event_namaActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
        usia.requestFocus();
    }//GEN-LAST:event_alamatActionPerformed

    private void usiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usiaActionPerformed
        // TODO add your handling code here:
        tambah.doClick();
    }//GEN-LAST:event_usiaActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        String idpeg = id.getText().trim();
        String idivisi = divisi.getText().trim();
        String ijabatan = jabatan.getText().trim();
        String inama = nama.getText().trim();
        String ialamat = alamat.getText().trim();
        String iusia = usia.getText().trim();
        if(idivisi.isEmpty() || inama.isEmpty() || ialamat.isEmpty() || iusia.isEmpty() || idpeg.isEmpty() || ijabatan.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nggak Boelh kosong");
            return;
        }
        try{
            sql = "INSERT INTO tabel_pegawai (id_pegawai, id_divisi, id_jabatan, nama, alamat, usia) VALUES (?, ?, ?, ?, ?, ?)";
            pstm = con.prepareStatement(sql);
            pstm.setString(1,idpeg);
            pstm.setString(2,idivisi);
            pstm.setString(3,ijabatan);
            pstm.setString(4,inama);
            pstm.setString(5,ialamat);
            pstm.setString(6,iusia);
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
        String idpeg = id.getText().trim();
        String idivisi = divisi.getText().trim();
        String ijabatan = jabatan.getText().trim();
        String inama = nama.getText().trim();
        String ialamat = alamat.getText().trim();
        String iusia = usia.getText().trim();
        if(idivisi.isEmpty() || inama.isEmpty() || ialamat.isEmpty() || iusia.isEmpty() || idpeg.isEmpty() || ijabatan.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nggak Boelh kosong");
            return;
        }
        try{
            sql = "UPDATE tabel_pegawai SET id_divisi = ?, id_jabatan = ?, nama = ?, alamat = ?, usia = ? WHERE id_pegawai = ?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, idivisi);
            pstm.setString(2, ijabatan);
            pstm.setString(3, inama);
            pstm.setString(4, ialamat);
            pstm.setString(5, iusia);
            pstm.setString(6, idpeg);
     
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
        String idpeg = id.getText().trim();
        if(idpeg.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nggak Boleh kosong");
            return;
        }
        try{
            sql = "DELETE FROM tabel_pegawai WHERE id_pegawai= ?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, idpeg);
            pstm.execute();
             JOptionPane.showMessageDialog(null, "Data Berhasil Di hapus");
             load_table();
             kosong();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new FormMenu().setVisible(true);
    }//GEN-LAST:event_closeActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        String idpeg = id.getText().trim();
        if(idpeg.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nggak Boleh kosong");
            return;
        }
        try{
            sql = "select * from tabel_pegawai where id_pegawai = ?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, idpeg);
            rs = pstm.executeQuery();
            if(rs.next()){
                divisi.setText(rs.getString("id_divisi"));
                jabatan.setText(rs.getString("id_jabatan"));
                nama.setText(rs.getString("nama"));
                alamat.setText(rs.getString("alamat"));
                usia.setText(rs.getString("usia"));
            }else{
                JOptionPane.showMessageDialog(null, "Data Ra ketemu");
                kosong();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
    }//GEN-LAST:event_cariActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int row = tabel.rowAtPoint(evt.getPoint());
        id.setText(tabel.getValueAt(row, 0).toString());
        divisi.setText(tabel.getValueAt(row, 1).toString());
        jabatan.setText(tabel.getValueAt(row, 2).toString());
        nama.setText(tabel.getValueAt(row, 3).toString());
        alamat.setText(tabel.getValueAt(row, 4).toString());
        usia.setText(tabel.getValueAt(row, 5).toString());
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
        java.awt.EventQueue.invokeLater(() -> new FormPegawai().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton cari;
    private javax.swing.JButton close;
    private javax.swing.JTextField divisi;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jabatan;
    private javax.swing.JTextField nama;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tambah;
    private javax.swing.JButton update;
    private javax.swing.JTextField usia;
    // End of variables declaration//GEN-END:variables
}
