/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1D;

/**
 *
 * @author wilda
 */
public class MenampilkanNilaiTerendah {
    public static void main(String[] args) {
        // Membuat array
        int[] angka = {8, 2, 9, 4, 5};

        // Menentukan nilai terendah dalam array
        int nilaiTerendah = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] < nilaiTerendah) {
                nilaiTerendah = angka[i];
            }
        }

        // Menampilkan semua nilai dalam array
        System.out.println("Semua nilai dalam array:");
        for (int nilai : angka) {
            System.out.println(nilai);
        }

        // Menampilkan nilai terendah
        System.out.println("Nilai terendah dalam array adalah: " + nilaiTerendah);
    }
}
