/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movewithoutgear;

import ch.aplu.robotsim.*;
import ch.aplu.robotsim.NxtRobot.*;



    public class MoveWithoutGear
{
  MoveWithoutGear()  
  {
    TurtleRobot robot=new TurtleRobot();
    robot.forward(100);
    robot.left(45);
    robot.forward(200);
    robot.right(90);
    robot.backward(100);
    robot.exit();
   }
    public static void main(String args[])
    {
     MoveWithoutGear  m=new MoveWithoutGear();
    }
}          

   