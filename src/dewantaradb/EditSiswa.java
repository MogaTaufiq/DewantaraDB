/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dewantaradb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author MogaTaufiq
 */
public class EditSiswa extends javax.swing.JFrame {
    private static final String JDBC_URL = "jdbc:sqlserver://localhost:1433;encrypt=true; trustServerCertificate=true;databaseName=Dewantara";
    private static final String USER = "sa";
    private static final String PASSWORD = "reallyStrongPwd123";
    

    public void setNIS(String nis) {
        editNis.setText(nis);
    }

    public void setNama(String nama) {
        editNama.setText(nama);
    }

    public void setGender(String gender) {
        editGender.setSelectedItem(gender);
    }

    public void setTempat(String tempat) {
        editTempat.setText(tempat);
    }

    public void setTanggalLahir(Date tanggalLahir) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Choose your desired date format
        editTanggal.setText(dateFormat.format(tanggalLahir));
    }

    public void setAlamat(String alamat) {
        editAlamat.setText(alamat);
    }

    public void setNoTelp(String noTelp) {
        editNoTelp.setText(noTelp);
    }
    
    public EditSiswa() {
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

        panel = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        editNis = new javax.swing.JLabel();
        editNama = new javax.swing.JTextField();
        editGender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        editAlamat = new javax.swing.JTextArea();
        editTempat = new javax.swing.JTextField();
        editTanggal = new javax.swing.JTextField();
        editNoTelp = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(210, 227, 200));

        jLabel57.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(134, 156, 109));
        jLabel57.setText("Edit Data");

        jLabel58.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel58.setText("Nama                      :");

        jLabel59.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel59.setText("NIS                          :");

        jLabel60.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel60.setText("Gender                   : ");

        jLabel61.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel61.setText("Tempat                   :");

        jLabel62.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel62.setText("Tanggal Lahir       :");

        jLabel63.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel63.setText("Alamat                    :");

        jLabel64.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel64.setText("No Telp                  : ");

        jButton8.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jButton8.setText("Close");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        editNis.setText("jLabel9");

        editNama.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N

        editGender.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        editGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L", "P" }));
        editGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editGenderActionPerformed(evt);
            }
        });

        editAlamat.setColumns(20);
        editAlamat.setRows(5);
        jScrollPane1.setViewportView(editAlamat);

        editTempat.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N

        editTanggal.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N

        editNoTelp.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N

        jButton9.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        jButton9.setText("Edit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel63)
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editNama, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editNis, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editGender, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                        .addComponent(jLabel61)
                                        .addGap(18, 18, 18)
                                        .addComponent(editTempat))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                        .addComponent(jLabel64)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(editNoTelp))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                        .addComponent(jLabel62)
                                        .addGap(18, 18, 18)
                                        .addComponent(editTanggal)))
                                .addGap(27, 27, 27)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel57)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(editNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(editNis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(editGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(editTempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(editTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(editNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //        Frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    String nama = editNama.getText();
    String gender = editGender.getSelectedItem().toString();
    String tempat = editTempat.getText();
    String tanggalLahirStr = editTanggal.getText();
    String alamat = editAlamat.getText();
    String noTelp = editNoTelp.getText();

    try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date tanggalLahir = dateFormat.parse(tanggalLahirStr);

        editDataSiswa(nama, gender, tempat, tanggalLahir, alamat, noTelp);

        this.dispose();
    } catch (ParseException ex) {
        ex.printStackTrace();
        // Handle parsing exception, jika diperlukan
    }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void editGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editGenderActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void editDataSiswa(String nama, String gender, String tempat, Date tanggalLahir, String alamat, String noTelp) {
    try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
        String query = "UPDATE Siswa SET Nama=?, Gender=?, Tempat=?, TanggalLahir=?, Alamat=?, noTelp=? WHERE NIS=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, nama);
            preparedStatement.setString(2, gender);
            preparedStatement.setString(3, tempat);
            preparedStatement.setDate(4, new java.sql.Date(tanggalLahir.getTime()));
            preparedStatement.setString(5, alamat);
            preparedStatement.setString(6, noTelp);
            preparedStatement.setString(7, editNis.getText());

            preparedStatement.executeUpdate();
        }
        
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, ex, "Peringatan", JOptionPane.WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(EditSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea editAlamat;
    private javax.swing.JComboBox<String> editGender;
    private javax.swing.JTextField editNama;
    private javax.swing.JLabel editNis;
    private javax.swing.JTextField editNoTelp;
    private javax.swing.JTextField editTanggal;
    private javax.swing.JTextField editTempat;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
