package exercises;

public class DNumberToWords {
    public static void main(String[] args) {
     
    numberToWords(0);    
    System.out.println(reverse(0));
    System.out.println(getDigitCount(0));
    }

    public static void numberToWords(int number) {
        int reveseNumber = reverse(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        }else if (number == 0) {
            System.out.println("Zero");
        }else{
            while (number > 0) {
                int digitToWord = reveseNumber % 10;
                reveseNumber /= 10;
                number /= 10;
                switch (digitToWord) {
                    case 1 -> System.out.println("One");   
                    case 2 -> System.out.println("Two");    
                    case 3 -> System.out.println("Three");    
                    case 4 -> System.out.println("Four");    
                    case 5 -> System.out.println("Five");    
                    case 6 -> System.out.println("Six");    
                    case 7 -> System.out.println("Seven");    
                    case 8 -> System.out.println("Eight");    
                    case 9 -> System.out.println("Nine");    
                    default -> System.out.println("Zero");
                }
            }
        }
        for (int i = 0; i != (getDigitCount(number) - (getDigitCount(reverse(number)))); i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse (int number){
        int newNumber = 0;
        for (int i = 0; i != number; number /= 10) {
            newNumber = (newNumber * 10) + (number % 10);
        }
        return newNumber;
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        int digitCount = 0;
        do { 
            digitCount += 1;
            number /= 10;
        } while (number > 0);
        return digitCount;
    }
}
