package programos;

import java.util.Random;
import java.util.Scanner;

public class MatematikosZaidimas2 {
    private static String[] highScoreNames = {"-----", "-----", "-----"};
    private static int[] highScores = {0, 0, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean exit = false;

        while (!exit) {
            // pagrindinis meniu
            System.out.println("# Geriausi zaidejai:");
            System.out.printf("# 1. Atspek skaiciu: %s (%d) \n", highScoreNames[0], highScores[0]);
            System.out.printf("# 2. Daugyba:   %s (%d) \n", highScoreNames[1], highScores[1]);
            System.out.printf("# 3. Sudetis/atimtis: %s (%d) \n", highScoreNames[2], highScores[2]);
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
                    updateHighScore(scanner, 0, numbersGuessingGame(scanner, random));
                    break;
                case 2:
                    updateHighScore(scanner, 1, multiplicationGame(scanner, random));
                    break;
                case 3:
                    updateHighScore(scanner, 2, mixedAdditionSubtractionGame(scanner, random));
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

    // Atnaujina geriausiu zaideju sarasa
    public static void updateHighScore(Scanner scanner, int gameIndex, int newScore) {
        if (newScore > highScores[gameIndex]) {
            System.out.print("Sveikiname! Jus surinkote daugiausiai tasku siame zaidime. Iveskite savo varda: ");
            scanner.nextLine(); 
            highScoreNames[gameIndex] = scanner.nextLine();
            highScores[gameIndex] = newScore;
        } else {
            System.out.println("Jus nepagerinote rezultato. Bandykite dar karta!");
        }
    }

    // 1. Atspek skaiciu zaidimo programa
    public static int numbersGuessingGame(Scanner scanner, Random random) {
        System.out.println("Sveiki atvyke i zaidima atspek skaiciu");
        int[] ranges = {10, 100, 1000}; // Lygiai: 1-10, 1-100, 1-1000
        int[] maxAttempts = {2, 4, 8}; // per kiek kartu reikia atspeti kad gautum 10 tasku.
        int score = 0;
    
        for (int level = 0; level < 3; level++) {
            System.out.println("\nLygis " + (level + 1) + ": Atspekit skaiciu nuo 1 iki " + ranges[level]);
            int randomNumber = random.nextInt(ranges[level]) + 1;
            int guess = 0, attempts = 0;
    
            while (guess != randomNumber) {
                System.out.print("Jusu spejimas: ");
                guess = scanner.nextInt();
                attempts++;
    
                if (guess < randomNumber) {
                    System.out.println("Skaicius per mazas!");
                } else if (guess > randomNumber) {
                    System.out.println("Skaicius per didelis!");
                } else {
                    System.out.println("\n ## Sveikiname! Jus atspejote! Jums prireike " + attempts + " bandymu ##");
                    int points = Math.max(0, 10 - (attempts - maxAttempts[level]));
                    score += points;
                    System.out.println("Jus surinkote " + points + " taskus!");
                }
            }
        }

        System.out.println("\nJusu bendri taskai: " + score);
        return score;
    }

    // 2. Daugybos progrma 
    public static int multiplicationGame(Scanner scanner, Random random) {
        System.out.println("Apskaiciuokite sandauga");
        int score = 0;
    
        for (int level = 1; level <= 3; level++) {
            System.out.println("\nLygis " + level + ":");
    
            if (level == 1) { 
                int num1 = random.nextInt(9) + 1;
                int num2 = random.nextInt(9) + 1;
                score += multiplicationLevel(scanner, num1, num2);
            } else if (level == 2) { 
                int num1 = random.nextInt(9) + 1;
                int num2 = random.nextInt(90) + 10;
                score += multiplicationLevel(scanner, num1, num2);
            } else { 
                int num1 = random.nextInt(9) + 1;
                int num2 = random.nextInt(900) + 100;
                score += multiplicationLevel(scanner, num1, num2);
            }
        }
    
        System.out.println("\nJusu bendri taskai: " + score);
        return score;
    }
    
    public static int multiplicationLevel(Scanner scanner, int num1, int num2) {
        int correctAnswer = num1 * num2;
        int attempts = 0;
        int score = 0;
    
        while (true) {
            System.out.println(num1 + " x " + num2 + " = ?");
            System.out.print("Jusu spejimas: ");
            int userAnswer = scanner.nextInt();
            attempts++;
    
            if (userAnswer == correctAnswer) {
                System.out.println("Teisingai!");
                score = Math.max(0, 10 - (attempts - 1)); 
                System.out.println("Jus surinkote " + score + " taskus.");
                break;
            } else {
                System.out.println("Jusu atsakymas neteisingas, bandykite dar karta");
            }
        }
    
        return score;
    }

    // 3. Atimties ir sumos progrma
    public static int mixedAdditionSubtractionGame(Scanner scanner, Random random) {
        System.out.println("\nApskaiciuokite:");
        int[] ranges = {99, 999, 9999}; 
        int score = 0;
    
        for (int level = 0; level < 3; level++) {
            System.out.println("\nLygis " + (level + 1) + ":");
            int num1 = random.nextInt(ranges[level]) + 1;
            int num2 = random.nextInt(ranges[level]) + 1;
            boolean isAddition = random.nextBoolean();
            int correctAnswer;
            String operation;
    
            if (isAddition) {
                correctAnswer = num1 + num2;
                operation = "+";
            } else {
                correctAnswer = num1 - num2;
                operation = "-";
            }
    
            int attempts = 0;
            int questionScore = 0;
    
            while (true) {
                System.out.println(num1 + " " + operation + " " + num2 + " = ?");
                System.out.print("Jusu atsakymas: ");
                int userAnswer = scanner.nextInt();
                attempts++;
    
                if (userAnswer == correctAnswer) {
                    System.out.println("Teisingai!");
                    questionScore = Math.max(0, 10 - (attempts - 1)); 
                    System.out.println("Jus surinkote " + questionScore + " Taskus.");
                    break;
                } else {
                    System.out.println("Jusu atsakymas neteisingas, bandykite dar karta");
                }
            }
    
            score += questionScore;
        }
    
        System.out.println("\nJusu bendri taskai: " + score);
        return score;
    }
}
