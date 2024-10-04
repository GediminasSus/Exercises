package exercises;

public class AreaCalculator {
    public static void main(String[] args) {
        
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println(area(2.3));
    }

    public static double area(double radius) {
        if (radius <0) {
            return -1;
        }
        return (radius * radius) * Math.PI;
    }

    public static double area(double sideOfrectangle1,double sideOfrectangle2 ) {
        if (sideOfrectangle1 < 0 || sideOfrectangle2 < 0 ) {
            return -1;
        }
        return sideOfrectangle1 * sideOfrectangle2;
    }
    
}
