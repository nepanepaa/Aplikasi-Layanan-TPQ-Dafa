
package Komponen;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import Koneksi.KoneksiDB_Guru;
import javax.swing.JFrame;

public class AgendaGuru extends javax.swing.JFrame {
private Connection conn = new KoneksiDB_Guru().getKoneksi();
private DefaultTableModel tabmode;

    
    public AgendaGuru() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        kosong();
        aktif();
        datatable();
          
    }

     protected void aktif(){
        txt_no.requestFocus();
    }

      protected void kosong(){
        txt_no.setText("");
        txt_hari.setText("");
        txt_kegiatan.setText("");
        txt_keterangan.setText("");
        
    }
      
        protected void datatable(){
        Object[] Baris ={"No.","Hari/Tanggal","Kegiatan","Keterangan"}; //nama kolom tabel di form
        tabmode = new DefaultTableModel (null, Baris);
        //tableagenda.setModel(tabmode);

          try {
            String sql = "SELECT * FROM kegiatan where 1";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                tabmode.addRow(new Object[]{
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4)
                });
            }
            tbl_guru.setModel(tabmode);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null,"data gagal dipanggil"+e);
        }
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
        txt_no = new javax.swing.JTextField();
        txt_hari = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_kegiatan = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_keterangan = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_guru = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnListAgenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Data Agenda Guru");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel1)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 920, 101);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("No.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(33, 130, 24, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Hari/Tanggal");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(33, 190, 90, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Kegiatan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(33, 280, 61, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Keterangan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(33, 394, 79, 20);
        getContentPane().add(txt_no);
        txt_no.setBounds(155, 130, 80, 22);

        txt_hari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hariActionPerformed(evt);
            }
        });
        txt_hari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_hariKeyTyped(evt);
            }
        });
        getContentPane().add(txt_hari);
        txt_hari.setBounds(155, 190, 257, 46);

        simpan.setBackground(new java.awt.Color(0, 0, 255));
        simpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        simpan.setForeground(new java.awt.Color(255, 255, 255));
        simpan.setText("Save");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan);
        simpan.setBounds(160, 510, 72, 22);

        batal.setBackground(new java.awt.Color(255, 0, 51));
        batal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        batal.setForeground(new java.awt.Color(255, 255, 255));
        batal.setText("Cancel");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        getContentPane().add(batal);
        batal.setBounds(250, 510, 72, 22);

        keluar.setBackground(new java.awt.Color(255, 204, 0));
        keluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        keluar.setForeground(new java.awt.Color(255, 255, 255));
        keluar.setText("Back");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(340, 510, 72, 22);

        txt_kegiatan.setColumns(20);
        txt_kegiatan.setRows(5);
        jScrollPane2.setViewportView(txt_kegiatan);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(155, 280, 257, 108);

        txt_keterangan.setColumns(20);
        txt_keterangan.setRows(5);
        jScrollPane3.setViewportView(txt_keterangan);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(155, 394, 257, 86);

        tbl_guru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Hari/Tanggal", "Kegiatan", "Keterangan"
            }
        ));
        tbl_guru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_guruMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_guru);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(470, 190, 380, 290);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 897, 676, 100);

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 610, 920, 40);

        btnListAgenda.setBackground(new java.awt.Color(0, 255, 204));
        btnListAgenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListAgenda.setText("List Agenda");
        btnListAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnListAgenda);
        btnListAgenda.setBounds(750, 510, 100, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:a
          String sql = "insert into kegiatan values (?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txt_no.getText());
            stat.setString(2, txt_hari.getText());
            stat.setString(3, txt_kegiatan.getText());
            stat.setString(4, txt_keterangan.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
            kosong();
            txt_no.requestFocus();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "data gagal disimpan");
        }
        datatable(); 
    }//GEN-LAST:event_simpanActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        
        kosong();
        datatable();
    }//GEN-LAST:event_batalActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed

         dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void txt_hariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hariActionPerformed
     
    }//GEN-LAST:event_txt_hariActionPerformed

    private void txt_hariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hariKeyTyped
        
         if(txt_hari.getText().length()>50){
            // Your Command, for examples :
            JOptionPane.showMessageDialog(null,"Maaf Karakter Terlalu Panjang !");
            evt.consume(); //--- Karakter tidak akan di Input
        } 
    }//GEN-LAST:event_txt_hariKeyTyped

    private void tbl_guruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_guruMouseClicked
        
         int bar = tbl_guru.getSelectedRow();
        String a = tbl_guru.getValueAt(bar, 0).toString();
        String b = tbl_guru.getValueAt(bar, 1).toString();
        String c = tbl_guru.getValueAt(bar, 2).toString();
        String d = tbl_guru.getValueAt(bar, 3).toString();
        
        txt_no.setText(a);
        txt_hari.setText(b);
        txt_kegiatan.setText(c);
        txt_keterangan.setText(d);
    
    }//GEN-LAST:event_tbl_guruMouseClicked

    private void btnListAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListAgendaActionPerformed
        // TODO add your handling code here:
        ListAgenda list = new ListAgenda();
        list.setLocationRelativeTo(this);
        list.setVisible(true);
    }//GEN-LAST:event_btnListAgendaActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaGuru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton btnListAgenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton keluar;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tbl_guru;
    private javax.swing.JTextField txt_hari;
    private javax.swing.JTextArea txt_kegiatan;
    private javax.swing.JTextArea txt_keterangan;
    private javax.swing.JTextField txt_no;
    // End of variables declaration//GEN-END:variables
}
