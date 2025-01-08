/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MDK
 */
public class koneksi {
    private static Connection koneksi;
    
    public static Connection getConnection() throws SQLException{
        String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "JDBC:mysql://localhost/mahasiswa";
        String USER = "root";
        String PASS = "";
        
        if(koneksi == null){
            koneksi = DriverManager.getConnection(DB_URL,USER,PASS);
        }
        return koneksi;
    }
}
