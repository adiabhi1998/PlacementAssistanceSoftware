/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareproject;

import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/**
 *
 * @author adity
 */
public class SearchCompany extends javax.swing.JFrame {

    /**
     * Creates new form SearchCompany
     */
    public List<String> setCompany()
    {
        List<String> s=new ArrayList<>();
        table1.setRowHeight(30);
        Statement stmt = SoftwareProject.invokedb2();
        String query = "select * from company";
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                try {
                    Object[] row = {rs.getInt(1), rs.getString(2), rs.getString(3)};
                    s.add(rs.getString(2));
                    DefaultTableModel model;
                    model = (DefaultTableModel) table1.getModel();
                    model.addRow(row);
                } catch (Exception e) {
                    System.out.println(e);

                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }
    public SearchCompany() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.orange);
        //table1.
        
    }

    //list1.add("Microsoft ");
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new java.awt.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        scrollbar1 = new java.awt.Scrollbar();
        button1 = new java.awt.Button();
        buttonsearch = new javax.swing.JButton();
        chk = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        table1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        table1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        table1.setForeground(new java.awt.Color(255, 0, 102));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name of Company", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(table1);

        button1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        button1.setLabel("Apply");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        buttonsearch.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        buttonsearch.setText("Search");
        buttonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsearchActionPerformed(evt);
            }
        });

        chk.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        chk.setText("Show Companies as per my interest");
        chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("<html>Leave the searchbox empty <br>to see all companies");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollbar1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(buttonsearch)
                                .addGap(39, 39, 39)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(chk))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273)
                        .addComponent(scrollbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(buttonsearch))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chk)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(314, 314, 314))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        int rno = table1.getRowCount();
        for (int i = 0; i < rno; i++) {
            if (table1.isRowSelected(i)) {
                int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to apply for the company " + table1.getValueAt(i, 1), "Are you sure you want to apply for the company " + table1.getValueAt(i, 1), JOptionPane.YES_NO_OPTION);
                if (x == JOptionPane.YES_OPTION) {
                    Statement stmt = SoftwareProject.invokedb();
                    String text = "insert into application values(" + Mainscreen.id + "," + table1.getValueAt(i, 0) + ",'Pending')";
                    try {
                        stmt.executeUpdate(text);
                        JOptionPane.showMessageDialog(this, "Application Succesful!");
                        //System.out.println("Application Succesful!");
                    } catch (SQLException e) {
                        System.err.println(e);
                    }

                }
            }

        }

    }//GEN-LAST:event_button1ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void buttonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsearchActionPerformed
        // TODO add your handling code here:

        Statement stmt = SoftwareProject.invokedb2();
        String query = "";
        String quere2 = "";

        query = "Select * from company where name like '" + txt1.getText() + "%'";

        System.out.println(query);
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
        try {
            ResultSet rs = stmt.executeQuery(query);
            DefaultTableModel model2 = (DefaultTableModel) table1.getModel();
            if (!chk.isSelected()) {
                while (rs.next()) {

                    Object str[] = {rs.getInt(1), rs.getString(2), rs.getString(3)};

                    model2.addRow(str);

                }
            } else {

                String q = "select * from skills where studentid=" + Mainscreen.id;
                System.out.println(q);
                Statement s = SoftwareProject.invokedb();
                ResultSet rs2 = s.executeQuery(q);

                int[] a = new int[7];
                int[] b = new int[7];
                rs2.next();
                for (int i = 2; i <= 8; i++) {
                    a[i - 2] = rs2.getInt(i);

                }

                while (rs.next()) {

                    Object str[] = {rs.getInt(1), rs.getString(2), rs.getString(3)};
                    String u = "select * from companyreq where id=" + str[0];

                    Statement stloop = SoftwareProject.invokedb2();
                    ResultSet rs3 = stloop.executeQuery(u);

                    //rs3.next();
                    if (!rs3.next()) {
                        continue;
                    }
                    for (int i = 1; i <= 7; i++) {
                        if (rs3.getInt(i) == a[i - 1] && a[i - 1] == 1) {
                            model2.addRow(str);
                            break;

                        }

                    }

                }

            }
        } catch (SQLException e) {
            System.err.println(e);

        }


    }//GEN-LAST:event_buttonsearchActionPerformed

    private void chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_chkActionPerformed

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
            java.util.logging.Logger.getLogger(SearchCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchCompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JButton buttonsearch;
    private javax.swing.JCheckBox chk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Scrollbar scrollbar1;
    private javax.swing.JTable table1;
    private java.awt.TextField txt1;
    // End of variables declaration//GEN-END:variables
}