/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elágazás;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Elágazás {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int gergo = 23;
        
        // Elágazások
        if (gergo >= 0){
            System.out.println("A szám pozítiv");
        }
        else{
            System.out.println("A szám negatív");
        }
        
        // Különben
        boolean feltetel = (gergo >= 0);
        // Ha igaz
        // feltetel = true
        // feltetel = false
        if (feltetel){
            System.out.println("A szám pozítiv");
        }
        // Különben
        else{
            System.out.println("A szám negatív");
        }
        
        // Összehasonlító műveletek
        /*
        Egyenlőség: ==
        Tagadás: !
        Nem egyenlő: !=
        Kisebb: a < b
        Kisebb vagy egyenlő: a <= b
        Nagyobb: a > b
        Nagyobb vagy egyenlő: a >= b 
        */
        
        // Kérjünk be két számot, írjuk ki a nagyobbat
        System.out.println("Kérek egy számot: ");
        Scanner be = new Scanner(System.in); // Adatbekéréshez
        int a = be.nextInt(); // be.nextInt() számot vár a felhasználótól
        System.out.println("Kérek egy másik számot: ");
        int b = be.nextInt();
        // Döntsük el, hogy melyik nagyobb
        if(a > b){
            System.out.printf("Az %d nagyobb, mint a %d", a, b);
        }
        else{
            System.out.printf("Az %d nagyobb, mint a %d", b, a);
        }
    }
    
    
    
}
