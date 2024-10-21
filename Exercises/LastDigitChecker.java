package exercises;

public class LastDigitChecker {
    public static void main(String[] args) {
    
    System.out.println(hasSameLastDigit(22, 23, 34));    

    }

    public static boolean hasSameLastDigit (int number1, int number2, int number3) {
        if (number1 < 10 || number1 > 1000 || number2 < 10 || number2 > 1000 || number3 < 10 || number3 > 1000){
            return false;
        }
        int lastDigitNumber1 = number1 % 10;
        int lastDigitNumber2 = number2 % 10;
        int lastDigitNumber3 = number3 % 10;
        System.out.println(lastDigitNumber1 + " " + lastDigitNumber2 + " " + lastDigitNumber3);

        return (lastDigitNumber1 == lastDigitNumber2 || lastDigitNumber1 == lastDigitNumber3|| lastDigitNumber2 == lastDigitNumber3);
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <=1000);
    }
    
}
