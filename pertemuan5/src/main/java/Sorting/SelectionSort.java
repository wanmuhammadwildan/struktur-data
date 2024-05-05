/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author wilda
 */
public class SelectionSort {

  public static void sort(int[] data) {
  
    for (int i = 0; i < data.length - 1; i++) {
      int minIndex = i; // Indeks elemen minimum yang ditemukan saat ini
      for (int j = i + 1; j < data.length; j++) {
        if (data[j] < data[minIndex]) {
          minIndex = j; // Perbarui indeks elemen minimum jika ditemukan
        }
      }
     // Tukar elemen di i dengan elemen minimum
      if (minIndex != i) {
        int temp = data[i];
        data[i] = data[minIndex];
        data[minIndex] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int[] data = {64, 34, 25, 12, 22, 11, 90};

    System.out.println("Original data:");
    for (int element : data) {
      System.out.print(element + " ");
    }

    sort(data);  //urutkan susunan data

    System.out.println("\nSorted data:");
    for (int element : data) {
      System.out.print(element + " ");
    }
  }
}
