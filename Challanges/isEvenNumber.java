package challanges;

public class isEvenNumber {
    public static void main(String[] args) {
        
        int number = 4;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= 20) {
            number++ ;
            if (!evenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++; 
            if (evenCount >= 5) {
                break;
            }
    }
    System.out.println("Total odd numbers found = " + oddCount);
    System.out.println("Total even numbers found = " + evenCount);
    }
    public static boolean evenNumber (int number) {
        return (number % 2 == 0);
    }

      
    
}
