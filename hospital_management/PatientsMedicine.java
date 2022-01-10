/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getInt;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumit
 */
public class PatientsMedicine extends javax.swing.JFrame {

    /**
     * Creates new form PatientsMedicine
     */
    public PatientsMedicine() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("PHARMACEUTICAL STORE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 21, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 39, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Enter Patient ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 176, -1, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 174, 126, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(926, 174, 121, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CROCINE", "ASPIRIN", "NAMOSLATE", "GLUCOSE", "TARIVID", "CANESTEN", "DICLOFENAC", "ANTACIDS", "VERMOX", "OVEX", "OMEE", "AVIL", "HIDRASEC", "UTINOR", "PARIET", "CIPROXIN", "CYPROSTAT", "ANDROCUR", "DESTOLIT", "URSOFALK", "ORS", "URSOGAL", "OMNI GEL", "DETTOL", "BETADINE", "LIVER-52", "METHYLPHENIDATE", "BETA-BLOCKER", "BENZODIAZEPINES", "Z-DRUG", "ANTIPSYCHOTIC", "SSRI-ANTIDEPRESSANT", "MAOI-DRUG", "BICASUL", "NASAL DECONGESTANTS", "EXPECTORANTS", "COUGH SUPRESSANTS", "ANTI HISTAMINES", "ACETAMINOPHEN", "HPV VACCINE", "SYRINGE", "INJECTION", "MORFIN", "ORLISTAT", "ZALASTA", "ZANTAC", "ZEFFIX", "ZINNAT", "ZOFRAN", "ZOCOR" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 237, 126, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Select Medicine");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 240, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sno.", "Medicine Name", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 292, 1247, 378));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 704, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 240, -1, -1));

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(926, 238, 121, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 176, 52, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 704, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital_management/login bg.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new PharmacyLogin().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmsproject", "root", "Sumit");
            Statement stmt = conn.createStatement();
            String query;
            String pi = jTextField1.getText();
            if (pi.equals(null)) {
                JOptionPane.showMessageDialog(null, "Enter a valid Patient ID");
            }
            int pid = Integer.parseInt(pi);
            query = "Select pid from patient where pid=" + pid + ";";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next() == false) {
                JOptionPane.showMessageDialog(null, "Patient ID not Registered");
            }
            else
            {
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
               for(int i=0;i<model.getRowCount();i++)
               {
                   String query1;
                   query1="Select mid from medicine where mname=\""+model.getValueAt(i, 1)+"\";";
                   ResultSet rs5=stmt.executeQuery(query1);
           rs5.next();
                query="insert into had_medicine values("+pid+","+rs5.getInt(1)+",CURRENT_TIMESTAMP,"+model.getValueAt(i,2)+");"; 
                stmt.executeUpdate(query);
               }
                                       JOptionPane.showMessageDialog(null,"Medicines are confirmed!");
                    }
            sno = 1;
            Arrays.fill(as,0);
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in connectivity");
        }
jButton3.doClick();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DateFormat dx = new SimpleDateFormat("yyyy/MM/dd");
        Date da = new Date();
        String a = dx.format(da);
        jTextField2.setText("" + a);
        jTextField3.setText("0");
        sno = 1;
        Arrays.fill(as, 0);

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        char ch = evt.getKeyChar();
        if (ch == '\n') {
            try {
                Class.forName("java.sql.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmsproject", "root", "Sumit");
                Statement stmt = conn.createStatement();
                String query;
                String pi = jTextField1.getText();
                if (pi.equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter a valid Patient ID");
                }
                int pid = Integer.parseInt(pi);
                query = "Select pid from patient where pid=" + pid + ";";
                ResultSet rs = stmt.executeQuery(query);
                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(null, "Patient ID not Registered");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error in connectivity");
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased
    int sno = 1;
    int as[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        char ch = evt.getKeyChar();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (ch == '\n') {
            System.out.println("" + ch);
            String pi = jTextField1.getText();
            if (pi.equals("")) {
                JOptionPane.showMessageDialog(null, "Enter Patient ID");
            } else {
                String str = jComboBox1.getSelectedItem().toString();
                int i = jComboBox1.getSelectedIndex();
                int qty = Integer.parseInt(jTextField3.getText());
                if(qty!=0){
                if (as[i] == 0){
                    as[i] += qty;
                    model.addRow(new Object[]{"" + sno, str, "" + as[i]});
                      sno++;
                } else {
                    as[i] += qty;
                    for (int j = 0; j < model.getRowCount(); j++) {
                        if (model.getValueAt(j, 1).equals(str)) {
                            model.setValueAt(as[i], j, 2);
                        }
                    }
                }
              
                }
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
jTextField1.setText(null);
jTextField3.setText("0");
jComboBox1.setSelectedIndex(0);
Arrays.fill(as,0);
DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
for(int i=model.getRowCount()-1;i>=0;i--)
{
    model.removeRow(i);
}

// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PatientsMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientsMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientsMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientsMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientsMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}