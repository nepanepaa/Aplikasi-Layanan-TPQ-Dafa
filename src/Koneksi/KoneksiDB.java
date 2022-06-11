/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ACHMAD SYAHRUL R
 */
public class KoneksiDB {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi == null){
            try{
                String url;
                url = "jdbc:mysql://localhost:3306/userlogin";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, username, password);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Connection Failed");
            }
    }return koneksi;
  }static Object getConnection(){
    throw new UnsupportedOperationException("Not Yet Implemented");
}
}
