/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author wilda
 */
public class UTS6 {
    public static void main(String[] args) {
        int[][] matriks = {
            {12, 3, 9},
            {4, 5, 26},
            {7, 8, 6}
        };

        // Matriks untuk hasil transposisi
        int[][] matriksTranspos = new int[3][3];

        // Melakukan transposisi
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                matriksTranspos[j][i] = matriks[i][j];
            }
        }

        // Mencetak matriks asli
        System.out.println("Matriks Asli:");
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }

        // Mencetak matriks transposisi
        System.out.println("\nMatriks Transposisi:");
        for (int[] baris : matriksTranspos) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }
    
}
