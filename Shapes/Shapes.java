import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        //initialization variables and Scanner
        Scanner input = new Scanner(System.in);

        String unknownShape;
        String boxShape = "Box";
        String xShape = "X";
        String squareWithXShape = "Box with X";
        int numInRows, numInColumns;

        //start program
        //desc of program
        System.out.println("This program will draw a shape for the user\nbased on the option they pick.\n\n");

        System.out.println("What shape would you like to draw?\n");
        System.out.println("1. Box");
        System.out.println("2. X");
        System.out.println("3. Box with X");
        unknownShape = input.nextLine();

        System.out.println("How many rows?");
        numInRows = input.nextInt();
        System.out.println("How many columns?");
        numInColumns = input.nextInt();

        if (unknownShape.equals(boxShape)) {
            System.out.println("You have decided the Box Shape with " + numInRows + " rows and " + numInColumns + " columns");

            int[] row = new int[numInRows];
            int[] column = new int[numInColumns];
            int first = row[0];
            int last = row[numInRows-1];

            for(int i = 0; i < numInRows; i++) {
                System.out.println("*");
            }
            
            
        }
        else if (unknownShape.equals(xShape)) {
            System.out.println("You have decided the X Shape with " + numInRows + " rows and " + numInColumns + " columns");

            
            int[] row = new int[numInRows];
            int[] column = new int[numInColumns];
            int first = row[0];
            int last = row[numInRows-1];
            


        }
        else if (unknownShape.equals(squareWithXShape)) {
            System.out.println("You have decided the Box with X Shape with " + numInRows + " rows and " + numInColumns + " columns");

            
            int[] row = new int[numInRows];
            int[] column = new int[numInColumns];
            int first = row[0];
            int last = row[numInRows-1];

        }
        else {
           System.out.println("You have entered invalid input.");
        }

        
    }
}
