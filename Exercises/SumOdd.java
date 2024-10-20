package exercises;

public class SumOdd {
    public static void main(String[] args) {
    
    sumOdd(100, 1000) ;  
        
    }
    
    public static boolean isOdd(int number) {
        return (number > 0) && (number % 2 != 0);
    }
    
    public static int sumOdd(int start, int end) {
        int sumOfnumbers = 0;    
        if (end >= start && start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfnumbers += i;
                }
            }
        }
        else{ 
            return -1;
        }
        return sumOfnumbers;
    } 


}

