/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1D;

/**
 *
 * @author wilda
 */
public class MenampilkannilaiRataRata {
    public static void main(String[] args) {
        // Membuat array
        int[] angka = {7, 22, 111, 9, 46};

        // Menghitung jumlah total
        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }

        // Menghitung rata-rata
        double rataRata = (double) total / angka.length;

        // Menampilkan rata-rata
        System.out.println("Rata-rata nilai array adalah: " + rataRata);
    }
}
