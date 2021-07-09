package shapes;

import java.util.Arrays;

public class XwBox{
    //instance variables
  int numInRows, numInColumns;

    //constructor; prepares XwBox to take in shapeSize
  public XwBox(int shapeSize) {
      numInRows = shapeSize;
      numInColumns = shapeSize;
  }

  public String toString() {
    return "X with Box of size: " + numInRows;
  }

  public void createXWithBox() {
    Files writef = new Files();

    System.out.println("You have decided the X with Box Shape with size " + numInColumns);

    String[][] array = new String[numInRows][numInColumns];

    // blank slate
    for (int i = 0; (i < numInRows); i++) {
        for (int k = 0; k < numInColumns; k++) {
          array[i][k] = " ";
        }
    }
      
    //diagonal line
    for (int i = 0; i < numInRows; i++) {
        array[i][i] = "*";
    }
    
    //opposite diagonal
    for(int i = 0, k = numInRows - 1; i < numInRows ;i++, k--) {
        array[i][k] = "*";
    }

    // This code will place an X at the first column.
    for (int i = 0; i < numInRows; i++) {
        array[i][0] = "*";
    }

    // This code places an X in the first row.
    for (int i = 0; i < numInRows; i++) {
        array[0][i] = "*";
    }

    // This code places an X in the last row.
    for (int i = 0; i < numInRows; i++) {
        array[numInRows-1][i] = "*";
    }

    //This code places an X in the last column.
    //[0,7],[1,7], [2,7]
    for (int i = 0; i < numInRows; i++) {
        array[i][numInRows-1] = "*";
    }
      
    // This code is for printing it all out
    for (int i = 0; i < numInRows; i++) {
        System.out.print(Arrays.toString(array[i]) + "\n");
    }

    //writing it to the file
    writef.writeToShapesFile("\nA Box with X Shape with " + numInRows + " rows and columns.");
    for (int i = 0; i < numInRows; i++) {
      // what is the data type of: Arrays.toString(array[i]) + "\n"
      // its a string! which is great, because we're passing a string into writeToShapesFile.
      writef.writeToShapesFile(Arrays.toString(array[i]));
    }


  }
}


