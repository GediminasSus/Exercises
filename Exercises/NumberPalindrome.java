package exercises;

public class NumberPalindrome {
    public static void main(String[] args) {
      
        isPalindrome(-121);
    }

    static public boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumner = number;
        if (number < 0 ){
            number *= -1;
            originalNumner *= -1;
        }
        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;
            reverse = reverse * 10;
            reverse+= lastDigit;
        }
        return  (originalNumner == reverse);
    }
    
}
