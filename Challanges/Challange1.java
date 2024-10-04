package challanges;

public class Challange1 {
    
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        int c = 50;
        long e = 50000L;
        long d = (long)(e + 10*(a+b+c));
        // kitas chalange
        int p = 200; // or double = 200d;
        double ratio = 0.45359237;
        double k = p * ratio;


        System.out.println("pound = " + p + ", converting to kilograms = " + k);
        // kitas chalange
        System.out.println("byte = " + a + ", short = " + b + ", int = " + c + ", long = " +d);
    }
}
