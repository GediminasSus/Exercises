package exercises;

public class TeenNumberChecker {

    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

    }

    public static boolean hasTeen(int a, int b, int c) {
        return ((13 <= a && a <= 19) || (13 <= b && b <= 19) || (13 <= c && c <= 19));
    }
    
    public static boolean isTeen(int age) {
        return (13 <= age && age <= 19);
    }
}
