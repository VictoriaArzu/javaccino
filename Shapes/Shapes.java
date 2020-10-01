package Shapes;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        //initialization variables and Scanner
        Scanner input = new Scanner(System.in);

        String unknownShape;
        String boxShape = "Box";
        String squareShape = "Square";
        String squareWithBoxShape = "Box with Square";

        //start program
        //desc of program
        System.out.println("This program will draw a shape for the user\nbased on the option they pick.\n\n");

        System.out.println("What shape would you like to draw?\n");
        System.out.println("1. Box\n");
        System.out.println("2. Square\n");
        System.out.println("3. Box with Square\n");
        unknownShape = input.nextLine();
        if (unknownShape.equals(boxShape)) {

        }
        else if (unknownShape.equals(squareShape)) {

        }
        else if (unknownShape.equals(squareWithBoxShape)) {

        }
        else {
           
        }

        
    }
}
