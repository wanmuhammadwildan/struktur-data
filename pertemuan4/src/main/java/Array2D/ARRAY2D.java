/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array2D;

/**
 *
 * @author wilda
 */
public class ARRAY2D {
    public static void main(String[] args) {
        // cara pertama
    System.out.println("Cara Pertamana = ");
    int[][] arr = new int[2][2];
     
    arr[0][0] = 55;
    arr[0][1] = 95;
    arr[1][0] = 86;
    arr[1][1] = 75;
       
    System.out.println("Isi variabel arr: ");
     
    System.out.println(arr[0][0] +" "+arr[0][1]);
    System.out.println(arr[1][0] +" "+arr[1][1]);
    
    System.out.println("");
    
        // cara kedua
        System.out.println("Cara Kedua");
        String arr2[][] = {{"nama 1","nama 2"},{"nama 3","nama 4"}};
        
        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[1][0]);
        System.out.println(arr2[1][1]);
        
        System.out.println("");
        
        // cara kedua
         System.out.println("Cara Ketiga");
        String arr3[][] = {{"nama 1","nama 2"},{"nama 3","nama 4"}};
        
        for (int k=0; k<arr3.length; k++)
        {
        for (int b=0; b<arr3.length; b++)
        {
            System.out.println(arr3 [k][b]);
        }
    }  
  }
}
