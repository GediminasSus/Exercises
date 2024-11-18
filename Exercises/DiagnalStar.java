package exercises;

public class DiagnalStar {
    public static void main(String[] args) {
        printSquareStar(5);  
        printSquareSta(5);
    }

    public static void printSquareStar (int number) {
        int rCount = number;
        int cCount = number;
        if (number < 5) {
            System.out.println("Invalid Value");
        }else {
        for (int i = 1; i <= rCount; i++){ // skaiciuja eilutes
            for (int y = 1; y <= cCount; y++){ // skaiciuoja stulpelius
                if ( i == 1) { // jeigu pirma eilute
                    if (y < cCount){ // stulpelis ne paskutinis rasom "*" 
                        System.out.print("*");
                    }
                    if (y == cCount){// jei pasiekem paskuti stulpeli rasom pritln kad nukeltu i sekancia eilute
                        System.out.println("*");
                    }
                    //continue;    
                }
                
                if (i > 1 && i < rCount) { // jeigu ne pirma ir ne paskutine eilute
                    if (y == 1){ // jei pirmas stulpelis
                        System.out.print("*");
                        continue;
                    }
                    if (y == i ) { // jeigu stulpelis atitinka eilute
                        System.out.print("*");
                        continue;    
                    }   
                    if (y == rCount - i + 1) { // kad rasyti is kitos puses eiluciu skaicius - dabartine eilute + vienas
                        System.err.print("*");
                        continue;
                    }   
                    if (y == cCount){// jei paskutinis stulpelis
                        System.out.println("*");
                        continue;    
                    }
                    if (y != i) {
                        System.out.print(" ");
                    }
                    //continue;
                }
                if (i == rCount) {
                        System.out.print("*"); // uzpildom paskutine eilute simboliais "*"
                    }    
                }
            }
        }
    }
    private static final String STAR = "*";
    private static final String SPACE = " ";
 
    public static void printSquareSta(int number) {
        
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
 
        // Iterate over each row
        for (int row = 1; row <= number; row++) {
            // Iterate over each column
            for (int column = 1; column <= number; column++) {
                // if either row or column equals 1, assign true to isFirstRowOrColumn.
                boolean isFirstRowOrColumn = row == 1 || column == 1;
                // if either row or column equals number, assign true to isLastRowOrColumn.
                boolean isLastRowOrColumn = row == number || column == number;
                // if either row equals column, or column equals number minus row plus 1, assign true to isFirstRowOrColumn.
                boolean isDiagonal = (row == column) || (column == (number - row + 1));
 
                if (isFirstRowOrColumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print(STAR);
                } else {
                    System.out.print(SPACE);
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
    
}
