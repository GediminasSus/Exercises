import java.util.Scanner;

public class ReadingUsersInput {
    public static void main(String[] args) {
        
        // int dateOfBirth = Integer.parseInt(usersDateOfBirth); // vercia String i Integer
        // double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear); // vercia String i double);
        // Scanner sc = new Scanner(System.in); // Skaito informacija is konsoles; 
        // Scanner sc = new Scanner(new File("nameOfFileOnFileSystem")); // skaito informacija is failo
        int currentYear = 2022;

        //  System.out.println(getInputFromConsole(currentYear));
        
        System.out.println(getInputFromScanner(currentYear));
    }

    public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hu, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOFBirth = System.console().readLine("What year were you born ? ");
        int age = currentYear - Integer.parseInt(dateOFBirth);

        return "So you are " + age + " years old";

    }

    public static String getInputFromScanner(int currentYear){

        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi, What's your name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

//        String dateOFBirth = System.console().readLine("What year were you born ? ");
        System.out.println("What year were you born?");
        String dateOFBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dateOFBirth);

        return "So you are " + age + " years old";
    }
    
}
