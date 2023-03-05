
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class datazakat extends javax.swing.JFrame {
    
    private void  showData(){
    DefaultTableModel tb = new DefaultTableModel();

    tb.addColumn("ID Zakat");
    tb.addColumn("Nama Muzakki");
    tb.addColumn("Tanggal Berzakat");
    tb.addColumn("Jenis Zakat");
    tb.addColumn("Bentuk Zakat");
    tb.addColumn("Besar Zakat");
    tb.addColumn("Status Penyaluran");
    
    try {
        
        
        String sql = "SELECT * FROM datazakat WHERE id_zakat='" + 
                txtcari.getText() +"%'" + "or nama_muzakki like '%" +txtcari.getText()+"%'";
        Connection con = koneksi.getKoneksi();
        Statement sta = (Statement) con.createStatement();
        ResultSet res = sta.executeQuery(sql);
        while (res.next()) {
            tb.addRow(new Object[]{ res.getString(1),
            res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7)});
        }
        tabzakat.setModel(tb);
    
    } catch (Exception e) {
  
    }
    } 
    
    public void clearForm() {
        idzakat.setText(null);
        namacombo.setSelectedIndex(0);
        jeniszakat.setSelectedIndex(0);
        status.setSelectedIndex(0);
        besarzakat.setText(null);
        
        
    
    }
    public void showCombo(){
       
        try {
            String sql = "SELECT * FROM tbmuzakki" ;
            Connection con = koneksi.getKoneksi();
            Statement sta = (Statement) con.createStatement();
            ResultSet res = sta.executeQuery(sql);
            while (res.next()) {
            namacombo.addItem(res.getString("nama_muzakki"));
        }
        } catch (SQLException ex) {
            
        }
        
    
    }
    public void showTgl(){
    Date dt = new Date();
    SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
    tanggal.setText(s.format(dt));
    }
    

    /**
     * Creates new form Kalkulator
     */
    public datazakat() {
        initComponents();
        this.setLocationRelativeTo(null);
        showData();
        showCombo();
        showTgl();
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
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabzakat = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        idzakat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        besarzakat = new javax.swing.JTextField();
        jeniszakat = new javax.swing.JComboBox<>();
        hapus = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        bersihkan = new javax.swing.JButton();
        tanggal = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        uangbtn = new javax.swing.JRadioButton();
        berasbtn = new javax.swing.JRadioButton();
        namacombo = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        print = new javax.swing.JButton();
        btncari = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PENDATAAN ZAKAT");
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PENDATAAN ZAKAT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        tabzakat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Zakat", "Nama Muzakki", "Tanggal Berzakat", "Jenis Zakat", "Bentuk Zakat", "Besar Zakat", "Status Penyaluran"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabzakat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabzakatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabzakat);
        if (tabzakat.getColumnModel().getColumnCount() > 0) {
            tabzakat.getColumnModel().getColumn(0).setPreferredWidth(3);
            tabzakat.getColumnModel().getColumn(5).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 980, 130));

        idzakat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idzakatActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("ID Zakat");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Nama Muzakki");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal Berzakat");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Jenis Zakat");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Besar Zakat");

        besarzakat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                besarzakatActionPerformed(evt);
            }
        });
        besarzakat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                besarzakatKeyTyped(evt);
            }
        });

        jeniszakat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jenis Zakat", "Zakat Fitrah", "Zakat Penghasilan", "Zakat Tabungan", "Zakat Perdagangan", "Zakat Emas" }));
        jeniszakat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        hapus.setText("Hapus");
        hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        simpan.setText("Simpan");
        simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        bersihkan.setText("Bersihkan");
        bersihkan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tanggal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yy"))));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Status Penyaluran");

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status Penyaluran", "Belum Disalurkan", "Telah Disalurkan" }));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setText("Bentuk Zakat");

        uangbtn.setText("Uang");
        uangbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uangbtnActionPerformed(evt);
            }
        });

        berasbtn.setText("Beras");
        berasbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berasbtnActionPerformed(evt);
            }
        });

        namacombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama" }));
        namacombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(45, 45, 45)
                        .addComponent(jeniszakat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(namacombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tanggal)
                                .addGap(7, 7, 7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(idzakat)
                                .addContainerGap())))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(simpan))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(hapus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bersihkan)
                                        .addGap(44, 44, 44)
                                        .addComponent(edit))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(151, 166, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(28, 28, 28)
                                .addComponent(uangbtn)
                                .addGap(27, 27, 27)
                                .addComponent(berasbtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(besarzakat, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(idzakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namacombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jeniszakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(uangbtn))
                    .addComponent(berasbtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(besarzakat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(hapus)
                    .addComponent(bersihkan)
                    .addComponent(edit))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 450, 310));

        jButton7.setBackground(new java.awt.Color(102, 0, 255));
        jButton7.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left-48 - Copy.png"))); // NOI18N
        jButton7.setText("Lanjut Pendataan");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, -1, -1));

        jButton6.setBackground(new java.awt.Color(102, 0, 255));
        jButton6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-left-48.png"))); // NOI18N
        jButton6.setText("Kembali");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, -1));

        print.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo print.png"))); // NOI18N
        print.setText("Print Laporan");
        print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 240, 50));

        btncari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search-outline-filled.png"))); // NOI18N
        btncari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 380, 40, 50));
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 200, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CARI ID");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgpurplemasjid.jpg"))); // NOI18N
        jLabel1.setText("Zakat Tabungan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-640, -180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CARI ID");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, -1, -1));

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgpurplemasjid.jpg"))); // NOI18N
        jLabel8.setText("CARI DATA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-640, -180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new penyaluranzakat().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new pendataan().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here: 
        
        String idza = idzakat.getText();
        String namamuz = (String) namacombo.getSelectedItem();
        String jza = (String) jeniszakat.getSelectedItem();
        String ben = null;
        String stat = (String) status.getSelectedItem();
        String tgl = tanggal.getText();
        String bztxt = besarzakat.getText();
        String bz = null;
        DefaultTableModel tbl = (DefaultTableModel) tabzakat.getModel();
        Connection con = koneksi.getKoneksi();
        
        if (uangbtn.isSelected()) {
            ben="Uang";
            bz = "Rp." + bztxt;
        } else if (berasbtn.isSelected()){
            ben="Beras";
            bz = bztxt + "Kg";
        }
        
        try {                                       
            Statement sta = (Statement) con.createStatement();
            String sql = "SELECT * FROM datazakat WHERE id_zakat='" + idza
                    + "'";
            ResultSet res = sta.executeQuery(sql);
            
            if(res.next()){
                
                JOptionPane.showMessageDialog(null,"ID Sudah Terdaftar", "Kesalahan",
                            JOptionPane.INFORMATION_MESSAGE);
                    clearForm();
            
            }
            else {
                try {
            
            String query = "INSERT INTO `datazakat`(`id_zakat`, `nama_muzakki`, `tanggal_zakat`, `jenis_zakat`, `bentuk_zakat`, `besar_zakat`, `status_penyaluran`) VALUES ('" 
                    +idza+
                    "','"+namamuz +
                    "','"+tgl +
                    "','"+jza+
                    "','"+ben+
                    "','"+bz+
                    "','"+stat+
                    "')";
            
            PreparedStatement ps = (PreparedStatement)con.prepareStatement(query);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
            clearForm();
            showData();
            
        } catch (SQLException ex) {
            
        }
            
            
            }
        
        } 
        
        catch (SQLException ex) {
           
        }
        
        
    }//GEN-LAST:event_simpanActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("reportzakat.jasper"), null, koneksi.getKoneksi());
            JasperViewer.viewReport(jp, false);
        } catch (JRException ex) {
            
        }
    }//GEN-LAST:event_printActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        String idza = idzakat.getText();
        String namamuz = (String) namacombo.getSelectedItem();
        String jza = (String) jeniszakat.getSelectedItem();
        String stat = (String) status.getSelectedItem();
        String tgl = tanggal.getText();
        String bz = besarzakat.getText();
        DefaultTableModel tbl = (DefaultTableModel) tabzakat.getModel();
        Connection con = koneksi.getKoneksi();
        
        try {                                       

            
            String query ="UPDATE `datazakat` SET `id_zakat`='" + idza
                    + "', `nama_muzzaki`='"+namamuz
                    + "', `tanggal_zakat`='"+tgl
                    + "', `jenis_zakat`='"+jza
                    + "', `besar_zakat`='"+bz
                    + "', `status_penyaluran`='"+ stat
                    +"' WHERE id_zakat='"+idza+"'";
            
            PreparedStatement ps = (PreparedStatement)con.prepareStatement(query);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Mengedit");
            clearForm();
            showData();
            
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        String idza = idzakat.getText();
         try {
            String sql = "DELETE FROM datazakat WHERE id_zakat='" + idza+"'";
            Connection con = koneksi.getKoneksi();
            PreparedStatement ps = (PreparedStatement)con.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Hapus Data");
            
        }catch (SQLException ex) {
            Logger.getLogger(datamustahik.class.getName()).log(Level.SEVERE, null, ex);
        }
        showData();
        clearForm();
    }//GEN-LAST:event_hapusActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM datazakat WHERE id_zakat='" + 
                txtcari.getText() +"%'" + "or nama_muzakki like '%" +txtcari.getText()+"%'"
                    + "or jenis_zakat like '%" +txtcari.getText()+"%'";
            Connection con = koneksi.getKoneksi();
            PreparedStatement ps = (PreparedStatement)con.prepareStatement(sql);
            ps.execute();
            
            
        } catch (SQLException ex) {
            
        }
        showData();
    }//GEN-LAST:event_btncariActionPerformed

    private void tabzakatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabzakatMouseClicked
        // TODO add your handling code here:
        int row =  tabzakat.rowAtPoint(evt.getPoint());
        String id_za = tabzakat.getValueAt(row, 0).toString();
        idzakat.setText(id_za);
        
        String nama = tabzakat.getValueAt(row, 1).toString();
        namacombo.setSelectedItem(nama);
        
        String tgl = tabzakat.getValueAt(row, 2).toString();
        tanggal.setText(tgl);

        String  jz = tabzakat.getValueAt(row, 3).toString();
        jeniszakat.setSelectedItem(jz);
        
       if ("Uang".equals(tabzakat.getValueAt(row, 4).toString())){
                uangbtn.setSelected(true);
        }else {
                berasbtn.setSelected(true);
        }
        String bz = tabzakat.getValueAt(row, 5).toString();
        besarzakat.setText(bz);

        String  st = tabzakat.getValueAt(row, 6).toString();
        status.setSelectedItem(st);
    }//GEN-LAST:event_tabzakatMouseClicked

    private void besarzakatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_besarzakatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_besarzakatActionPerformed

    private void besarzakatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_besarzakatKeyTyped
        // TODO add your handling code here:
       
        
        
        
    }//GEN-LAST:event_besarzakatKeyTyped

    private void berasbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berasbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_berasbtnActionPerformed

    private void uangbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uangbtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_uangbtnActionPerformed

    private void idzakatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idzakatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idzakatActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datazakat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton berasbtn;
    private javax.swing.JButton bersihkan;
    private javax.swing.JTextField besarzakat;
    private javax.swing.JButton btncari;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField idzakat;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jeniszakat;
    private javax.swing.JComboBox<String> namacombo;
    private javax.swing.JButton print;
    private javax.swing.JButton simpan;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable tabzakat;
    private javax.swing.JFormattedTextField tanggal;
    private javax.swing.JTextField txtcari;
    private javax.swing.JRadioButton uangbtn;
    // End of variables declaration//GEN-END:variables
}
