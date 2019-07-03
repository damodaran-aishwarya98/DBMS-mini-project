/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */
import java.sql.*;
import javax.swing.*;
public class Connect {
     static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://192.168.100.174/db";
    Connection con=null;
   
        public static Connection ConnectDB(){
        try{
           Class.forName("org.mariadb.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/hmdb","root","011998");
           return con;
            
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    }      
}
}
