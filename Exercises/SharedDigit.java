package exercises;

public class SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(12, 23);
    }
    
    public static boolean hasSharedDigit(int number1, int number2){
        
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99){
            return false;
        }

        int digit1Number1 = number1 % 10;
        int digit2Number1 = number1 / 10;
        int digit1Number2 = number2 % 10;
        int digit2Number2 = number2 / 10;

        return  (digit1Number1 == digit1Number2 || digit1Number1 == digit2Number2 || digit2Number1 == digit1Number2 || digit2Number1 == digit2Number2);
    }
}
