/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenghitungSimilaritas;

/**
 *
 * @author wilda
 */
public class PALINDROMExSTRING {
    public static void main(String[] args) {
        String kalimat = "saya suka es cream";
        System.out.println("KALIMAT : " + kalimat);
        System.out.println(isPalindrome(kalimat) ? "Kalimat Ini Adalah Palindrome" : "Kalimat Ini Bukan Palindrome");
    }

    public static boolean isPalindrome(String kalimat) {
        String kalimatTanpaSpasi = kalimat.replace(" ", "").toLowerCase();
        int panjang = kalimatTanpaSpasi.length();

        for (int i = 0; i < panjang / 2; i++) {
            if (kalimatTanpaSpasi.charAt(i) != kalimatTanpaSpasi.charAt(panjang - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
