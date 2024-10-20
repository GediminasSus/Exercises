package challanges;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int ncount = 0; // skaiciu kiekis ties kuriuo turi nustoti tikrinti
        int numbersToSum = 0; // suma skaiciu kuria reikia rasti

        for (int i = 1; i <=1000; i++) {
            if ((ncount <5) && (i % 3 == 0) && (i % 5 == 0)) { 
                ncount++;
                numbersToSum += i;
                System.out.println(ncount + " number that is divisable from 3 amd 5 = " + i);
            }
            
        }
    System.out.println("Total sum of 5 numbers that are divisable from 3 and 5 = " + numbersToSum);
    }
    
}
