public class IfThen {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            
            
        }

        int topScore  = 80;
        if (topScore < 100) {
            System.out.println("You got the hight score");
        }

        int secontTopScore = 60;
        if (topScore > secontTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secontTopScore <= 90) {
            System.out.println("Either or both of the conditions are true");
        }

        boolean isCar = false;
        if (!isCar) { // possible to write icCarr == false/true, !=
            System.out.println("This is a car");
        }

        String makeOfCar = "volkswagen";
        boolean isDomestic = makeOfCar == "volkswagen" ? true : false; // if then else

        String s = isDomestic ? "This car is domestic" : "This car is not domestic";// replace the below if statement
        System.out.println(s);

        if (isDomestic) {
            System.out.println("Car is domestic");
        }

        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "Over eighteen" : "Still a kid"; // same as above
        System.out.println("Our client is " + ageText);
    }
}
