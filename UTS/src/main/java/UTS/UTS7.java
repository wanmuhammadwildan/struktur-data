/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author wilda
 */
public class UTS7 {
    public static void main(String[] args) {
        String[] nama = {"Bunda", "Andi", "Caca", "Dono", "Edon", "Fanea", "Gita"};

        System.out.println("Array Awal:");
        for (String namaOrang : nama) {
            System.out.print(namaOrang + " ");
        }

        System.out.println("\n\nInsertion Sort:");
        String[] namaInsertionSort = insertionSort(nama.clone());
        for (String namaOrang : namaInsertionSort) {
            System.out.print(namaOrang + " ");
        }

        System.out.println("\n\nSelection Sort:");
        String[] namaSelectionSort = selectionSort(nama.clone());
        for (String namaOrang : namaSelectionSort) {
            System.out.print(namaOrang + " ");
        }

        System.out.println("\n\nBubble Sort:");
        String[] namaBubbleSort = bubbleSort(nama.clone());
        for (String namaOrang : namaBubbleSort) {
            System.out.print(namaOrang + " ");
        }
    }

    // Algoritma Insertion Sort
    private static String[] insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(current) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    // Algoritma Selection Sort
    private static String[] selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    // Algoritma Bubble Sort
    private static String[] bubbleSort(String[] arr) {
        boolean isSorted = false;
        for (int i = arr.length - 1; i > 0 && !isSorted; i--) {
            isSorted = true;
            for (int j = 0; j < i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }
    
}
