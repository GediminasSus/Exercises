package exercises;

public class MinutesToDaysAndYears {
    public static void main(String[] args) {

        System.out.println(date(525600));
        System.out.println(date(1051200));
        System.out.println(date(561600));
        System.out.println(date(-525600));

    }

    public static String date(long minutes) {
        if (minutes < 0) {
            return "void";
        }
        long days = minutes / 1440;
        long years = days / 365;
        long remainingDays = days % 365;
        return minutes + " min = " + years + " y and " + remainingDays + " d";

    }
    
}
