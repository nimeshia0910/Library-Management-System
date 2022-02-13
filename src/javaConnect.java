
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nimesha
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaConnect {


    static Connection conn;
    
    public static Connection connecrDb(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        //conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","vayomie1999");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_man","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return conn;
    }
     public static void main(String args[]) {
Home ob=new Home();
ob.setVisible(true);
}
}

