/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author wilda
 */
public class UTS4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // Panjang array
        int n = arr.length;

        // Inisialisasi dua pointer
        int i = 0, j = 1;

        // Iterasi melalui array
        while (j < n) {
            // Periksa apakah elemen saat ini dan berikutnya sama
            if (arr[i] == arr[j]) {
                // Lewati elemen duplikat
                j++;
            } else {
               // Ganti elemen unik pada posisi berikutnya
                arr[i + 1] = arr[j];
                i++;
                j++;
            }
        }

       // Kurangi ukuran array untuk menghapus elemen duplikat
        int[] newArr = new int[i + 1];
        for (int k = 0; k <= i; k++) {
            newArr[k] = arr[k];
        }

        // Print the new array without duplicates
        System.out.print("Array tanpa duplikat: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
    
}
