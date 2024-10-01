package Exercises;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false, 6));
    }

    public static boolean shouldWakeUp(boolean barking, int hoursOfDay) {
        if (hoursOfDay >= 0 && hoursOfDay <=23) {
            if (barking && (hoursOfDay < 8 || hoursOfDay > 22)) {
                return true;
            }
            return false;      
        }
        return false; 
    }
}
