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
        
        // Logikai műveletek
        /*
        !: tagadás, nem
        &&: logikai ÉS
        ||: logikai VAGY
        
        */
        
        // (2 > 3) && (3 > 2) => Hamis
        // (3 > 2) || (2 > 3) => Igaz
        
        int egesz = 30;
        if(egesz % 10 == 0 && egesz % 3 == 0){
            System.out.println("A 30 osztható 10-zel és 3-mal maradék nélkül.");
        }
        else{
            System.out.println("A 30 nem osztható maradék nélkül 10-zel és 3-mal");
        }
        
        egesz = 27;
        if (egesz % 10 == 0 || egesz % 3 == 0){
            System.out.println("A 27 osztható 10-zel vagy 3-mal maradéknélkül");
        }
        else{
            System.out.println("A 27 nem osztható 10-zel vagy 3-mal maradéknélkül");    
        }
        
        // Célszerű - if - else if - else
        double szazalek = 60.0;
        // 0-39 elégtelen
        // 40-49 elégséges
        // 50-59 közepes
        // 60-79 jó
        // 80-100 jeles
        if(szazalek >= 80){
            System.out.println("Jeles");
        }
        else if(szazalek >= 60 && szazalek < 80){
            System.out.println("Jó");
        }
        else if(szazalek >= 50 && szazalek < 60){
            System.out.println("Közepes");
        }
        else if(szazalek >= 40 && szazalek < 50){
            System.out.println("Elégséges");
        }
        else{
            System.out.println("Elégtelen");
        }
        
        // Ternáris operátor
        // (feltétel) ? igaz : hamis
        String eredmeny = (szazalek % 2 == 0) ? "Páros" : "Páratlan";
        System.out.println(eredmeny);
        
        // Esetszétválasztás - Switch-case
        String honap = "Február";
        // Switch(egyenlőség) ÉRTÉK alapján vizsgál ==
        switch(honap){
            // if(honap == "Január")
            case "Január":
                System.out.println("01");
                break;
            // else if(honap == "Február")
            case "Február":
                System.out.println("02");
                break;
            // else if(honap == "Március")
            case "Március":
                System.out.println("03");
                break;
            // else ág
            default:
                System.out.println("Nincs ilyen hónap");
        }
        
        // Felhasználó megad egy sorszámot, válaszul megkapja az melyik hónap
        /*String honap = "Február";
        // Switch(egyenlőség) ÉRTÉK alapján vizsgál ==
        switch(honap){
            // if(honap == "Január")
            case "Január":
                System.out.println("01");
                break;
            // else if(honap == "Február")
            case "Február":
                System.out.println("02");
                break;
            // else if(honap == "Március")
            case "Március":
                System.out.println("03");
                break;
            // else ág
            default:
                System.out.println("Nincs ilyen hónap");
        }*/
        
        System.out.println("Kérek egy számot: ");
        // be = new Scanner(System.in);
        int honapp = be.nextInt(); 
        
        // Switch(egyenlőség) ÉRTÉK alapján vizsgál ==
        switch(honapp){
            // if(honap == "Január")
            case 1:
                System.out.println("Január");
                break;
            // else if(honap == "Február")
            case 2:
                System.out.println("Február");
                break;
            // else if(honap == "Március")
            case 3:
                System.out.println("Március");
                break;
            case 4:
                System.out.println("Április");
                break;
            case 5:
                System.out.println("Május");
                break;
            case 6:
                System.out.println("Június");
                break;
            case 7:
                System.out.println("Július");
                break;
            case 8:
                System.out.println("Augusztus");
                break;
            case 9:
                System.out.println("Szeptember");
                break;
            case 10:
                System.out.println("Október");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            // else ág
            default:
                System.out.println("Nincs ilyen hónap");
        }
}
}