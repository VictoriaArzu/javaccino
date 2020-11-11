package Shapes;
import java.util.Arrays;

public class Shapes{
    public static void main(String[] args) {
      Files openf = new Files();
      //creates StoreShapes.txt file
      openf.createShapesFile();

      SelectShape select = new SelectShape();
      Menu shapeType = select.selectShapes(); 
      int shapeSize = select.selectSize(); 
      

      if (shapeType == Menu.BOX) {
        Box boxObject = new Box(shapeSize);
        boxObject.createBoxShape();
      }
  
      else if (shapeType == Menu.X) {

      }
      
      else if (shapeType == Menu.X_WITH_BOX) {

      }
        

  }
}