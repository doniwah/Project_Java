/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasi_kasir;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author acer
 */
public class koneksi {
    private static final String URL = "jdbc:mysql://localhost:8111/app_kasir";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private Connection con;
    
    
    
    
    public void connect()
    {
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Connection getCon(){
        return con;
    }
}
