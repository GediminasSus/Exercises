package programos;

import java.util.Random;
import java.util.Scanner;

public class AtspekSkaiciu {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // sukuriam scanner kad vartotojas galetu ivesti savo varianta
        
        Random random = new Random();  
        int randomNumber = random.nextInt(100) + 1; // Sugeneruojam atsitiktini skaiciu nuo 1-100 (standartiskai ivedus 100 generuoja skaicius nuo 0 iki 99 todel pridedame 1)
        
        // pradinis meniu
        System.out.println("Sveiki atvyke i zaidima atspek skaiciu");
        System.out.println("Kompiuteris parinko atsitiktini skaiciu nuo 1 iki 100");
        System.out.println("Bandyk ji atspeti per kuo maziau bandymu");
        
        int guess = 0; // zaidejo ivestas skaicius
        int attempts = 0; // kiek kartu bande speti
        
        while (guess != randomNumber) { // kol spejimas nelygus sugeneruotam skaiciaui darom
            System.out.print("Iveskite savo spejima: ");
            guess = scanner.nextInt(); // spejima skaitom is consoles
            attempts++; // pridedam viena bandyma
            
            if (guess < randomNumber) { // jeigu spejimas mazesnis uz sugeneruota atsitiktini skaiciu
                System.out.println("Jusu spejamas skaicius yra mazesnis, bandykite dar karta");
            } else if (guess > randomNumber) {
                System.out.println("Jusu spejamas skaicius yra didesnis, bandykite dar karta");
            } else {
                System.out.println("Sveikiname! Jus atspejote! Jums prireike " + attempts + " bandymu");
            }
        }
        
        // Uzdarome scanner
        scanner.close();
    }
}