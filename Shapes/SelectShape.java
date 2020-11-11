package Shapes;

import java.util.Scanner;

enum Menu {
  BOX, X, X_WITH_BOX
}

public class SelectShape {
  Scanner input = new Scanner(System.in);

  public Menu selectShapes() {
    String unknownShape;

    System.out.println("What shape would you like to draw? Type in 1, 2, or 3.\n");
    System.out.println("1. Box");
    System.out.println("2. X");
    System.out.println("3. Box with X");

    unknownShape = input.nextLine();

    switch(unknownShape) {
      case "1":
        return Menu.BOX;
      case "2":
        return Menu.X;
      case "3":
        return Menu.X_WITH_BOX;
      default:
        return null;
      }
  }

  public int selectSize() {
    int numInRows, numInColumns;

    System.out.println("This shape will be shown on a square grid. How many columns and rows?");
    numInRows = input.nextInt();
    numInColumns = numInRows;

    return numInColumns;
  }
}
