/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO3;

/**
 *
 * @author wilda
 */
public class game {
    public static void main(String[] args) 
    {
        player petani = new player();
        
        petani.name = "wan ";
        petani.speed = 90;
        petani.healthPoin = 0;
        
        petani.run();
        
        if(petani.isDead())
        {
            System.out.println("Game Over!");
        }
    }
}
