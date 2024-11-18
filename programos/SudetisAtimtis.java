package programos;

import java.util.Random;
import java.util.Scanner;

public class SudetisAtimtis {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        
        int number1 = random.nextInt(100) + 1;
        int number2 = random.nextInt(100) + 1;

        
        boolean isAddition = random.nextBoolean(); // atsitiktinai parenka true or false 

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
            System.out.println("Jusu atsakymas teisingas !");
        } else {
            System.out.println("Jus suklydote!. Teisingas atsakymas: " + correctAnswer);
        }

        
        scanner.close();
    }
}

