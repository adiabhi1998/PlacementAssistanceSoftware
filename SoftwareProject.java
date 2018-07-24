/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareproject;

import java.sql.*;
//import java.sql.DriverManager;

/**
 *
 * @author adity
 */
public class SoftwareProject {

    public static Statement invokedb() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            return con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }

    public static Statement invokedb2() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "");
            return con.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Mainscreen().setVisible(true);
        // TODO code application logic here
    }

}
