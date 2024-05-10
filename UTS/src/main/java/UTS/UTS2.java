/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author wilda
 */
public class UTS2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        // Menentukan panjang array gabungan
        int combinedArrayLength = arr1.length + arr2.length;

        // Membuat array baru untuk menyimpan array gabungan
        int[] combinedArray = new int[combinedArrayLength];

        // Menyalin elemen dari arr1 ke combinedArray
        System.arraycopy(arr1, 0,combinedArray, 0, arr1.length);

        // Menyalin elemen dari arr2 ke combinedArray, dimulai dari akhir combinedArray
        int j = 0;
        for (int i = arr1.length; i < combinedArrayLength; i++) {
            combinedArray[i] = arr2[j];
            j++;
        }

        // Menampilkan array gabungan
        System.out.print("Array gabungan: ");
        for (int element : combinedArray) {
            System.out.print(element + " ");
        }
    }
    
}
