package programos;

import java.util.Random;
import java.util.Scanner;

public class MatematikosZaidimas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean exit = false;

        while (!exit) {
            // pagrindinis meniu
            System.out.println("\n#########################################");
            System.out.println("# Sveiki atvyke i matematinius zaidimus!#");
            System.out.println("# Pasirinkite koki zaidima zaisite:     #");
            System.out.println("# 1. Atspek skaiciu                     #");
            System.out.println("# 2. Daugyba                            #");
            System.out.println("# 3. Atimtis arba sudetis               #");
            System.out.println("# 4. Iseiti                             #");
            System.out.println("#########################################");
            System.out.print("#Iveskite savo pasirinkima: ");
            
            int choice = scanner.nextInt();

            switch (choice) { // tikrinam ka pasirinko vartotojas ir paleidziam metoda pagal pasitinkima
                case 1:
                    numbersGuessing(scanner, random);
                    break;
                case 2:
                    multiplication(scanner, random);
                    break;
                case 3:
                    additionSubtraction(scanner, random);
                    break;
                case 4:
                    exit = true;
                    System.out.println("\n ## Aciu kad zaidete! ##");
                    break;
                default:
                    System.out.println("\n ## Netinkamas pasirinkimas. prasome ivesti 1, 2, 3, arba 4. ##");
            }
        }

       
        scanner.close();
    }

    // Atspek skaiciu zaidimo programa
    public static void numbersGuessing(Scanner scanner, Random random) {
        System.out.println("Sveiki atvyke i zaidima atspek skaiciu");
        System.out.println("Kompiuteris parinko atsitiktini skaiciu nuo 1 iki 100");
        System.out.println("Bandyk ji atspeti per kuo maziau bandymu");

        int randomNumber = random.nextInt(100) + 1;
        int guess = 0, attempts = 0;

        while (guess != randomNumber) {
            System.out.print("Guess the number (1-100): ");
            guess = scanner.nextInt(); // spejima skaitom is consoles
            attempts++; // pridedam viena bandyma
            
            if (guess < randomNumber) { // jeigu spejimas mazesnis uz sugeneruota atsitiktini skaiciu
                System.out.println("Jusu spejamas skaicius yra mazesnis, bandykite dar karta");
            } else if (guess > randomNumber) {
                System.out.println("Jusu spejams skaicius yra didesnis, bandykite dar karta");
            } else {
                System.out.println("\n ## Sveikiname! Jus atspejote! Jums prireike " + attempts + " bandymu ##");
            }
        }
    }

    // Daugybos progrma 
    public static void multiplication(Scanner scanner, Random random) {
        
        int number1 = random.nextInt(10) + 1;
        int number2 = random.nextInt(10) + 1;

        System.out.println("Apskaiciuokite sandauga");
        System.out.println(number1 + " x " + number2 + " = ?");
        System.out.print("Jusu atsakymas: ");
        int userAnswer = scanner.nextInt();

        int correctAnswer = number1 * number2;
        if (userAnswer == correctAnswer) {
            System.out.println("\n ## Jusu atsakymas teisingas ! ##");
        } else {
            System.out.println("\n ## Jus suklydote!. Teisingas atsakymas: " + correctAnswer + " ##");
        }
    }

    // Atimties ir sumos progrma
    public static void additionSubtraction(Scanner scanner, Random random) {
        
        int number1 = random.nextInt(100) + 1;
        int number2 = random.nextInt(100) + 1;
        boolean isAddition = random.nextBoolean();

        int correctAnswer;
        if (isAddition) {
            System.out.println("apskaiciuokite suma");
            System.out.println(number1 + " + " + number2 + " = ?");
            correctAnswer = number1 + number2;
        } else {
            // Padarom kad sugeneruotu numeriu skirtumas nebutu neigiamas apkeisdami juos vietomis
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("Apskaiciuokite skirtuma");
            System.out.println(number1 + " - " + number2 + " = ?");
            correctAnswer = number1 - number2;
        }

        // nuskaitom vartotojo atsakyma
        System.out.print("Jusu atsakymas: ");
        int userAnswer = scanner.nextInt();

        // Tikrinam ar atsakymas teisingas
        if (userAnswer == correctAnswer) {
            System.out.println("\n ## Jusu atsakymas teisingas ! ##");
        } else {
            System.out.println("\n ## Jus suklydote!. Teisingas atsakymas: " + correctAnswer + " ##");
        }

    }
    
}
