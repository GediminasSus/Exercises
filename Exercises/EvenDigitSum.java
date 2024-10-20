package exercises;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
            }
        int sumOfEvenDigits = 0;
        while (number > 0){
            int digit = number % 10;
            if (number % 2 == 0) {
                sumOfEvenDigits += digit;
            }
            number /= 10;
        }
    return sumOfEvenDigits;
    }
    
}
