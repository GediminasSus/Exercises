public class Switch {
    public static void main(String[] args) {
        
       /*  int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or2");
        } */

        int switchValue = 4; // switch can only be used with types: byte, short, int, char, String and enum

        switch(switchValue) { //traditional switch
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, 5");
                break;
        }

        switch(switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was " + switchValue);
                System.out.println("Value was " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, 5");
        }
    }
     
    public static String getQuarter(String month) {
        return switch(month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOWEMBER", "DECEMBER" -> "4th";
            default -> "bad"; //{yield} insted of return 
        };
    }
}
