/**
*
* Description of the program goes here  // provide a brief description
*
* @author <John Carrafiell>  // replace <...> with your name
* @version <2/11/14> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {

     public static void main(String[] args) {
         
         Display.openWorld("maps/mountain.map");
   Display.setSize(16, 16);
   Display.setSpeed(8);
   
   Climber tenzing = new Climber(8);
   Climber steven = new Climber(8);
   tenzing.putBeeper();
   tenzing.turnRight();
   steven.turnRight();
   tenzing.move();
   steven.move();
   tenzing.climbUpRight();
   steven.climbUpRight();
   tenzing.climbUpRight();
   steven.climbUpRight();
   tenzing.climbUpRight();
   steven.climbUpRight();
   tenzing.climbDownRight();
   tenzing.climbDownRight();
   tenzing.pickBeeper();
   tenzing.climbUpLeft();
   tenzing.turnAround();
   tenzing.climbUpLeft();
   steven.turnAround();
   tenzing.climbDownLeft();
   steven.climbDownLeft();
   tenzing.climbDownLeft();
   steven.climbDownLeft();
   tenzing.climbDownLeft();
   steven.climbDownLeft();
   tenzing.move();
   steven.move();
   tenzing.putBeeper();
   steven.explode();
   tenzing.explode();

      
  }
     
}