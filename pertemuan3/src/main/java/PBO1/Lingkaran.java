/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1;

/**
 *
 * @author wilda
 */
public class Lingkaran {
    public static void main(String[] args) {
        rumus L = new rumus();
        
        L.phi = 3.14;
        L.jari2 = 20;
        
        L.luas = L.phi * (L.jari2 * L.jari2);
        
        System.out.println("phi        = " + L.phi);
        System.out.println("jari-jari  = " + L.jari2);
        System.out.println("Luas       = " + L.luas);
        
    }
    
}
