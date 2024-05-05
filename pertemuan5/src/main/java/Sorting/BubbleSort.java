/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author wilda
 */
public class BubbleSort {
    public static void sort(int[] data) {
        
        // Perulangan untuk jumlah lintasan yang diperlukan (kasus terburuk: n-1 lintasan)
        for (int i = 0; i < data.length - 1; i++) {
            boolean swapped = false;  // Flag to track if any swaps occurred

            // Ulangi elemen yang berdekatan, bandingkan dan tukar
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;  // Setel tanda untuk menunjukkan pertukaran
                }
            }

            // Jika tidak ada pertukaran yang terjadi pada suatu pass, array sudah diurutkan
            if (!swapped) {
                break;  // Early termination if array is sorted
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original data:");
        for (int element : data) {
            System.out.print(element + " ");
        }

        sort(data);  // Sort the data array

        System.out.println("\nSorted data:");
        for (int element : data) {
            System.out.print(element + " ");
        }
    }
}