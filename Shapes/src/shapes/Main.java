package shapes;

import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //creates StoreShapes.txt file
      Files openf = new Files();
      openf.createShapesFile();

      // initialize variables
      int maxNumShapes = 100;
      int numShape = 0;
      char repeat;
      String question;


      // ----- BEGIN LOOP -------
      do {
        Object[] shapes = new Object[maxNumShapes];
        SelectShape select = new SelectShape(); 
        Menu shapeType = select.selectShapes();

        int shapeSize = select.selectSize(); 
        

        if (shapeType == Menu.BOX) {
          Box boxObject = new Box(shapeSize);
          boxObject.createBoxShape();
          shapes[numShape] = boxObject;
          System.out.println(shapes[numShape]);
        }
    
        else if (shapeType == Menu.X) {
          X xObject = new X(shapeSize);
          xObject.createXShape();
          shapes[numShape] = xObject;
          System.out.println(shapes[numShape]);
        }
        
        else if (shapeType == Menu.X_WITH_BOX) {
          XwBox xwboxObject = new XwBox(shapeSize);
          xwboxObject.createXWithBox();
          shapes[numShape] = xwboxObject;
          System.out.println(shapes[numShape]);
        }
      
        numShape++;

        // //exit method

        System.out.println("Do you want to continue? Y or N.\n");

        question = input.nextLine();

          while (!(question.equals("Y")) && !(question.equals("N"))) {
            System.out.println("Please type in correct input.");
            question = input.nextLine();
            System.out.println("You wrote: " + question);
          }
        repeat = question.charAt(0);
      }

      while (repeat == 'Y' || repeat == 'y');
      // ---- END LOOP ------
    }
}
