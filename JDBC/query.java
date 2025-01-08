/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author MDK
 */
public class query {
    BelajarJavaMysql konek = new BelajarJavaMysql();
    
        public void insert (String nim, String nama, String alamat, String gender){
            
            String inserQuery = "INSERT INTO identitas (nim, nama, alamat, gender) VALUES (?, ?, ?, ?) ";
           konek.jalankan();
            
            try{
               PreparedStatement prepredStatement = konek.conn.prepareStatement(inserQuery);
               prepredStatement.setString(1, nim);
               prepredStatement.setString(2, nama);
               prepredStatement.setString(3, alamat);
               prepredStatement.setString(4, gender);
               
               //eksekusi Query
               int rowsInserted = prepredStatement.executeUpdate();
               if(rowsInserted>0){
                   System.out.println("berhasil insert");
               }else {
                   System.out.println("gagal insert");
               }
            } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Tejadi salah " + ex);
                       
            }
        }
        
        public void update (String nim, String nama, String alamat, String gender){
            
            String inserQuery = "UPDATE identitas SET nim = ?,nama = ?,gender = ?, alamat = ? WHERE nim = ?";
           konek.jalankan();
            
            try{
               PreparedStatement prepredStatement = konek.conn.prepareStatement(inserQuery);
               prepredStatement.setString(1, nim);
               prepredStatement.setString(2, nama);
               prepredStatement.setString(3, gender);
               prepredStatement.setString(4, alamat);
               prepredStatement.setString(5, nim);
               
               //eksekusi Query
               int rowsInserted = prepredStatement.executeUpdate();
               if(rowsInserted>0){
                   System.out.println("berhasil insert");
               }else {
                   System.out.println("gagal insert");
               }
            } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, "Tejadi salah " + ex);
                       
            }
        }
    public static void main(String[] args) {
        query q = new query();
        q.insert("2355201017","bagus","krenceng","L");
    }
    
        }

