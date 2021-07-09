package shapes;

import java.util.Scanner;

enum Menu {
  BOX, X, X_WITH_BOX
}

public class SelectShape {
  Scanner input = new Scanner(System.in);
  private int numInRows;
  private int numInColumns;
  private String exit = "-1";

  public Menu selectShapes() {
    String unknownShape;

    System.out.println("What shape would you like to draw? Type a matching number or name.\n");
    System.out.println("1. Box");
    System.out.println("2. X");
    System.out.println("3. Box with X");

    unknownShape = input.nextLine();

    if (unknownShape.equals(exit)) {
      System.out.print("Terminated succesfully!");
      System.exit(-1);
    }

    switch(unknownShape) {
      case "1":
      case "Box":
      case "box":
        return Menu.BOX;
      case "2":
      case "X":
      case "x":
        return Menu.X;
      case "3":
      case "Box with X":
      case "box with X":
      case "Box with x":
      case "box with x":
        return Menu.X_WITH_BOX;
      default:
        return null;
    }
  }

  public int selectSize() {
    int numInRows, numInColumns;

    System.out.println("Enter a value between 1 through 10 " + "for the row.\n" + "Enter -1 to terminate successfully.\n");
    System.out.println("How many rows?\n");
    numInRows = input.nextInt();
    String newLine = input.nextLine(); //skip this line, serves no purpose for input
    
    while (numInRows == -1) {
      System.out.println("Terminated successfully.");
      System.exit(-1);
    }


    while (numInRows < 1 || numInRows > 10) {
      System.out.println("Size is invalid\n" + "Try a value between 1 through 10.\n");
      numInRows = input.nextInt();

      while (numInRows== -1){
        System.out.println("Terminated succesfully!");
        System.exit(-1);
      }

    }

    numInColumns = numInRows;

    return numInColumns;
  }
}
