public class Introduction{

    public static void main(String[] args) {
        int a = 10; // there are shorter: short = (-32768 to 32767) and byte = (-128 to 127)
        int mini = Integer.MIN_VALUE; int maxi = Integer.MAX_VALUE;
        long lmin = Long.MIN_VALUE; // Jeigu vedi skaiciu i long gale turi parasyti raide l arba L
        long lmax = Long.MAX_VALUE;
        double dmin = Double.MIN_VALUE, dmax = Double.MAX_VALUE; // float or double
        double b = 11.5;
        char cmin = Character.MAX_VALUE;
        char cmax = Character.MIN_VALUE;
        char c = 'c'; //can use code: vietoj c = 'D' galime naudoti koda c = '\u0044' arba c = 68;
        String d = "labas";
        Boolean f = true;
        
        System.err.println("char minimum value = " + cmin + ", maximum value = "+ cmax);
        System.err.println("Double minimum value = " + dmin + ", maximum value = "+ dmax);
        System.err.println("Long minimum value = " + lmin + ", maximum value = "+ lmax + ", has width of " + Long.SIZE);
        System.err.println("Integer minimum value = " + mini + ", maximum value = "+ maxi);
        System.out.println("integer = " + a + ", double = " + b + ", char = " + c + ", String = " + d + ", Boolean = " + f);
        
        // a++; a +=1; a--; a -=1;
        a = a + 2; // (double)(a+2) or (int)(b+0.5)
        b = b + 0.7; //(int)(b + 0.7)
        c = 'b';
        d = "viso";
        f = false;

        System.out.println("integer = " + a + ", double = " + b + ", char = " + c + ", String = " + d + ", Boolean = " + f);

        a++;
        b--;
        c = 'b';
        d = d + d;
        f = !f;
        double g = (a + b);

        System.out.println("integer = " + a + ", double = " + b + ", char = " + c + ", String = " + d + ", Boolean = " + f);
        System.err.println("Suma = "  + (a + b));
        System.err.println(g);

    }
}