/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

/**
 *
 * @author MDK
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

// bisa juga diimpor sekaligus seperti ini:
// import java.sql.*


public class BelajarJavaMysql {
    
    // Menyiapkan parameter JDBC untuk koneksi ke database
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "JDBC:mysql://localhost/mahasiswa";
    static final String USER = "root";
    static final String PASS = "";

    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;

        // Melakukan koneksi ke database
        // harus dibungkus dalam blok try/catch
    public void jalankan(){
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            
            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            Statement stat = conn.createStatement();
                   
           //JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
            
        } catch (Exception e) {
            //JOptionPane.showConfirmDialog(null, "Gagal Koneksi Karena " + e);
        }
    }
        
}