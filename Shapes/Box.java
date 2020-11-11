package Shapes;

import java.util.Arrays;

public class Box{
    //instance variables
    int numInRows, numInColumns;

    //constructor; prepares Box to take in shapeSize
    public Box(int shapeSize) {
      numInRows = shapeSize;
      numInColumns = shapeSize;
    }

    public void createBoxShape() {
      Files writef = new Files();

      System.out.println("You have decided the Box Shape with size " + numInColumns);

      String[][] array = new String[numInRows][numInColumns];

      // blank slate
      for (int i = 0; (i < numInRows); i++) {
          for (int k = 0; k < numInColumns; k++) {
            array[i][k] = " ";
          }
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
      writef.writeToShapesFile("\nA Box Shape with " + numInRows + " rows and columns.");
      for (int i = 0; i < numInRows; i++) {
        // what is the data type of: Arrays.toString(array[i]) + "\n"
        // its a string! which is great, because we're passing a string into writeToShapesFile.
        writef.writeToShapesFile(Arrays.toString(array[i]));
      }

  }
}
