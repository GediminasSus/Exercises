package programos;

import java.util.Random;
import java.util.Scanner;

public class Daugyba {

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        
        int number1 = random.nextInt(10) + 1;
        int number2 = random.nextInt(10) + 1;

        System.out.println("Apskaiciuokite sandauga");
        System.out.println(number1 + " x " + number2 + " = ?");
        System.out.print("Jusu atsakymas: ");
        int userAnswer = scanner.nextInt();

        int correctAnswer = number1 * number2;
        if (userAnswer == correctAnswer) {
            System.out.println("Jusu atsakymas teisingas !");
        } else {
            System.out.println("Jus suklydote!. Teisingas atsakymas: " + correctAnswer);
        }

        scanner.close();
    }
    
}
