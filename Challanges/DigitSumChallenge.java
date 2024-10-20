package challanges;

public class DigitSumChallenge {
    public static void main(String[] args) {
        sumDigits(1234);  
        sumDigits(-125);  
        sumDigits(4); 
        sumDigits(32123); 
    }
    
    public static int sumDigits(int number){
        int sumOfDigits = 0;
        if (number > 0) {
            while (number > 0) {
                sumOfDigits += number % 10;
                number = number / 10;
            }
            System.out.println(sumOfDigits);
        }
        return -1;
        
    }
    
}
