package GamePayments;

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class Transaksi extends javax.swing.JFrame {
    DefaultTableModel Keranjang, Histori;    
    koneksi konek = new koneksi();
    
    public Transaksi() {
        konek.koneksi();
        initComponents();        
        tampil_keranjang();
        tampil_histori() ;       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        cmbPaymentMethod = new javax.swing.JComboBox<>();
        lblPayment = new javax.swing.JLabel();
        txtTotalHarga = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTrolley = new javax.swing.JTable();
        btnBayar = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbHistori = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel2.setText("TRANSAKSI PEMBAYARAN");

        lblTotal.setText("Total Harga");

        cmbPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transfer Bank", "Pulsa", "Bayar di Gerai Minimarket" }));
        cmbPaymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaymentMethodActionPerformed(evt);
            }
        });

        lblPayment.setText("Metode Pembayaran");

        txtTotalHarga.setEditable(false);
        txtTotalHarga.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbTrolley.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "kode transaksi", "tgl transaksi", "ID Game", "Nama Game", "Jumlah Item", "Nama Item", "Harga per Item", "Totall harga per Item"
            }
        ));
        tbTrolley.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(tbTrolley);

        btnBayar.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Montserrat Light", 0, 18)); // NOI18N
        btnClear.setText("Clear ");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal)
                            .addComponent(lblPayment))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalHarga)
                            .addComponent(cmbPaymentMethod, 0, 191, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal)
                            .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPayment)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Keranjang Transaksi", jPanel2);

        tbHistori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "kode payment", "Nama Game", "ID Game", "Nama Item", "Kode Reddem", "Waktu Pemesanan", "Total harga Item", "Metode Pembayaran"
            }
        ));
        tbHistori.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(tbHistori);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("History Transaksi", jPanel5);

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Keranjang");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new buygames().setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        if (cmbPaymentMethod.getSelectedItem().equals("-Pilih Metode Pembayaran")) {
            JOptionPane.showMessageDialog(this, "Metode Pembayaran belum dipilih");
        } else {
            String TotalHarga, MetodePembayaran, sql;           
            TotalHarga = txtTotalHarga.getText();
            MetodePembayaran = cmbPaymentMethod.getSelectedItem().toString();

            sql = "INSERT INTO mspayment(waktu_pemesanan,jam_pemesanan, total_harga, metodepembayaran )"
                    + "VALUES(CURDATE(),CURTIME(),'"+TotalHarga+"','"+MetodePembayaran+"')";
            try{
                konek.st = konek.conn.createStatement();
                konek.st.execute(sql);
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(this, "Data gagal disimpan"+e);
                return;
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        }
        resetTable();
        tampil_keranjang();
        tampil_histori() ;                
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        txtTotalHarga.setText("");
        cmbPaymentMethod.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void cmbPaymentMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaymentMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaymentMethodActionPerformed
   
    public void resetTable(){
        txtTotalHarga.setText("");
        cmbPaymentMethod.setSelectedIndex(0);
        Keranjang = (DefaultTableModel) tbTrolley.getModel();
        Histori = (DefaultTableModel) tbHistori.getModel();
        int rowCount1 = Keranjang.getRowCount();
        int rowCount2 = Histori.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount1 - 1; i >= 0; i--) {
            Keranjang.removeRow(i);
        }
        for (int i = rowCount2 - 1; i >= 0; i--) {
            Histori.removeRow(i);
        }
    }    
    
    public void tampil_keranjang()
    {
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);

        Keranjang = (DefaultTableModel) tbTrolley.getModel();    
        tbTrolley.setModel(Keranjang);
        try {
            konek.st = konek.conn.createStatement();
            String query 
            = "SELECT * FROM mstransaksi WHERE tgl_transaksi = CURDATE() ORDER BY jam_transaksi = CURTINE() DESC";
            konek.rs = konek.st.executeQuery(query);
            int i = 0;
            while (konek.rs.next()) {
                i++;
                String kodetransaksi = konek.rs.getString("kodetransaksi");
                String tgl_transaksi = konek.rs.getString("tgl_transaksi");
                String id_Game = konek.rs.getString("id_Game");
                String nama_game = konek.rs.getString("nama_game");
                String nama_item = konek.rs.getString("nama_item");       
                String jumlah_item = konek.rs.getString("jumlah_item");   
                String harga_per_item = konek.rs.getString("harga_per_item"); 
                String total_harga_item = konek.rs.getString("total_harga_item");
                Double hargaPerItem = Double.parseDouble(harga_per_item);
                String hargaPerItem_final = (rupiah.format(hargaPerItem));
                Double TotalHargaItem = Double.parseDouble(total_harga_item);
                String TotalHargaItem_final = (rupiah.format(TotalHargaItem));
                
                String [] data = {kodetransaksi, tgl_transaksi, id_Game, nama_game, nama_item, 
                                    jumlah_item, harga_per_item, total_harga_item };
                Keranjang.addRow(data);
            }
            if (i==0) {
                JOptionPane.showMessageDialog(this, "Hari ini belum ada Transaksi");
            }    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }        
        try{
            konek.st = konek.conn.createStatement();
            String query_total 
            = "SELECT SUM(total_harga_item) total_harga FROM mstransaksi WHERE tgl_transaksi = CURDATE() ORDER BY jam_transaksi = CURTIME() DESC";
            konek.rs = konek.st.executeQuery(query_total);
            while (konek.rs.next()) {
                String total_harga_item = konek.rs.getString("total_harga");
                Double TotalHargaItem = Double.parseDouble(total_harga_item);
                String TotalHargaItem_final = (rupiah.format(TotalHargaItem));
                txtTotalHarga.setText(TotalHargaItem_final);
            }
        } catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Gagal ambil total transaksi"+ex);
        }        
    }
    
    public void tampil_histori()
    {
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);        
        
        Histori = (DefaultTableModel) tbHistori.getModel();    
        tbHistori.setModel(Histori);
        try {
            konek.st = konek.conn.createStatement();
            String query 
            = "SELECT * FROM ms_payment WHERE waktu_pemesanan = CURDATE() ORDER BY jam_pemesanan CURTIME() DESC";
            konek.rs = konek.st.executeQuery(query);
            int i = 0;
            while (konek.rs.next()) {
                i++;
                String kode_payment = konek.rs.getString("kode_payment");
                String nama_game = konek.rs.getString("nama_game");
                String id_Game = konek.rs.getString("id_Game");                
                String nama_item = konek.rs.getString("nama_item");       
                String kode_reddem = konek.rs.getString("kode_reddem");   
                String waktu_pemesanan = konek.rs.getString("waktu_pemesanan");
                String jam_pemesanan = konek.rs.getString("jam_pemesanan");
                String total_harga = konek.rs.getString("total_harga");
                Double TotalHarga = Double.parseDouble(total_harga);
                String TotalHarga_final = (rupiah.format(TotalHarga));
                String metode_pembayaran = konek.rs.getString("metode_pembayaran");                
                
                String [] data = {kode_payment, nama_game, id_Game, nama_item, 
                                  kode_reddem, waktu_pemesanan, jam_pemesanan, total_harga, metode_pembayaran };
                Histori.addRow(data);
            }
            if (i==0) {
                JOptionPane.showMessageDialog(this, "Hari ini belum ada Transaksi");
            }               
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }                       
    }  
    
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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox<String> cmbPaymentMethod;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblPayment;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tbHistori;
    private javax.swing.JTable tbTrolley;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
