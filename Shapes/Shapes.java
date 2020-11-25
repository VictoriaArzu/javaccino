package Shapes;

import java.util.Scanner;

public class Shapes{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //creates StoreShapes.txt file
      Files openf = new Files();
      openf.createShapesFile();

      // initialize variables
      int maxNumShapes = 100;
      int numShape = 0;
      Object[] shapes = new Object[maxNumShapes];
      SelectShape select = new SelectShape();

      // ----- BEGIN LOOP -------
      while(true) {
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

        System.out.println("Do you want to continue? Y or N.");
        String question = input.nextLine();
        if (question.equals("N")) {
          break;
        } 
        else if (question.equals("Y")) {
          continue;
        } 
        else {
          // TODO: Why doesn't this work for invalid input?
          while (!(question.equals("Y")) || !(question.equals("N"))) {
            System.out.println("Please type in correct input.");
            question = input.nextLine();
            System.out.println("You wrote: " + question);
          }
        }
      }
      // ---- END LOOP ------
    }
}
