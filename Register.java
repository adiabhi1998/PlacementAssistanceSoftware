/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareproject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Color;
//import java.awt.*;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author adity
 */
public class Register extends javax.swing.JFrame {

    public static int x = 0;

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.ORANGE);
    }
    public void settext()
    {
        txt1.setText("Aditya23");
        txt2.setText("16CS100323");
        txt3.setText("Computer Science");
        txt4.setText("adiabhi23");
        txt5.setText("1234");
        txt6.setText("1234");
        cgpa.setText("9.54");
        
        
        
    }
    public int process()
    {
        int success=1;
         String name, dep, roll, username, passwd;
        name = txt1.getText();
        roll = txt2.getText();
        dep = txt3.getText();
        username = txt4.getText();
        passwd = txt5.getText();
        String passwd2 = txt6.getText();
        System.out.println(name);
        if (name.equals("") || roll.equals("") || dep.equals("") || username.equals("") || passwd.equals("") || passwd2.equals("")||cgpa.getText().equals("")) {
            
            label1.setText("All fields are mandatory");
            success=0;
        } else if (!passwd.equals(passwd2)) {
            label1.setText("Passwords do not match");
            success=0;
        } else {
            String verify1 = "select * from logindetails where loginid='" + username + "'";
            String verify2 = "select * from details where rolllno='" + roll + "'";
            Statement stmt3 = SoftwareProject.invokedb();
            Statement stmt4 = SoftwareProject.invokedb();
            Statement stmt5=SoftwareProject.invokedb();
            int flag = 0;

            try {
                ResultSet rs2 = stmt3.executeQuery(verify1);
                ResultSet rs3 = stmt4.executeQuery(verify2);
                if (rs2.next()) {
                    flag = 1;
                    label1.setText("User id taken");
                    success=0;
                } else if (rs3.next()) {
                    flag = 1;
                    label1.setText("Roll no. already registered");
                    success=0;
                }

            } catch (Exception e) {
                System.err.println(e);
            }
            if (flag == 0) {
                // System.out.println("Here I am");
                String query = "select max(id) from logindetails";
                Statement stmt2 = SoftwareProject.invokedb();
                try {
                    ResultSet rs = stmt2.executeQuery(query);
                    rs.next();
                    x = rs.getInt(1) + 1;
                    System.out.println(x);

                } catch (SQLException e) { //System.err.println("Exception")
                    ;
                    System.err.println(e);
                };

                String query1 = "insert into details values( " + x + ",'" + name + "','" + dep + "','" + roll + "')";
                String query2 = "insert into logindetails values(" + x + ",'" + username + "','" + passwd + "')";
                String query3 = "insert into skills(rollno) values('" + roll + "')";
                String query6="insert into cgpa values("+x+",'"+roll+"',"+cgpa.getText();
                try {
                    Statement stmtt = SoftwareProject.invokedb();
                    stmtt.executeUpdate(query3);

                } catch (Exception e) {
                    System.err.println(e);
                }
                if (datascience.isSelected()) {
                    String query4 = "update skills set datascience='1' where rollno='" + roll + "'";
                    Statement stmt6 = SoftwareProject.invokedb();
                    try {

                        stmt6.executeUpdate(query4);
                        System.out.println("Success");
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                }
                if (datascience.isSelected()) {
                    String query4 = "update skills set datascience='1' where rollno='" + roll + "'";
                    Statement stmt6 = SoftwareProject.invokedb();
                    try {
                        stmt6.executeUpdate(query4);
                        //  System.out.println("Success");
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                }
                if (datascience.isSelected()) {
                    String query4 = "update skills set datascience='1' where rollno='" + roll + "'";
                    Statement stmt6 = SoftwareProject.invokedb();
                    try {
                        stmt6.executeUpdate(query4);
                        //  System.out.println("Success");
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                }
                if (machines.isSelected()) {
                    String query4 = "update skills set machines='1' where rollno='" + roll + "'";
                    Statement stmt6 = SoftwareProject.invokedb();
                    try {
                        stmt6.executeUpdate(query4);
                        //  System.out.println("Success");
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                }
                if (semiconductors.isSelected()) {
                    String query4 = "update skills set semiconductors='1' where rollno='" + roll + "'";
                    Statement stmt6 = SoftwareProject.invokedb();
                    try {
                        stmt6.executeUpdate(query4);
                        //  System.out.println("Success");
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                }
                if (nanotechnology.isSelected()) {
                    String query4 = "update skills set nanotechnology='1' where rollno='" + roll + "'";
                    Statement stmt6 = SoftwareProject.invokedb();
                    try {
                        stmt6.executeUpdate(query4);
                        //  System.out.println("Success");
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                }
                if (mathematics.isSelected()) {
                    String query4 = "update skills set mathematics='1' where rollno='" + roll + "'";
                    Statement stmt6 = SoftwareProject.invokedb();
                    try {
                        stmt6.executeUpdate(query4);
                        //  System.out.println("Success");
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                }

                if (physicalscience.isSelected()) {
                    String query4 = "update skills set physicalscience='1' where rollno='" + roll + "'";
                    Statement stmt6 = SoftwareProject.invokedb();
                    try {
                        stmt6.executeUpdate(query4);
                        //  System.out.println("Success");
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                }
                if (programminglanguages.isSelected()) {
                    String query4 = "update skills set programminglanguages='1' where rollno='" + roll + "'";
                    Statement stmt6 = SoftwareProject.invokedb();
                    try {
                        stmt6.executeUpdate(query4);
                        //  System.out.println("Success");
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                }

                String query5 = "update skills set studentid=" + x + " where rollno='" + roll + "'";
                System.out.println(query5);
                Statement stmt7 = SoftwareProject.invokedb();
                try {
                    stmt7.executeUpdate(query5);

                } catch (Exception e) {
                    System.err.println(e);
                };

                Statement stmt = SoftwareProject.invokedb();
                try {
                    stmt.executeUpdate(query1);
                    stmt.executeUpdate(query2);
                    JOptionPane.showMessageDialog(this, "You have successfully registered, click to return to the login screen");
                    new Mainscreen().setVisible(true);
                    this.setVisible(false);

                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        }
        return success;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        datascience = new javax.swing.JCheckBox();
        machines = new javax.swing.JCheckBox();
        semiconductors = new javax.swing.JCheckBox();
        nanotechnology = new javax.swing.JCheckBox();
        mathematics = new javax.swing.JCheckBox();
        physicalscience = new javax.swing.JCheckBox();
        programminglanguages = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cgpa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 240, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 62, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Roll no.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 128, -1, -1));

        txt2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 240, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Department");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 205, -1, -1));

        txt3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 240, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 273, -1, -1));

        txt4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 240, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 317, 108, -1));

        txt5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 240, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Confirm Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        txt6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 240, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 564, 120, 50));
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 575, 200, 39));

        datascience.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        datascience.setText("DataScience");
        datascience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datascienceActionPerformed(evt);
            }
        });
        getContentPane().add(datascience, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 465, -1, -1));

        machines.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        machines.setText("Machines");
        getContentPane().add(machines, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 465, -1, -1));

        semiconductors.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        semiconductors.setText("Semiconductors");
        getContentPane().add(semiconductors, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 465, -1, -1));

        nanotechnology.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nanotechnology.setText("Nanotechnology");
        getContentPane().add(nanotechnology, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 465, -1, -1));

        mathematics.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mathematics.setText("Mathematics");
        getContentPane().add(mathematics, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 465, -1, -1));

        physicalscience.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        physicalscience.setText("PhysicalScience");
        getContentPane().add(physicalscience, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 520, -1, -1));

        programminglanguages.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        programminglanguages.setText("ProgrammingLanguages");
        getContentPane().add(programminglanguages, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 520, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Choose your interests/areas where you have considerable work");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 431, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel9.setText("CGPA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        cgpa.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        cgpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cgpaActionPerformed(evt);
            }
        });
        getContentPane().add(cgpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       process();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void datascienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datascienceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_datascienceActionPerformed

    private void cgpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cgpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cgpaActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cgpa;
    private javax.swing.JCheckBox datascience;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label1;
    private javax.swing.JCheckBox machines;
    private javax.swing.JCheckBox mathematics;
    private javax.swing.JCheckBox nanotechnology;
    private javax.swing.JCheckBox physicalscience;
    private javax.swing.JCheckBox programminglanguages;
    private javax.swing.JCheckBox semiconductors;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    // End of variables declaration//GEN-END:variables
}
