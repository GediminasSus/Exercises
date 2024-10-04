package challanges;

public class Challange5 {

    public static void main(String[] args) {
        
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");

    }

    static public double convertToCentimeters(int inches) {
        
        return inches * 2.54;

    }

    static public double convertToCentimeters(int feet, int inches) {
        int height = (feet * 12) + inches;
        return convertToCentimeters(height);

    }
    
}
