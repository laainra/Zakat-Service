
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class zakatemas extends javax.swing.JFrame {

    /**
     * Creates new form zakatfitrah
     */
    public zakatemas() {
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
        kalkulatorzakatemas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jumlahemasdalamgram = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        tabelhasil = new javax.swing.JTextField();
        hasil = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        wajibbayar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        catatan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lamasimpan = new javax.swing.JTextField();
        kembali = new javax.swing.JButton();
        lanjutpendataan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KALKULATOR ZAKAT EMAS");
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(74, 38, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        kalkulatorzakatemas.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        kalkulatorzakatemas.setForeground(new java.awt.Color(255, 255, 255));
        kalkulatorzakatemas.setText("KALKULATOR ZAKAT EMAS");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jumlah Emas (dalam gram)");

        hitung.setBackground(new java.awt.Color(153, 153, 255));
        hitung.setText("Hitung");
        hitung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        tabelhasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabelhasilActionPerformed(evt);
            }
        });

        hasil.setBackground(new java.awt.Color(255, 255, 255));
        hasil.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        hasil.setForeground(new java.awt.Color(255, 255, 255));
        hasil.setText("Hasil");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Wajib Bayar?");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Catatan");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Lama Simpan (dalam bulan)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(kalkulatorzakatemas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(wajibbayar, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(catatan)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lamasimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahemasdalamgram, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(hitung))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(hasil))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(tabelhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(kalkulatorzakatemas)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jumlahemasdalamgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hitung)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wajibbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(68, 68, 68))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lamasimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(catatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)))
                .addComponent(hasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabelhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 500, 440));

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
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

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
        getContentPane().add(lanjutpendataan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 590, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ramadan-kareem-greeting-card-decorated-with-arabic-lanterns-vector.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jLabel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jLabel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-410, -270, 1510, 970));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelhasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabelhasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelhasilActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        new Kalkulator().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void lanjutpendataanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanjutpendataanActionPerformed
        // TODO add your handling code here:
        new datazakat().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_lanjutpendataanActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        
       DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
       DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

       formatRp.setCurrencySymbol("Rp. ");
       formatRp.setMonetaryDecimalSeparator(',');
       formatRp.setGroupingSeparator('.');

       kursIndonesia.setDecimalFormatSymbols(formatRp);
       int lama,a,b;
       double c;
       lama = Integer.valueOf(lamasimpan.getText());
       a = Integer.valueOf(jumlahemasdalamgram.getText());
       b = 940000;
       c = 0.025*a*b;
      
       if (lama>12 && a>85) {
           wajibbayar.setText("Wajib Membayar Zakat");
           catatan.setText("Harga 1 gram emas saat ini: Rp. 940.000,-");
           tabelhasil.setText(String.valueOf(kursIndonesia.format(c)));
       
       } else {
           wajibbayar.setText("Tidak Wajib Bayar tetapi BoLeh Infaq");
           catatan.setText("Harga 1 gram emas saat ini: Rp. 940.000,-");
           tabelhasil.setText(String.valueOf(kursIndonesia.format(c)));
       
       }
       
       
    }//GEN-LAST:event_hitungActionPerformed

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
            java.util.logging.Logger.getLogger(zakatfitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zakatfitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zakatfitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zakatfitrah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new zakatemas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField catatan;
    private javax.swing.JLabel hasil;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jumlahemasdalamgram;
    private javax.swing.JLabel kalkulatorzakatemas;
    private javax.swing.JButton kembali;
    private javax.swing.JTextField lamasimpan;
    private javax.swing.JButton lanjutpendataan;
    private javax.swing.JTextField tabelhasil;
    private javax.swing.JTextField wajibbayar;
    // End of variables declaration//GEN-END:variables
}