/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author wilda
 */
public class UTS5 {
     public static void main(String[] args) {
        int[][] matriks = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        // Periksa elemen diagonal
        boolean isIdentitas = true;
        for (int i = 0; i < 3; i++) {
            if (matriks[i][i] != 1) {
                isIdentitas = false;
                break;
            }
        }

        // Periksa elemen non-diagonal
        if (isIdentitas) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i != j && matriks[i][j] != 0) {
                        isIdentitas = false;
                        break;
                    }
                }
                if (!isIdentitas) {
                    break;
                }
            }
        }

        // Tampilkan hasil
        System.out.println("Matriks tersebut " + (isIdentitas ? "adalah" : "bukan") + " matriks identitas.");
    }
    
}
