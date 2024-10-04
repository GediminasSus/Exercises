package challanges;

public class Challange2 {
    public static void main(String[] args) {
        double a = 20.00d; double b = 80.00d;
        double c = (a + b)*100.00d;
        double remainder = c % 40.00d;
        System.out.println(remainder);
        boolean e = remainder == 0.00 ? true : false ;
        System.out.println(e);
        if (!e) {
            System.out.println("got some reminder");
        }
    }
}
