import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
public class FormDivisi extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormDivisi.class.getName());

    Connection con;
    Statement stm;
    PreparedStatement pstm;
    ResultSet rs;
    String sql;
    public FormDivisi() {
        initComponents();
        koneksi DBS = new koneksi();
        DBS.config();
        con = DBS.con;
        stm = DBS.stm;
        load_table();
        kosong();
    }

    private void load_table(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id Divisi");
        model.addColumn("Nama Divisi");
        model.addColumn("Honor Divisi");
        try{
            sql = "select * from tabel_divisi order by id_divisi asc";
            rs = stm.executeQuery(sql);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3)
                });
            }
            tabel.setModel(model);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data Ditemukan" + e.getMessage());
        }
    }
    
    private void kosong(){
        id.setText(null);
        divisi.setText(null);
        honor.setText(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        divisi = new javax.swing.JTextField();
        honor = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        update = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        cari = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Divisi");

        jLabel1.setText("ID DIVISI");

        jLabel2.setText("NAMA DIVISI");

        jLabel3.setText("HONOR DIVISI");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        divisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisiActionPerformed(evt);
            }
        });

        honor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                honorActionPerformed(evt);
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

        cari.setText("CARI");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tambah)
                        .addGap(96, 96, 96)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hapus)
                        .addGap(79, 79, 79)
                        .addComponent(keluar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(honor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(divisi, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cari))))
                    .addComponent(jScrollPane1))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(divisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(honor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        honor.requestFocus();
    }//GEN-LAST:event_divisiActionPerformed

    private void honorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_honorActionPerformed
        // TODO add your handling code here:
        tambah.doClick();
    }//GEN-LAST:event_honorActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        String idiv = id.getText().trim();
        String ndivisi = divisi.getText().trim();
        String hdivisi = honor.getText().trim();
         if(idiv.isEmpty() || ndivisi.isEmpty() || hdivisi.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nggak Boleh kosong");
            return;
        }
         try{
            sql = "INSERT INTO tabel_divisi (id_divisi, nama_divisi, honor_divisi) VALUES (?, ?, ?)";
            pstm = con.prepareStatement(sql);
            pstm.setString(1,idiv);
            pstm.setString(2,ndivisi);
            pstm.setString(3,hdivisi);
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
        String idiv = id.getText().trim();
        String ndivisi = divisi.getText().trim();
        String hdivisi = honor.getText().trim();
         if(idiv.isEmpty() || ndivisi.isEmpty() || hdivisi.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nggak Boelh kosong");
            return;
        }
         try{
             sql = "UPDATE tabel_divisi SET nama_divisi = ?, honor_divisi = ? WHERE id_divisi = ?";
             pstm = con.prepareStatement(sql);
             pstm.setString(1,ndivisi);
             pstm.setString(2,hdivisi);
             pstm.setString(3,idiv);
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
        String idiv = id.getText().trim();
        if(idiv.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nggak Boelh kosong");
            return;
        }
        try{
            sql = "DELETE FROM tabel_divisi WHERE id_divisi= ?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, idiv);
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
        int row = tabel.getSelectedRow();
        if(row != -1){
            id.setText(tabel.getValueAt(row, 0).toString());
            divisi.setText(tabel.getValueAt(row, 1).toString());
            honor.setText(tabel.getValueAt(row, 2).toString());
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        String idiv = id.getText().trim();
        if(idiv.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nggak Boleh kosong");
            return;
        }
        
     try{
         sql = "select * from tabel_divisi where id_divisi = ?";
         pstm = con.prepareStatement(sql);
         pstm.setString(1, idiv);
         rs = pstm.executeQuery();
         if(rs.next()){
             divisi.setText(rs.getString("nama_divisi"));
             honor.setText(rs.getString("honor_divisi"));
         }else{
             JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan");
             kosong();
         }
     }catch(Exception e){
         JOptionPane.showMessageDialog(this, e.getMessage());
     }
    }//GEN-LAST:event_cariActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new FormDivisi().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JTextField divisi;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField honor;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton keluar;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tambah;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
