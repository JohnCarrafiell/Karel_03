/**
*
* Description of the program goes here  // provide a brief description
*
* @author <John Carrafiell>  // replace <...> with your name
* @version <2/11/14> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Climber extends Athlete 
{
   public Climber ()
   {
      super();
   }
   public Climber (int x)
   {
      super (x, 1, Display.NORTH, 1);
   }
   public void climbUpRight()
   {
   turnLeft();
   move();
   move();
   turnRight();
   move();
   }
   public void climbUpLeft()
   {
   turnLeft();
   move();
   move();
   turnLeft();
   move();
   }
   public void climbDownRight()
   {
   move();
   turnRight();
   move();
   move();
   turnLeft();
   }
   public void climbDownLeft()
   {
   move();
   turnLeft();
   move();
   move();
   turnRight();
   }
      //pseudocode: tL, m, m, tR, m     
}


