/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author wilda
 */
public class insertionSort {

  public static void sort(int[] data) {
    for (int i = 1; i < data.length; i++) {
      int key = data[i]; // Element yang dimasukan
      int j = i - 1; // Index untuk mengeser Elemen

     // Menggeser elemen sub-array yang diurutkan yang lebih besar dari kuncinya
      while (j >= 0 && data[j] > key) {
        data[j + 1] = data[j];
        j--;
      }

      // Masukkan kunci pada posisi yang benar
      data[j + 1] = key;
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
