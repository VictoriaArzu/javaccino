package Main;

import java.util.Arrays;

public class X{
    //instance variables
    int numInRows, numInColumns;

    //constructor; prepares X to take in shapeSize
    public X(int shapeSize) {
      numInRows = shapeSize;
      numInColumns = shapeSize;
    }

    public String toString() {
      return "X of size: " + numInRows;
    }

    public void createXShape() {
      Files writef = new Files();

      System.out.println("You have decided the X Shape with size " + numInColumns);

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
        
      // This code is for printing it all out
      for (int i = 0; i < numInRows; i++) {
        System.out.print(Arrays.toString(array[i]) + "\n");
      }

      //writing it to the file
      writef.writeToShapesFile("\nAn X Shape with " + numInRows + " rows and columns.");
      for (int i = 0; i < numInRows; i++) {
        // what is the data type of: Arrays.toString(array[i]) + "\n"
        // its a string! which is great, because we're passing a string into writeToShapesFile.
        writef.writeToShapesFile(Arrays.toString(array[i]));
      }
        
    }

  }