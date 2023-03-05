
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
public class zakatfitrah extends javax.swing.JFrame {

    /**
     * Creates new form zakatfitrah
     */
    public zakatfitrah() {
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

        jumlahorang = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jumlah = new javax.swing.JTextField();
        zakatberas = new javax.swing.JButton();
        zakatuang = new javax.swing.JButton();
        hasil = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator Zakat Fitrah");
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jumlahorang.setBackground(new java.awt.Color(74, 38, 102));
        jumlahorang.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("KALKULATOR ZAKAT FITRAH");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jumlah Orang");

        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });

        zakatberas.setBackground(new java.awt.Color(153, 153, 255));
        zakatberas.setText("Zakat Beras");
        zakatberas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zakatberas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zakatberasActionPerformed(evt);
            }
        });

        zakatuang.setBackground(new java.awt.Color(153, 153, 255));
        zakatuang.setText("Zakat Uang");
        zakatuang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zakatuang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zakatuangActionPerformed(evt);
            }
        });

        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(102, 0, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hasil");

        javax.swing.GroupLayout jumlahorangLayout = new javax.swing.GroupLayout(jumlahorang);
        jumlahorang.setLayout(jumlahorangLayout);
        jumlahorangLayout.setHorizontalGroup(
            jumlahorangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jumlahorangLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(zakatberas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(zakatuang)
                .addGap(53, 53, 53))
            .addGroup(jumlahorangLayout.createSequentialGroup()
                .addGroup(jumlahorangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jumlahorangLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addGroup(jumlahorangLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jumlahorangLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel4))
                    .addGroup(jumlahorangLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)
                        .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jumlahorangLayout.setVerticalGroup(
            jumlahorangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jumlahorangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(jumlahorangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jumlahorangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zakatberas)
                    .addComponent(zakatuang))
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jumlahorang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 410, 390));

        back.setBackground(new java.awt.Color(102, 0, 255));
        back.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left-48.png"))); // NOI18N
        back.setText("Kembali");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        next.setBackground(new java.awt.Color(102, 0, 255));
        next.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left-48 - Copy.png"))); // NOI18N
        next.setText("Lanjut Pendataan");
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 560, -1, -1));

        jLabel1.setBackground(new java.awt.Color(102, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ramadan-kareem-greeting-card-decorated-with-arabic-lanterns-vector.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        jLabel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        jLabel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-410, -270, 1510, 970));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new Kalkulator().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        new pendataan().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_nextActionPerformed

    private void zakatberasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zakatberasActionPerformed
        // TODO add your handling code here:
        
        int a,b,c;
        a = 3;
        b = Integer.valueOf(jumlah.getText());
        c = a*b;
        
        hasil.setText(""+c+ " kg");
        
    }//GEN-LAST:event_zakatberasActionPerformed

    private void zakatuangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zakatuangActionPerformed
        // TODO add your handling code here:
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        int a,b,c;
        a = 30000;
        b = Integer.valueOf(jumlah.getText());
        c = a*b;
 
        
        hasil.setText(String.valueOf(kursIndonesia.format(c)) );
    }//GEN-LAST:event_zakatuangActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

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
                new zakatfitrah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jumlah;
    private javax.swing.JPanel jumlahorang;
    private javax.swing.JButton next;
    private javax.swing.JButton zakatberas;
    private javax.swing.JButton zakatuang;
    // End of variables declaration//GEN-END:variables
}
