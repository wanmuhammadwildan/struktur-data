/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO2;

/**
 *
 * @author wilda
 */
public class mobilavanza {
     public static void main(String[] args) {
        mobil avanza = new mobil();
        
        avanza.merkMobil = "avanza";
        avanza.tahunBuat = 2012;
        avanza.warnaMobil = "hitam";
        
        System.out.println("warna mobil     = " + avanza.warnaMobil);
        System.out.println("Merk mobil      = " + avanza.merkMobil);
        System.out.println("Tahun Pembuatan = " + avanza.tahunBuat);
        avanza.mobilberjalan();
        avanza.mobilberhenti();
     }
}
