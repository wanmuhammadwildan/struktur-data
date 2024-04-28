/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1D;

/**
 *
 * @author wilda
 */
public class MenampilkanNilaiTertinggi {
    public static void main(String[] args) {
        //  membuat array
        int []angka = {7,1,4,8,5,6,1};
        
        //  mentukan nilai tertinggi dalam array
        int nilaitertinggi = angka [0];
        for (int i = 0; i < angka.length;i++){
            if (angka[i] > nilaitertinggi){
                nilaitertinggi = angka[i];
            }
        }
        System.out.println("SEMUA NILAI ARRAY:");
        for (int semua : angka)
        System.out.println(semua);
        System.out.println("NILAI TERTINGGI ADALAH " + nilaitertinggi);
                
    }
    
}
