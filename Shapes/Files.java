package Shapes;

import java.io.File; //imports File
import java.io.IOException; //handles errors
import java.io.FileWriter; //write in files


public class Files {
    public void createShapesFile() {
        try {
            File file = new File("StoreShapes.txt");
            if (file.createNewFile()) {
              System.out.println("File created: " + file.getName());
            }
            else {
              System.out.println("File already exists.");
            }
          }
        catch (IOException error) {
            System.out.println("An error occurred.");
            error.printStackTrace();
        }
    }

    public void writeToShapesFile() {
        try {
          // FileWriter takes 2 parameters
          // 1 - Name of the file to write to
          // 2 - Boolean. "True" add on to the file. "False" overwrite the file.
          // Default is false.
          FileWriter writef = new FileWriter("StoreShapes.txt", true);
          writef.write("i am writing to the file\n");
          writef.close();
          System.out.println("Successfully wrote to the file."); 
        } 
        catch (IOException error) {
          System.out.println("An error occurred.");
          error.printStackTrace();
        }
      }
}
