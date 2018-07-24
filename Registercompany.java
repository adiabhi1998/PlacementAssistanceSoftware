/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareproject;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author adity
 */
public class Registercompany extends javax.swing.JFrame {

    public static int id;

    /**
     * Creates new form rRgistercompany
     */
    public Registercompany() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.orange);

    }
     public void settext()
    {
        txt1.setText("Wipro");
        txt2.setText("Bangalore");
        txt3.setText("wip");
        txt4.setText("wip");
        txt5.setText("wip");      
    }
     public int execute()
     {
          String[] s = new String[5];
          int success=1;
        s[0] = txt1.getText();
        s[1] = txt2.getText();
        s[2] = txt3.getText();
        s[3] = txt4.getText();
        s[4] = txt5.getText();
        for (int i = 0; i <= 4; i++) {
            System.out.println(s[i]);
        }
        int flag = 0;
        for (int i = 0; i < 5; i++) {
            if (s[i].compareTo("") == 0) {
                flag = 1;
                break;

            }

        }
        if (flag == 1) {
            label1.setText("All fields are mandatory");
            System.out.println("hello");
            success=0;

        } else if (s[3].compareTo(s[4]) != 0) {
            label1.setText("Passwords do not match");
            System.out.println("bye");
            success=0;

        } else {
            String send = "insert into logincompany values('" + s[2] + "','" + s[3] + "',";
            String qry = "select max(id) from logincompany";
            Statement stm = SoftwareProject.invokedb2();
            Statement stm3 = SoftwareProject.invokedb2();

            try {
                ResultSet rs = stm.executeQuery(qry);
                rs.next();
                int x = rs.getInt(1) + 1;
                id = x;

            } catch (Exception e) {
                System.err.println(e);
            };
            send += id;
            send += ")";
            String query3 = "insert into companyreq(id) values('" + id + "')";
            try {
                Statement stmtt = SoftwareProject.invokedb2();
                stmtt.executeUpdate(query3);

            } catch (Exception e) {
                System.err.println(e);
            }
            if (datascience.isSelected()) {
                String query4 = "update companyreq set datascience='1' where id='" + id + "'";
                Statement stmt6 = SoftwareProject.invokedb2();
                try {

                    stmt6.executeUpdate(query4);
                    System.out.println("Success");
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
            if (datascience.isSelected()) {
                String query4 = "update companyreq set datascience='1' where id='" + id + "'";
                Statement stmt6 = SoftwareProject.invokedb2();
                try {
                    stmt6.executeUpdate(query4);
                    //  System.out.println("Success");
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
            if (datascience.isSelected()) {
                String query4 = "update companyreq set datascience='1' where id='" + id + "'";
                Statement stmt6 = SoftwareProject.invokedb2();
                try {
                    stmt6.executeUpdate(query4);
                    //  System.out.println("Success");
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
            if (machines.isSelected()) {
                String query4 = "update companyreq set machines='1' where id='" + id + "'";
                Statement stmt6 = SoftwareProject.invokedb2();
                try {
                    stmt6.executeUpdate(query4);
                    //  System.out.println("Success");
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
            if (semiconductors.isSelected()) {
                String query4 = "update companyreq set semiconductors='1' where id='" + id + "'";
                Statement stmt6 = SoftwareProject.invokedb2();
                try {
                    stmt6.executeUpdate(query4);
                    //  System.out.println("Success");
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
            if (nanotechnology.isSelected()) {
                String query4 = "update companyreq set nanotechnology='1' where id='" + id + "'";
                Statement stmt6 = SoftwareProject.invokedb2();
                try {
                    stmt6.executeUpdate(query4);
                    //  System.out.println("Success");
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
            if (mathematics.isSelected()) {
                String query4 = "update companyreq set mathematics='1' where id='" + id + "'";
                Statement stmt6 = SoftwareProject.invokedb2();
                try {
                    stmt6.executeUpdate(query4);
                    //  System.out.println("Success");
                } catch (Exception e) {
                    System.err.println(e);
                }
            }

            if (physicalscience.isSelected()) {
                String query4 = "update companyreq set physicalscience='1' where id='" + id + "'";
                Statement stmt6 = SoftwareProject.invokedb2();
                try {
                    stmt6.executeUpdate(query4);
                    //  System.out.println("Success");
                } catch (Exception e) {
                    System.err.println(e);
                }
            }
            if (programminglanguages.isSelected()) {
                String query4 = "update companyreq set programminglanguages='1' where id='" + id + "'";
                Statement stmt6 = SoftwareProject.invokedb2();
                try {
                    stmt6.executeUpdate(query4);
                    //  System.out.println("Success");
                } catch (Exception e) {
                    System.err.println(e);
                }
            }

            Statement stm2 = SoftwareProject.invokedb2();
            try {
                stm2.executeUpdate(send);
                String s3 = "insert into company values(" + id + ",'" + s[0] + "','" + s[1] + "')";
                stm3.executeUpdate(s3);
                JOptionPane.showMessageDialog(this, "You have successfully registered.Please proceed to login");
                new Mainscreen().setVisible(true);

            } catch (Exception e) {
                System.err.println(e);
            };

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

        jLabel1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt5 = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        datascience = new javax.swing.JCheckBox();
        machines = new javax.swing.JCheckBox();
        semiconductors = new javax.swing.JCheckBox();
        nanotechnology = new javax.swing.JCheckBox();
        mathematics = new javax.swing.JCheckBox();
        physicalscience = new javax.swing.JCheckBox();
        programminglanguages = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 69, -1, -1));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 66, 82, -1));

        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel2.setText("Location");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 148, -1, -1));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 145, 82, -1));

        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel3.setText("UserID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 211, -1, -1));
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 208, 82, -1));

        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 255, -1, -1));
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 252, 82, -1));

        jButton1.setText("Register!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, -1, -1));

        jLabel5.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 335, -1, -1));
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 82, -1));
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 442, 87, 49));

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
        jLabel7.setText("Choose your interests/areas appropriate for your company");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 431, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:   
    execute();
       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void datascienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datascienceActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_datascienceActionPerformed

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
            java.util.logging.Logger.getLogger(Registercompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registercompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registercompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registercompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registercompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox datascience;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
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
    // End of variables declaration//GEN-END:variables
}
