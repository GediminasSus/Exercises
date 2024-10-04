package exercises;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.17565, -3.17522));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
        
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
         double nNumber1 = (int) (number1 * 1000);
         double nNumber2 = (int) (number2 * 1000);
            if (nNumber1 == nNumber2) {
            return true;
        }
        return false;
    }
}
