package exercises;

public class ToMilesPerHour {
    public static void main(String[] args) {

        printConversion(95.75);
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
        
    }
    
    public static long milesPerHour(double kilometersPerHour) {
        
        if (kilometersPerHour < 0) {
            return -1;
        } 
        else {
            return Math.round(kilometersPerHour * 0.622);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        milesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour(kilometersPerHour) + " mi/h" );
        }
    }
}
