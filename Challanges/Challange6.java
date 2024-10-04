package challanges;

public class Challange6 {
    public static void main(String[] args) {
      
    System.out.println(getDurationString(9000));
    System.out.println(getDurationString(9598));
    System.out.println(getDurationString(-100));
    System.out.println(getDurationString(59, 50));
    System.out.println(getDurationString(0, -10));
    System.out.println(getDurationString(60, 100));
         

    }

    public static String getDurationString (int seconds) {
        if (seconds <0) {
            return "Invalid data for seconds ( " + seconds + " ), must be positive integer value";
        } 

        int minutes = seconds / 60;
        seconds = (seconds % 60);
        return getDurationString(seconds, minutes);
        
    }

    public static String getDurationString (int seconds, int minutes) {
        if (minutes <0) {
            return "Invalid data for minutes ( " + minutes + " ), must be positive integer value";
        }
        
        if (seconds < 0 || seconds > 59 ) {
            return "Invalid data for seconds ( " + seconds + " ), must be between + and 59";        
        } 

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
          
    }
    
}
