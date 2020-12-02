package Main;

import java.io.File; //imports File
import java.io.IOException; //handles errors
import java.io.FileWriter; //write in files


public class Files {
  String file_name = "StoreShapes.txt";
  String error_message = "An error as occurred.";
  
    public void createShapesFile() {
        try {
            File file = new File(file_name);
            if (file.createNewFile()) {
              System.out.println("File created: " + file.getName());
            }
            else {
              System.out.println("File already exists.");
            }
          }
        catch (IOException error) {
            System.out.println(error_message);
            error.printStackTrace();
        }
    }

    public void writeToShapesFile(String myString) {
        try {
          // FileWriter takes 2 parameters
          // 1 - Name of the file to write to
          // 2 - Boolean. "True" add on to the file. "False" overwrite the file.
          // Default is false.
          FileWriter writef = new FileWriter(file_name, true);
          writef.write(myString + "\n");
          writef.close();
          // System.out.println("Successfully wrote to the file."); 
        } 
        catch (IOException error) {
          System.out.println(error_message);
          error.printStackTrace();
        }
      }
}
