/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author osama
 */
public class MySqlConnect {
    Connection conn=null;
    public static  Connection ConnectDB(){
        
    try{
         Class.forName("com.mysql.jdbc.Driver");
     Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/system","root","1234");
     
     return conn;
    }
    catch(Exception e){
    JOptionPane.showConfirmDialog(null,e);
    return null;
}
    }}