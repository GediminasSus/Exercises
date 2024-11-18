package exercises;

public class DFlourPackProblem { 
    public static void main(String[] args) {
        System.out.println(canPack(6, 2, 17));
    }
    
    public static boolean  canPack(int bigCount, int smallCount, int goal){
        int bigWeight = 5;
        int totalBigWeight = bigCount * bigWeight;
        int remainingWeight = goal % bigWeight;
     //   if (goal % bigWeight == 0){
     //       return true;
     //   }
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if (totalBigWeight == goal || smallCount == goal) {
            return true;
        }
        if (totalBigWeight >= goal) {
            return (remainingWeight <= smallCount);
        }
        if (totalBigWeight <= goal) {
            return (totalBigWeight + smallCount >= goal);
        }
        return false;   
    }
    
}
