
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class zakattabungan extends javax.swing.JFrame {

    /**
     * Creates new form zakatpenghasilan
     */
    public zakattabungan() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jumlahtabungan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bunga = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        hasil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        note = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        wajibbayar = new javax.swing.JTextField();
        kembali = new javax.swing.JButton();
        lanjutpendataan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KALKULATOR ZAKAT TABUNGAN");
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(74, 38, 102));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("KALKULATOR ZAKAT TABUNGAN");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Jumlah Tabungan");

        jumlahtabungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahtabunganActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Bunga (Jika Ada)");

        bunga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bungaActionPerformed(evt);
            }
        });

        hitung.setBackground(new java.awt.Color(153, 153, 255));
        hitung.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        hitung.setText("Hitung");
        hitung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Hasil");

        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });

        jScrollPane1.setOpaque(false);

        note.setColumns(20);
        note.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        note.setRows(5);
        note.setText("Note:\n- Harga emas per gram saat ini Rp940.000 (www.harga-emas.org)\n- Nishab 85 gram per Tahun Rp79.900.000");
        jScrollPane1.setViewportView(note);

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Wajib Bayar");

        wajibbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wajibbayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bunga, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jumlahtabungan, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hitung)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(wajibbayar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hasil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jumlahtabungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bunga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hitung)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wajibbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 520, 450));

        kembali.setBackground(new java.awt.Color(102, 0, 255));
        kembali.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left-48.png"))); // NOI18N
        kembali.setText("Kembali");
        kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, -1));

        lanjutpendataan.setBackground(new java.awt.Color(102, 0, 255));
        lanjutpendataan.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lanjutpendataan.setForeground(new java.awt.Color(255, 255, 255));
        lanjutpendataan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left-48 - Copy.png"))); // NOI18N
        lanjutpendataan.setText("Lanjut Pendataan");
        lanjutpendataan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lanjutpendataan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanjutpendataanActionPerformed(evt);
            }
        });
        getContentPane().add(lanjutpendataan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ramadan-kareem-greeting-card-decorated-with-arabic-lanterns-vector.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jLabel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jLabel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-420, -150, 1500, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jumlahtabunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahtabunganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahtabunganActionPerformed

    private void bungaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bungaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bungaActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
       DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
       DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

       formatRp.setCurrencySymbol("Rp. ");
       formatRp.setMonetaryDecimalSeparator(',');
       formatRp.setGroupingSeparator('.');

       kursIndonesia.setDecimalFormatSymbols(formatRp);
       
       int a,b,c,nishab;
       nishab = 79900000;
       a = Integer.valueOf(jumlahtabungan.getText());
       b = Integer.valueOf(bunga.getText());
       c = a+b;
       double zakat = c*0.025;
       hasil.setText(String.valueOf(kursIndonesia.format(zakat)));;
       if (c>nishab){
           wajibbayar.setText("Wajib Bayar Zakat");
       
       }else {
           wajibbayar.setText("Tidak Wajib Bayar Zakat tapi Boleh Infaq");
       }
      
        
    }//GEN-LAST:event_hitungActionPerformed

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilActionPerformed

    private void wajibbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wajibbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wajibbayarActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        new Kalkulator().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void lanjutpendataanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanjutpendataanActionPerformed
        // TODO add your handling code here:
        new pendataan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lanjutpendataanActionPerformed

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
            java.util.logging.Logger.getLogger(zakatpenghasilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zakatpenghasilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zakatpenghasilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zakatpenghasilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new zakattabungan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bunga;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahtabungan;
    private javax.swing.JButton kembali;
    private javax.swing.JButton lanjutpendataan;
    private javax.swing.JTextArea note;
    private javax.swing.JTextField wajibbayar;
    // End of variables declaration//GEN-END:variables
}
